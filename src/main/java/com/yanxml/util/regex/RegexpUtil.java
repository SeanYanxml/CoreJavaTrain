package com.yanxml.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

/**
 * 拼写正则表达式的工具类。
 * */
public class RegexpUtil {
	
	//	public static String NUMBER_MATCHER = "(\\d*)";// 注意 不能直接//d进行匹配 中文字符时会出错
	// 因为中文内的空字符会被匹配上 所以必须限制数字第一次能够被匹配上
	public static String NUMBER_MATCHER = "(([0-9]+)[0-9]*\\.?[0-9]*)";
	
	public static String ATTRIBUTE_MATCHER = "(?<=#\\{)[^}]*(?=\\})";
	
	/** 
	 * 转义正则特殊字符 （$()*+.[]?\^{},|） 
	 *  
	 * @param keyword 
	 * @return 
	 */  
	public static String escapeExprSpecialWord(String keyword) {  
	    if (!StringUtils.isEmpty(keyword)) {  
	        String[] fbsArr = { "\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|" };  
	        for (String key : fbsArr) {  
	            if (keyword.contains(key)) {  
	                keyword = keyword.replace(key, "\\" + key);  
	            }  
	        }  
	    }  
	    return keyword;  
	}
	
	/**
	 * 转义字符串内的所有数字，并用正则代替。
	 * 特别注意线程 异常的问题。
	 * Tips: 特别注意 // 的情况 (println()输出时又进行了转义)
	 * */
	public static String regexpNumberString(String orignalStr){
		String result = null;
		if(null != orignalStr){
			result = new String(orignalStr);
			result = result.replaceAll(NUMBER_MATCHER, "##temp##");
			result = escapeExprSpecialWord(result);
			String tmp = "("+NUMBER_MATCHER+")";
			result = result.replaceAll("##temp##", tmp);
			// 注意mybatis 内是直接的传递的 不需要再进行转义的操作。
			// result = result.replace("\\", "\\\\");
		}
		return result;
	}

	/**
	 * 正则匹配
	 * @param regex 正则表达式
	 * @param data 待匹配字段
	 * @param index 取表达式的分组
	 * @return
	 */
	public static String regex (String regex ,String data, Integer  index) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher =  pattern.matcher(data);
		if (matcher.find() && 
				(!StringUtils.isEmpty(matcher.group(index)))
		) {
			return  matcher.group(index);
		}
		return null;
	}
	
	public static void groupTest(){
//		String testUrl="\"\":\"ZYB_LINUX_High_CPU_User_single:PEBSAP02:LZ1:ITM_KLZ_CPU\"##\"\":\"1992831\"##\"\":\"10.18.0.65\"##\"\":\"PEBSAP02\"##\"\":\"tivoli_eif probe on ITSMPRO1\"##\"\":\"ITM\"##\"\":\"ITM_KLZ_CPU\"##\"\":\"ZYB_Linux_High_CPU_User_single\"##\"\":5##\"\":\"CPU标示为1，用户CPU使用率为：100.00%\"##\"\":05/24/2017 05:23:26 AM##\"\":05/24/2017 05:23:11 AM##\"\":05/24/2017 05:23:11 AM##\"\":05/24/2017 05:23:26 AM##\"\":1##\"\":1##\"\":0##\"\":\"ZYYHAP\"##\"\":2529040";
//		String regexUrl="\"\":\"(.*)\"##\"\":\"(.*)\"##\"\":\"(.*)\"##\"\":\"(.*)\"##\"\":\"(.*)\"##\"\":\"(.*)\"##\"\":\"(.*)\"##\"\":\"(.*)\"##\"\":(.*)##\"\":\"(.*)\"##\"\":(.*)##\"\":(.*)##\"\":(.*)##\"\":(.*)##\"\":(.*)##\"\":(.*)##\"\":(.*)##\"\":\"(.*)\"##\"\":(.*)";
		
//		String testUrl="update alert set DESCRIPTION = CONCAT_WS('#.#',DESCRIPTION,#{event.description}) , last_event_time = Tue Dec 26 20:59:29 CST 2017 , internal_last_event_time = Wed Nov 29 14:40:54 CST 2017 , count = count + 1  where id = 6474";
//		/\{[^\}]+\}/
//		String regexUrl="(?<=#\\{)[^}]*(?=\\})";
		
		String testUrl="<html>gb2312<p>cocococ</p></html>";
		String regexUrl="";
		
		Pattern pattern = Pattern.compile(regexUrl);
		Matcher matcher =  pattern.matcher(testUrl);
		if(matcher.find()){
			for(int i=0;i<=matcher.groupCount();i++){
				System.out.println(i+" : "+matcher.group(i));
			}
		}       	
	}
	
	public static void main(String[] args) {
//		String testUrl = "10.1.186.151Processor load (1 min average_per_core) 15.7075";
//		String testUrl = "10.1.186.151Processor load (1 min average_per_core).";
//		String testUrl = "CPU标示为1，用户CPU使用率为：90.00%";
//		testUrl = regexpNumberString(testUrl);
//		System.out.println(testUrl);
//		System.out.println(regexpNumberString("产险2009版集中再保管理系统[10.190.57.24][主机名: cxzdb1_new],文件系统/p09rein/p09rein_u37使用率为57.12%,告警级别[中]。"));
		groupTest();
		
	}


}
