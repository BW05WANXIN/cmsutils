/**
 * 
 */
package com.bw.wanxin.test;

import java.util.Properties;

import org.junit.Test;

import com.bw.wanxin.FileUtils;

/**
 * @author 926474
 *
 */
public class TestFileUtils {
	
	@Test
	public void testDelFile() {
		FileUtils.delFilePath("F:\\demoDel");
	}
	
	/**
	 * 获取计算机的属性
	 */
	@Test
	public void testPro() {
		Properties properties = System.getProperties();
		properties.forEach((key,value)->{
			System.err.println("key is :"+key);
			System.err.println("value is :"+value);
		});
	}

}
