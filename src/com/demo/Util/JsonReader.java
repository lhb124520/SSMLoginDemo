package com.demo.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

public class JsonReader {
	public static JSONObject receivePost(HttpServletRequest request) throws IOException, UnsupportedEncodingException {

		// 读取请求内容
		System.out.println("读取请求内容");
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"));		
		String line = null;
		StringBuilder sb = new StringBuilder();
		while ((line = br.readLine()) != null) {
			System.out.println("br.toString()"+br.readLine());
			sb.append(line);
		}
		// 将json字符串转换为json对象
		System.out.println("sb.toString()"+sb.toString());
		 //接收{}对象，此处接收数组对象会有异常
		String jsonStr=sb.toString();
        if(jsonStr.indexOf("[") != -1){  
            jsonStr = jsonStr.replace("[", "");  
        }  
        if(jsonStr.indexOf("]") != -1){  
            jsonStr = jsonStr.replace("]", "");  
        }
		JSONObject json = JSONObject.fromObject(sb.toString());
		return json;
	}
}
