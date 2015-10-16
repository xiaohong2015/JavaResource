package com.imooc.weixin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.util.CheckUtil;

public class WeiXinServlet extends HttpServlet 	 {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String signature = req.getParameter("signature"); //加密签名
		String timestamp = req.getParameter("timestamp");  //时间戳
		String nonce = req.getParameter("nonce");  //随机数
		String echostr = req.getParameter("echostr");  //随机字符串
		
		PrintWriter out = resp.getWriter();
		
		if(CheckUtil.checkSignature(signature, timestamp, nonce)){
			out.print(echostr);
		}
	}

}
