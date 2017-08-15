package com.hyooc.base;

public class StringTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		if("".equals(null)){
			System.out.println("is null");
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0 ;i<3; i++){
			sb.append("xx"+i);
			sb.append("&&");
		}
		System.out.println(sb.toString());
		
		sb = sb.delete(sb.length()-2,sb.length());
		System.out.println(sb.toString());
	}

}
