package com.ciq.model;

public class ResponseBean {

	private int statuscode;
	private Object msg;
	public ResponseBean() {
		// TODO Auto-generated constructor stub
	}
	
	public ResponseBean(int statuscode, Object msg) {
		super();
		this.statuscode = statuscode;
		this.msg = msg;
	}

	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public Object getMsg() {
		return msg;
	}
	public void setMsg(Object msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "ResponseBean [statuscode=" + statuscode + ", msg=" + msg + "]";
	}
}
