/**
 * 
 */
package com.bw.wanxin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author 926474
 *
 */
public class FileUtils {
	
	public static Logger logger=Logger.getLogger(FileUtils.class);
	
	
	
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
	
	
	/**
	 * 删除文件 若有目录则删除子目录中所有文件
	 * 使用递归删除
	 * @param path
	 */
	public static void delFilePath(String fileName) {
		File file = new File(fileName);
		if (!file.exists()) {
			return;// 不存在直接返回
		}
		if(file.isFile()) {
			// 是文件直接删除再返回
			file.delete();
			return;
		}
		if (file.isDirectory()) {
			// 是目录 遍历
			String[] list = file.list();
			for (String subPath : list) {
				System.out.println(subPath);
				// 得到子文件路径
				// 调用删除功能
				delFilePath(fileName+"\\"+subPath);
			}
			file.delete();
		}
		logger.info(fileName);
	}
	
	
	/**
	 * 获取系统属性
	 */
	public static String getSystemProperty(String key) {
		String property = System.getProperty(key);
		return property;
	}
	
	
	/**
	 * 返回文件以指定单位大小表示
	 * @param fileName
	 * @param fileUnit
	 * @return
	 */
	public long getSize(String fileName,FileUnit fileUnit) {
		File file = new File(fileName);
		
		long size = file.length();
		switch (fileUnit) {
		case B:
				return size;
		case KB:
				return size/1024;
		case MB:
				return size/1024/1024;
		case GB:
				return size/1024/1024/1024;
		case TB:
				return size/1024/1024/1024/1024;
		case PB:
				return size/1024/1024/1024/1024/1024;

		default:return 0;
		}
		
	}
	
	
	/**
	 * 读取文件
	 * @param fileName
	 * @return
	 * @throws IOException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@SuppressWarnings("resource")
	public static List fileToBean(String fileName,Class beanClass) throws IOException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		File file = new File(fileName);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line = null;
		List list = new ArrayList();
		Constructor constructor = beanClass.getConstructor();
		while((line = bufferedReader.readLine() )!=null) {
			String[] split = line.split("\\|");
			Object object = constructor.newInstance(split);
			list.add(object);
		}
		return list;
	}
	
	

}
