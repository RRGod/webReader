// by zhangxinxu welcome to visit my personal website http://www.zhangxinxu.com/
// zxx.drag v1.0 2010-03-23
var params={left:0,top:0,currentX:0,currentY:0,flag:false};
var getCss=function(b,a)
{return b.currentStyle?b.currentStyle[a]:document.defaultView.getComputedStyle(b,false)[a];};
function getParam(){
	var C1=window.location.href.split("?")[1];
	return C1;
}
function sleep(millis){
	var njf1 = njen(this,arguments,"millis");
	nj:while(1) {
	try{switch(njf1.cp) { 
	case 0:njf1._notifier=NjsRuntime.createNotifier();
	setTimeout(njf1._notifier,njf1._millis);
	njf1.cp = 1;
	njf1._notifier.wait(njf1);
	return;
	case 1:break nj;
	}} catch(ex) { 
	if(!njf1.except(ex,1)) 
	return; 
	}} 
	njf1.pf();
	}
var startDrag=function(a,b)
{
	if(getCss(b,"left")!=="auto"){
		params.left=getCss(b,"left");
	}
	if(getCss(b,"top")!=="auto"){
		params.top=getCss(b,"top");
	}
	a.onmousedown=function(c){
		params.flag=true;
		if(!c){
			c=window.event;
			a.onselectstart=function(){
				return false;
			};
		}
		var d=c;
		params.currentX=d.clientX;
		params.currentY=d.clientY;
	};
	document.onmouseup=function(){
		params.flag=false;
		if(getCss(b,"left")!=="auto"){
			params.left=getCss(b,"left");
		}
		if(getCss(b,"top")!=="auto"){
			params.top=getCss(b,"top");
		}
	};
	document.onmousemove=function(h){
		var i=h?h:window.event;
		if(params.flag){
			var d=i.clientX,c=i.clientY;
			var g=d-params.currentX,f=c-params.currentY;
			b.style.left=parseInt(params.left)+g+"px";
			b.style.top=parseInt(params.top)+f+"px";
		}
	};
			
};

function divMethod(){
	var div2 = document.getElementById("div_display");
	startDrag(div2,div2);
	//����
	move(div2,'opacity',100,function(){
		move(div2,'height','360');
	 }
	);
	//��¼�����ʾ
	var span=document.querySelector('.close_span');  //�رա�
	var oA=document.querySelector('.username1'); //  ��¼
	var zZ=document.querySelector('.zZ'); //���ֲ�div
	span.onclick=function(){
		div2.style.display='none';
		div2.style.height='60px';
		div2.style.opacity=0;
		zZ.style.display='none';
	};
	
	oA.onclick=function(){
		zZ.style.display='block';
		div2.style.display='block';
		move(div2,'opacity',100,function(){
			move(div2,'height','360');
		 }
		);
	};
		
}
//��ȡ��ʽ
function getStyle(obj,attr){
	if(obj.currentStyle){
		return obj.currentStyle[attr];
	}else{
		return getComputedStyle(obj,false)[attr];
	}
}
//�˶�����
function move(obj,attr,iTarget,fn){
	clearInterval(obj.timer);
	obj.timer=setInterval(function(){
		var iCur;
		if( attr=='opacity' )
		{
			iCur=parseInt( parseFloat( getStyle(obj,attr) )*100 );
		}else{
			iCur=parseInt( getStyle(obj,attr) );
		}
		var iSpeed=(iTarget-iCur)/8;
		iSpeed=iSpeed>0?Math.ceil(iSpeed):Math.floor(iSpeed);
		if(iCur==iTarget){
			clearInterval(obj.timer);
			fn && fn(); 
		}else{
			if(attr=='opacity'){
				obj.style.opacity=(iCur+iSpeed)/100;
			}else{
				obj.style[attr]=iCur+iSpeed+'px';
			}
		}
	},30);
}
