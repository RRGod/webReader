$(function(){
	$("#addBook").click(function(){
		var uid = $("input[name=user_id]").val();
		window.location = "book/add.jsp?user_id="+uid;
	})
	.css("cursor","pointer");
	//删除书籍
	/*$("#deleteBook").click(function(){
		window.location = "delete";
	});*/
});

function goto1(id){
	location = "book.jsp?id="+id;
}