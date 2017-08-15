package com.hyooc.base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		   Set<String>  set=new HashSet();
		   set.add("abc");
		   set.add("cde");
		   set.add("efg");
		   set.add("fgh");    
		   set.add("abc"); //重复的abc,set会自动将其去掉   
		   
		   List<String> list = new ArrayList<String>();
		   list.add("abc");
		   list.add("cc");
		   set.addAll(list);
		   System.out.println("size="+ set.size() );
	}

}
