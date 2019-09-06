/**
 * 
 */
package com.bw.wanxin.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.bw.wanxin.DateUtil;

/**
 * @author 926474
 *
 */
public class TestDateUtils {
	
	@Test
	public void testgetMonthEnd() {
		Date end = DateUtil.getMonthEnd(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(end));
	}

}
