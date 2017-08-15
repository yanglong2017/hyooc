package com.hyooc.base;

import java.util.ArrayList;
import java.util.List;

public class DaysTest {

	public static void main(String[] args) {

		List<Integer> days = new ArrayList<Integer>();
		repush(3, days);
		repush(20, days);
		System.out.println(days.toString());
	}

	private static void repush(int day,List<Integer> days){
		int size = days.size()+1;
		if(day < size)  return;
		for(int i=size;i<day;i++){
			days.add(i);
		}
	}
}
