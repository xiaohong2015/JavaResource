package com.ud.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.json.JSONArray;
import org.json.JSONObject;


public class FilesServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		String rootPath = request.getParameter("rootPath");
		if (null == rootPath || rootPath.equals("")) {
			rootPath = this.getServletContext().getRealPath("");
		}
		rootPath = rootPath.trim();
		rootPath = rootPath + "\\" + "files";
		
		File file = new File(rootPath);
		if(!file.isDirectory()) {
			file.mkdir();
		}
		
		String[] fileList = file.list();
		if(fileList!= null&& fileList.length>0) {
			request.setAttribute("fileName", fileList);
			/*
			RequestDispatcher dispatcher = request.getRequestDispatcher("/download.jsp"); 
			dispatcher.forward(request, response);*/
			
			// json
			JSONObject json= new JSONObject();
			
			JSONArray jsonArray= new JSONArray();
			JSONObject j= new JSONObject();
			for(String s: fileList) {
				j.put("file", s);
				jsonArray.put(j);
			}
			json.put("jsonArray", jsonArray);
			response.setContentType("text/html;charset=UTF-8; application/x-json");
			response.getWriter().write(json.toString());
			/*
			HttpServletResponse o= ServletActionContext.getResponse();
			o.setContentType("text/html;charset=UTF-8; application/x-json");
			o.getWriter().write(json.toString());*/
			
		} else {
			PrintWriter pw = response.getWriter();
			pw.print("<script language='javascript'>alert('没有文件可以下载!')</script>");
			
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("  <HEAD><TITLE>Wanning</TITLE></HEAD>");
			out.println("  <BODY>");
			out.print("<a href='http://localhost:8080/UpDown'>back</a>");
			out.println("  </BODY>");
			out.println("</HTML>");
			out.flush();
			out.close();
		}
	}

}
