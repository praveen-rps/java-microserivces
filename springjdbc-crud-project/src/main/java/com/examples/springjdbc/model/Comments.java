package com.examples.springjdbc.model;


public class Comments {
	
	int cid;
	
	String comment;
	
	String commenter;
	
	int pid;
	
	public Comments() {
		super();
	}
	
	public Comments(int cid, String comment, String commenter, int pid) {
		super();
		this.cid = cid;
		this.comment = comment;
		this.commenter = commenter;
		this.pid = pid;
	}
	// getter and setter methods

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommenter() {
		return commenter;
	}

	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Override
	public String toString() {
		return "Comments [cid=" + cid + ", comment=" + comment + ", commenter=" + commenter + ", pid=" + pid + "]";
	}

}
