package com.us.runoob.train.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * NO 8.
 * Java 实例 - 网页抓取 
 * 以下实例演示了如何使用 net.URL 类的 URL() 构造函数来抓取网页：
 * */
public class HtmlCatch {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://csdn.yanxml.cn");
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(url.openStream()));
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter("data.html"));
		String line;
		while(null != (line =buffReader.readLine())){
			System.out.println(line);
			buffWriter.write(line);
			buffWriter.newLine();
		}
		buffReader.close();
		buffWriter.close();
	}
}
/**
 * 预期结果:
 <!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Sean Yan Blog</title>
<script>
 window.location.href="http://blog.csdn.net/u010416101"
</script>
</head>
<body>
</body>
</html>
 * */
