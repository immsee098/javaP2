package com.java0923;

public class Test2 {

	public static void main(String[] args) {
		String[] a= {"Hello.java","text.hwp",  "member.js"};
		String name ="";
		String type = "";
		for(String n:a) {
			int dot = n.lastIndexOf(".");
			String name2 = n.substring(0,dot);
			String type2 = n.substring(dot+1);
			name += (name2+" ");
			type += (type2+" ");
		}
		System.out.println(name);
		System.out.println(type);

	}

}
