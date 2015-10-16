package com.ud.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploadServlet extends HttpServlet {

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

		// 上传操作
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setHeaderEncoding("UTF-8");
		try {
			List<?> items = upload.parseRequest(request);
			if (null != items) {
				Iterator<?> itr = items.iterator();
				
				while (itr.hasNext()) {
					FileItem item = (FileItem) itr.next();
					
					if (item.isFormField()) {
						continue;
					} else {
						rootPath = rootPath+ "\\"+ "files";
						File file = new File(rootPath);
						if(!file.isDirectory()) {
							file.mkdir();
						}
						File savedFile = new File(rootPath, item.getName());
						item.write(savedFile);

						RequestDispatcher dispatcher = request.getRequestDispatcher("/upload.jsp"); 
						dispatcher.forward(request, response);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
