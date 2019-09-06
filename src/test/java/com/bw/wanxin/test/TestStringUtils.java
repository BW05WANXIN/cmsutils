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
		System.out.println("请输入需要测试的内容：");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(StringUtils.isEmpty(s));
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
