package com.hyooc.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) throws ParseException {
	/*	Calendar now = Calendar.getInstance();  
        System.out.println("年: " + now.get(Calendar.YEAR));  
        System.out.println("月: " + (now.get(Calendar.MONTH) + 1) + "");  
        System.out.println("日: " + now.get(Calendar.DAY_OF_MONTH));  
        System.out.println("时: " + now.get(Calendar.HOUR_OF_DAY));  
        System.out.println("分: " + now.get(Calendar.MINUTE));  
        System.out.println("秒: " + now.get(Calendar.SECOND));  
        System.out.println("当前时间毫秒数：" + now.getTimeInMillis());  
        System.out.println(now.getTime());  
  
        Date d = new Date();  
        System.out.println(d);  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String dateNowStr = sdf.format(d);  
        System.out.println("格式化后的日期：" + dateNowStr);  
          
        String str = "2012-1-13 17:26:33";  //要跟上面sdf定义的格式一样  
        Date today = sdf.parse(str);  
        System.out.println("字符串转成日期：" + today);  */
        
		Calendar  cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		/*Date date = null;
		for(int i=1;i<=31;i++){
			String str = "2017-7-"+i;
			date = format.parse(str);
			System.out.println("  "+format.format(date)+"**"+date.getDay());
			
			cal.setTime(date);
			System.err.println(format.format(cal.getTime())+",,"+cal.get(Calendar.DAY_OF_MONTH));
		}*/
		cal.set(Calendar.DATE, 1);
		Date s = cal.getTime();
		System.out.println("本月第一天"+format.format(s));
		
		
		cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
		Date e = cal.getTime();
		System.out.println("本月第一天"+format.format(e));
	}

}
