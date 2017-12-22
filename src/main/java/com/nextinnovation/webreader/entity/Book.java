package com.nextinnovation.webreader.entity;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */

public class Book implements java.io.Serializable {

	// Fields

	private String bookId;
	private User user;
	private String bookname;
	private String auther;
	private String imgurl;
	private String bookurl;
	private String sth;

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** minimal constructor */
	public Book(User user) {
		this.user = user;
	}

	/** full constructor */
	public Book(User user, String bookname, String auther, String imgurl,
			String bookurl, String sth) {
		this.user = user;
		this.bookname = bookname;
		this.auther = auther;
		this.imgurl = imgurl;
		this.bookurl = bookurl;
		this.sth = sth;
	}

	// Property accessors

	public String getBookId() {
		return this.bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getBookname() {
		return this.bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuther() {
		return this.auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getImgurl() {
		return this.imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getBookurl() {
		return this.bookurl;
	}

	public void setBookurl(String bookurl) {
		this.bookurl = bookurl;
	}

	public String getSth() {
		return this.sth;
	}

	public void setSth(String sth) {
		this.sth = sth;
	}

}