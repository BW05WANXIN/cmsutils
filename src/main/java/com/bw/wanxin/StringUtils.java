/**
 * 
 */
package com.bw.wanxin;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 926474
 *
 */
public class StringUtils {
	
	/**
	 * 判空
	 * @param str
	 * @param return
	 */
	public static boolean isEmpty(String str) {
		// null =>true
		// "" =true;
		return (null == str || "".equals(str.trim()));
	}
	
	/**
	 * 判断是否有值
	 * @param str
	 * @return
	 */
	public static boolean isHasValue(String str) {
		//return (null !=str && !"".equals(str.trim()));
		return !(null ==str || "".equals(str.trim()));
	}
	
	
	// 正则 验证电话号码
	public static boolean isTelephone(String str) {
		String pattern = "(136|135|137)\\d{8}";
		// 是否匹配
		return str.matches(pattern);
	}
	
	/**
	 * 验证邮箱
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str) {
		String pattern = "^\\w+@\\w+\\.[a-zA-Z]{2,3}$";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		return matcher.matches();
	}
	
	/**
	 * 判断是否全部为字母
	 * @param str
	 * @return
	 */
	public static boolean isLetter(String str) {
		String pattern = "^[a-zA-Z]+$";
		return str.matches(pattern);
	}
	
	
	/**
	 * 获取n位随即英文字符串
	 * @param n
	 * @return
	 */
	public static String randomLetterStr(int n) {
		if (n<=0) 
			return "";
			Random random = new Random();
			
			StringBuilder sb=new StringBuilder();
			for (int i = 0; i < n; i++) {
				char letter = (char)('a'+random.nextInt(26));
				sb.append(letter);
			}
			return sb.toString();
	}
	
	
	/**
	 * 获取n为随机字母和数字字符串
	 * @param n
	 * @return
	 */
	public static String randomStr(int n) {
		Random ran=new Random();
		char chars[] = {'0','1','2','3','4','5','6','7','8','9','0',
				(char)('a'+ran.nextInt(26)),(char)('A'+ran.nextInt(26))};
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < n; i++) {
			// 随机得到一个下标，根据下标从数组中获取值，拼接到字符串上
			
			// 随即获取下标
			int index=ran.nextInt(chars.length);
			char c=chars[index];
			// 向后拼接
			sb.append(c);
		}
		return sb.toString();
	}
	
	
	public static String getRandomCnSti(int n) {
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(getOneCn());
		}
		return sb.toString();
	}

	private static String getOneCn() {
		String str="";
		int hightPos;
		int lowPos;
		Random ran=new Random();
		hightPos = (176+Math.abs(ran.nextInt(39)));
		lowPos = (161+Math.abs(ran.nextInt(93)));
		
		byte [] b=new byte[2];
		b[0] = (Integer.valueOf(hightPos)).byteValue();
		b[1] = (Integer.valueOf(lowPos)).byteValue();
		
		try {
			str = new String(b, "GBK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("错误");
		}
		
		return str;
	}
	
	
	
	

}
