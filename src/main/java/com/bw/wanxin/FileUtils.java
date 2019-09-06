/**
 * 
 */
package com.bw.wanxin;

/**
 * @author 926474
 *
 */
public class FileUtils {
	
	
	
	public static String getSuffix(String fileName) {
		
		int dotIndex = fileName.lastIndexOf('.');
		// 没有扩展名
		if (dotIndex<0) {
			return "";
		}
		// 最后一位是'.'
		if (dotIndex>=fileName.length()) {
			return "";
		}
	
		return fileName.substring(dotIndex);
		
		//return fileName.substring(fileName.lastIndexOf('.'));
	}

}
