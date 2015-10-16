package com.ud.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileDownloadServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fileName; // 下载文件的文件名称
	
	private String[] contentType={"application/msword", "application/octet-stream"
			, "application/pdf", "application/postscript", "application/powerpoint"
			, "application/rtf", "application/x-compress", "application/x-gzip"
			, "application/x-gtar", "application/x-shockwave-flash", "application/x-tar"
			, "application/zip", "audio/basic", "audio/mpeg", "audio/x-aiff"
			, "audio/x-pn-realaudio", "audio/x-pn-realaudio-plugin", "audio/x-wav"
			, "image/cgm", "image/gif", "image/jpeg", "image/png" };
	
	private String[] suffix={"doc docx", "dms lha lzh exe class", "pdf", "ai eps ps", "ppt", "rtf"
			, "z", "gz", "gtar", "swf", "tar", "zip rar", "au snd", "mpeg mp2", "mid midi rmf"
			, "ram ra", "rpm", "wav", "cgm", "gif", "jpeg jpg jpe", "png"};
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		fileName = new String(request.getParameter("fileName").getBytes("ISO-8859-1"), "UTF-8");
		String fileSuffix = fileName.substring(fileName.lastIndexOf(".")+1);

		String rootPath = request.getParameter("rootPath");
		if (null == rootPath || rootPath.equals("")) {
			rootPath = this.getServletContext().getRealPath("");
		}
		rootPath = rootPath.trim();
		rootPath = rootPath + "\\" + "files";

		// 下载操作
		int i;
		for(i=0; i<suffix.length; i++) {
			if(-1 != suffix[i].indexOf(fileSuffix.toLowerCase())) {
				System.out.println(fileName); // 输出下载的文件名称
				response.setContentType(contentType[i]+ "; charset=UTF-8");
				break;
			}
		}
		if(i>=suffix.length) {
			PrintWriter pw = response.getWriter();
			pw.println("<script language='javascript'>alert('暂时不支持该文件格式下载')</script>");
			pw.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			pw.println("<HTML>");
			pw.println("  <HEAD><TITLE>Wanning</TITLE></HEAD>");
			pw.println("  <BODY>");
			pw.print("<a href='http://localhost:8080/UpDown/servlet/FilesServlet.htm'>back</a>");
			pw.println("  </BODY>");
			pw.println("</HTML>");
			pw.flush();
			pw.close();
			//response.reset();
			//response.setContentType("text/html; charset=UTF-8");
			return;
		}

		response.setHeader("Context-disposition", "attachment; filename="+ fileName);
		FileInputStream in = new FileInputStream(rootPath + "\\" + fileName);
		ServletOutputStream out = response.getOutputStream();

		int readfile = -1;
		while (null != in && (readfile=in.read()) != -1) {
			out.write(readfile);
		}

		out.flush();
		in.close();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
