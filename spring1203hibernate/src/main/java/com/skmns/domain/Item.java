package com.skmns.domain;

import lombok.Data;

@Data
//getter, setter, toString, equals, hashcode메소드 생성 
public class Item {
	
	private int code;
	private String name;
	private int price;
	private String manufacture;
	

}
