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
	 * 
	 * @param src
	 * @return
	 */
	public static String toHtml(String src) {
		String [] strings=src.split("\\\n");
		StringBuilder sb=new StringBuilder();
		for (String string : strings) {
			sb.append("<p>").append(string).append("</p>");
		}
		return sb.toString();
	}
	
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
	
	
	
	/**
	 * 根据正则在字符串提取一段值，用于后面在url地址里提取ID值。
	 * 例如在“http://news.cnstock.com/news,yw-201908-4413224.htm”把“4413224”提取出来。
	 * @param str
	 * @param regex
	 * @return
	 */
	public static String getPlaceholderValue(String str,String regex) {
		Pattern pattern = Pattern.compile(regex); // 匹配的模式
		Matcher m = pattern.matcher(str);
		boolean find = m.find();
		if (find) {
			String group = m.group(0);
			return group.substring(1, group.lastIndexOf('.'));
		}
		return "";
	}
	
	
	/**
	 * 测试工具包中isNumber（）
	 * @param src
	 * @return
	 */
	public static boolean isNumber(String src) {
		String regix="[0-9] {1,}(\\.?|[0-9]*)";
		return src.matches(regix);
	}
	
	
	
	/**
	 * 测试工具中hasText（），该方法是过滤String参数空格后判断是否有值，
	 * 如果你有该功能方法，但不是这个方法名不扣分。如果没有该方法，必须现在编写该方法
	 * @param src
	 * @return
	 */
	public static boolean hasText(String src) {
		String all = src.replaceAll("\\s", "");
		return (!"".equals(all));
	}
	
	

}
