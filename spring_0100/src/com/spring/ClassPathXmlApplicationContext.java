package com.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class ClassPathXmlApplicationContext implements BeanFactory {
	private Map<String, Object> beans = new HashMap<String, Object>();
	
	public ClassPathXmlApplicationContext() throws Exception {
		SAXBuilder sb = new SAXBuilder();
		Document doc = sb.build(this.getClass().getClassLoader().getResourceAsStream("beans.xml"));
		
		Element root = doc.getRootElement();
		List list = root.getChildren("bean");
		for( int i=0; i<list.size(); i++) {
			Element element = (Element)list.get(i);
			String id = element.getAttributeValue("id");
			String clazz = element.getAttributeValue("class");
			System.out.println(id + ":" + clazz);
			Object o = Class.forName(clazz).newInstance();
			beans.put(id, o);
		}
	}
	
	/*
	public ClassPathXmlApplicationContext() throws Exception {
		SAXBuilder sb = new SAXBuilder();
		Document doc = sb.build(this.getClass()getClassLoader().getResourceAsStream("beans.xml));
		Element root = doc.getRootElement();
		List list = root.getChildren("bean");
		for(int i=0; i<list.size(); i++) {
			Element element = (Element)list.get(i);
			Strin id = element.getAttributeValue("id");
			Object o = Class.forName(clazz).newInstance();
			System.out.println(id);
			System.out.println(clazz);
			beans.put(id, o);
			
			for(Element propertyElment : (List<Element>)element.getChildren("property") {
				String name = propertyElement.getAttributeValue("name");
				String bean = propertyElement.getAttributeValue("bean");
				Object beanObject = beans.get(bean);
				
				String methodName = "set" name.substring(0, 1).toUpperCase() + name.substring();
				System.out.println("method name = " + methodName);
				Method m = o.getClass().getMethod(methodName, beanObeject.getClass().getInterfaces()[0]);
				m.invoke(o, beanObject);
			}	
		}
	}
	 */
	
	public Object getBean(String name) {
		return beans.get(name);
	}

}
