package com.nextinnovation.webreader.action;

import com.nextinnovation.webreader.entity.Book;
import com.nextinnovation.webreader.entity.User;
import com.nextinnovation.webreader.service.BookService;
import com.nextinnovation.webreader.util.UploadUtils;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BookAction extends BaseAction<Book> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BookService bookService;
	
	
	private File uploadImg;//用户上传文件，名字要与页面上file的name一致
	private String uploadImgContentType;//用户上传的文件的类型，名字  nameContentType
	private String uploadImgFileName;//用户上传的文件的文件名,名字 nameFileName
	
	private List<File> fileselect; // 上传的文件
    private List<String> fileselectContentType; // 文件名称
    private List<String> fileselectFileName; // 文件类型

	private Integer user_id;

	public String add(){
		String imgName = UploadUtils.generateRandonFileName(uploadImgFileName);
		String imgpath = ServletActionContext.getServletContext().getRealPath("/upload");
		imgpath = imgpath.concat(UploadUtils.generateRandomDir(imgName)).concat("/").concat(imgName);
		String saveImgPath = "upload".concat(UploadUtils.generateRandomDir(imgName)).concat("/").concat(imgName);
		
		/*String fileName = UploadUtils.generateRandonFileName(fileselectFileName);
		String path = ServletActionContext.getServletContext().getRealPath("/upload");
		path = path.concat(UploadUtils.generateRandomDir(fileName)).concat("/").concat(fileName);
		String savePath = UploadUtils.generateRandonFileName(fileselectFileName);*/
		
		
		User user = new User();
		user.setUserId(user_id);
		model.setUser(user);
		model.setImgurl(saveImgPath);
		//model.setBookurl(savePath);
		try {
			FileUtils.copyFile(uploadImg, new File(imgpath));
			//FileUtils.copyFile(fileselect, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bookService.add(model);
		
		return "addSuccess";
	}
	
	public String findAll(){
		List<Book> list = bookService.findAll();
		pushToValueStackRoot(list);
		return "returnIndexJsp";
	}
	
	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public File getUploadImg() {
		return uploadImg;
	}

	public void setUploadImg(File uploadImg) {
		this.uploadImg = uploadImg;
	}

	public String getUploadImgContentType() {
		return uploadImgContentType;
	}

	public void setUploadImgContentType(String uploadImgContentType) {
		this.uploadImgContentType = uploadImgContentType;
	}

	public String getUploadImgFileName() {
		return uploadImgFileName;
	}

	public void setUploadImgFileName(String uploadImgFileName) {
		this.uploadImgFileName = uploadImgFileName;
	}

	

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public List<File> getFileselect() {
		return fileselect;
	}

	public void setFileselect(List<File> fileselect) {
		this.fileselect = fileselect;
	}

	public List<String> getFileselectContentType() {
		return fileselectContentType;
	}

	public void setFileselectContentType(List<String> fileselectContentType) {
		this.fileselectContentType = fileselectContentType;
	}

	public List<String> getFileselectFileName() {
		return fileselectFileName;
	}

	public void setFileselectFileName(List<String> fileselectFileName) {
		this.fileselectFileName = fileselectFileName;
	}

	

}
