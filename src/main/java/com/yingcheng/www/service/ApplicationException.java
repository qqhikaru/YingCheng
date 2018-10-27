package com.yingcheng.www.service;

public class ApplicationException extends RuntimeException {
	ApplicationException(){
		
	};
	ApplicationException(String message){
		super(message);
	}
}
