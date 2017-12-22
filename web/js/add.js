
$(function() {
    init();
})

function init(){
    setProgressBar(0);
    $("#bookname").change(function () {
        $("#bookname1").html($(this).val());
    });
    $("#sth").change(function () {
        $("#sth1").html($(this).val());
    });

    $("#becomeNew").click(function () {
        $("#bookname1").html("书籍名称");
        $("#sth1").html("Socket 编程让你沮丧吗？ " +
            "我将和所有人共享我的知识了。 如果你了解 C 语言并。");
        $("#imgurl1").attr("src", "../img/1.jpg");
    });
    $('#uploaderImg').uploader({
        file_data_name:'uploaderImg',
        autoUpload: true,            // 当选择文件后立即自动进行上传操作
        url: 'book_addImg'  // 文件上传提交地址
    });
    $('#uploaderBook').uploader({
        file_data_name:'uploaderBook',
        autoUpload: false,            // 当选择文件后立即自动进行上传操作
        url: 'book_addImg'  // 文件上传提交地址
    });

    $('#nextButton').click(function(){
        nextButton();
    });

    $('#preButton').click(function(){
       preButton();
    });
}
function setProgressBar(status){
    var progressBar = $('.progress-bar');
    if(status == 1){
        progressBar.css('width','34%');
        progressBar.html('34%');
    }else if(status == 2){
        progressBar.css('width','67%');
        progressBar.html('67%');
    }else if(status == 3){
        progressBar.css('width','100%');
        progressBar.html('100%');
    }else if(status == 0){
        progressBar.css('width','1%');
        progressBar.html('1%');
    }
}
function showButton(status){
    var preButton = $('#preButton');
    var nextButton = $('#preButton');
    if(status == 0){
        preButton.css('display','none');
        nextButton.css('left','40%');
    }
}

function preButton(){
    var uDiv1 = $('#uploadBookInformationDiv');
    var uDiv2 = $('#uploadImgDiv');
    var uDiv3 = $('#uploadBookDiv');
    if(uDiv1.css('display')=='block'){
       // uDiv1.css('display','none');
    }else if(uDiv2.css('display')=='block'){
        uDiv2.css('display','none');
        uDiv1.css('display','block');
    }else if(uDiv3.css('display')=='block'){
        uDiv3.css('display','none');
        uDiv2.css('display','block');
    }else{
        uDiv3.css('display','block');
    }
}

function nextButton(){
    var uDiv1 = $('#uploadBookInformationDiv');
    var uDiv2 = $('#uploadImgDiv');
    var uDiv3 = $('#uploadBookDiv');
    if(uDiv3.css('display')=='block'){
        setProgressBar(3);
    }else if(uDiv2.css('display')=='block'){
        uDiv3.css('display','block');
        setProgressBar(2);
    }else if(uDiv1.css('display')=='block'){
        uDiv2.css('display','block');
        setProgressBar(1);
    }
}

function saveBook(){

}