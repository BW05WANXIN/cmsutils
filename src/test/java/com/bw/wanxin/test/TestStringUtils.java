/**
 * 
 */
package com.bw.wanxin.test;

import java.util.Scanner;

import org.junit.Test;

import com.bw.wanxin.StringUtils;

/**
 * @author 926474
 *
 */
public class TestStringUtils {
	
	
	@Test
	public void testToHtml2() {
		String string = StringUtils.toHtml2("是黄齑淡饭很快就\n\r参加活动就大声\r不好的事在今后的");
		System.out.println(string);
	}
	
	
	/**
	 * (1)	测试StringUtil工具类中toHtml()方法，传一段文本进去，输出带html标签的文本。（4分）
	 */
	@Test
	public void testToHtml() {
		// 测试的文本
		String text="(1)	将\\n\\r替换成一个\\n。（2分）\r\n" + 
				"(2)	将\\n结尾的这行文本用<p></p>标签包起来。（6分）\r\n" + 
				"(3)	将单个\\r字符使用<br/>标签替换。（2分）\r\n" + 
				"(4)	方法不报错，返回正确结果。（4分）\r\n" + 
				"(5)	该方法必须是在自己的工具包工程中，且在StringUtil工具中。（2分）\r\n" + 
				"\r\n";
		String html = StringUtils.toHtml2(text);
		// 输出转换后的内容
		System.out.println(html);
	}
	
	
	/**
	 * (2)	测试StringUtil工具类中的是否为中国地区手机号码isPhone()工具方法。传一个非法的手机号码测试不通过（4分）。传一次合法的手机号码，测试通过（4分）。
说明：如果自己的工具包工程没有该功能的工具方法，考试现在编写不扣分。如果有此功能的方法，但方法名不同不影响成绩。

	 */
	@Test
	public void testIsTelphone() {
		// 不合法手机号码
		String p1="1102312321jv";
		// 合法11位手机号码
		String p2="13509868294";
		// 输出各自测试结果
		System.out.println("p1是否是合法的电话号码："+StringUtils.isTelephone(p1));
		System.out.println("p2是否是合法的电话号码："+StringUtils.isTelephone(p2));
	}
	
	
	/**
	 * (3)	测试StringUtil工具类中的是否为邮箱isEmail()工具方法。传一个非法的邮箱测试不通过（4分）。传一次合法的邮箱，测试通过（4分）。
说明：如果自己的工具包工程没有该功能的工具方法，考试现在编写不扣分。如果有此功能的方法，但方法名不同不影响成绩。

	 */
	@Test
	public void testisEmail() {
		// 不合法的邮箱格式
		String e1="2293152624@qq.com@.vn";
		// 合法的邮箱格式 
		String e2="2293152624@qq.com";
		// 输出验证结果
		System.out.println("e1是否是合法的邮箱格式："+StringUtils.isEmail(e1));
		System.out.println("e2是否是合法的邮箱格式："+StringUtils.isEmail(e2));
	}
	
	
	
	
	
	@Test
	public void testTel() {
		String tel1="13512343213";
		String tel2="12323232323";
		boolean a = StringUtils.isTelephone(tel1);
		boolean b = StringUtils.isTelephone(tel2);
		System.out.println("tel1:"+a);
		System.out.println("tel2:"+b);
	}
	
	@Test
	public void testIsNull() {
		boolean hstText = StringUtils.hasText(" ");
		System.out.println("是否优质："+hstText);
	}
	
	@Test
	public void testIsEmail() {
		String e1="2293152624@qq.com";
		String e2="1231@231.231!2";
		boolean a = StringUtils.isEmail(e1);
		boolean b = StringUtils.isEmail(e2);
		System.out.println("e1:"+a);
		System.out.println("e2:"+b);
	}
	
	@Test
	public void testIsLetter() {
		String l1="123";
		String l2="asdas";
		String l3="123nbh2";
		System.out.println("l1:"+StringUtils.isLetter(l1));
		System.err.println("l2:"+StringUtils.isLetter(l2));
		System.out.println("l3:"+StringUtils.isLetter(l3));
	}
	
	@Test
	public void testRandomLetterStr() {
		String str = StringUtils.randomLetterStr(5);
		System.out.println(str);
	}
	
	@Test
	public void testRandomStr() {
		String str = StringUtils.randomStr(16);
		System.out.println(str);
	}
	
	@Test
	public void testRandomCnStr() {
		String string=StringUtils.getRandomCnSti(10);
		System.out.println(string);
	}
	
	
	
	
	

}
