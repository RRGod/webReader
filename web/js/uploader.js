function setUploaderMouse(id,fType){
    var uploadDive1 = id + " .dive1";
    var uploadDivHover = id + " .divHover";
    var uploadFile = id + "uploader";
    uploaderProduce(id,fType);
    $(uploadDive1).on({
        mouseover:function(){
            $(uploadDive1).css("backgroundColor","#286090");
        },
        mouseout:function(){
            $(uploadDive1).css('backgroundColor',"#337ab7");
        }
    });
    $(uploadDivHover).on({
        mouseover:function(){
            $(uploadDivHover).css("color","black");
        } ,
        mouseout:function(){
            $(uploadDivHover).css("color","#ddd");
        }
    });

}

//将上传的文件保存到上传数组里
var fileData = new FormData();
function check(id){
    var file = document.querySelector('#'+id);
    fileData.append('data'+id,file.files[0]);
    console.log(fileData.get("data"));
    /*console.log(file.files[0]);
    console.log(file.files[0].name);*/
}
function showSth(id){
    var uploader = document.querySelector('#'+id).files[0];
    if(uploader != null){
        // uploader.
    }
    console.log(fileData);
}
function uploaderProduce(id,fType){
    $(id)
        .append("<div class='divHover'>" +
            "<span class=\"glyphicon glyphicon-book icoCss\" style='position: relative;right: 100px;' ></span>" +
            "<font style='position: relative;\n" +
            "    top: 10%;'>请上传文件</font>" +
            "</div>")
        .append("<div class=\"dive1\">" +
                    "提交 " +
                    "<input type=\"file\" class=\"uploader\" name=\"uploadImg\" " +
                    "id=\"uploader\" onchange=\"check(this.id)\" accept=\""+fType+"\">\n" +
                "</div>");
}