/**
 * 
 */
package com.bw.wanxin;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 926474
 *
 */
public class DateUtil {
	
	public static int getAge(Date birthday) {
		// 日历类 calendar
		Calendar instance = Calendar.getInstance();
		instance.setTime(birthday);
		
		// 得到出生的年月日
		int birthYear = instance.get(Calendar.YEAR);
		int birthMonth = instance.get(Calendar.MONTH);
		int birthDate = instance.get(Calendar.DAY_OF_MONTH);
		
		// 获取当前的年月日
		instance.setTime(new Date());
		int currentYear = instance.get(Calendar.YEAR);
		int currentMonth = instance.get(Calendar.MONTH);
		int currentDate = instance.get(Calendar.DAY_OF_MONTH);
		
		// 开始计算
		int age = currentYear-birthYear;
		if (currentMonth<birthMonth) {
			age--;
		}else if(currentMonth==birthMonth && currentDate<birthDate) {
			age--;
		}
		
		return age;
		
	}

}
