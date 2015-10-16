package testjson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.junit.Test;

public class JSONTest {

	/**
	 * 将数组转换成JSON
	 */
	@Test
	public void testArray() {

		String[] arr = { "asd", "dfgd", "asd", "234" };
		JSONArray jsonarray = JSONArray.fromObject(arr);
		System.out.println(jsonarray);

	}

	// 对象转换成JSON
	@Test
	public void testObjectToJSON() {
		UserInfo user = new UserInfo(1001, "张三");
		JSONArray jsonArray = JSONArray.fromObject(user);
		System.out.println(jsonArray);
	}

	// Map转换成json， 是用jsonObject
	@Test
	public void testMapToJSON() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", 1001);
		map.put("userName", "张三");
		map.put("userSex", "男");
		JSONObject jsonObject = JSONObject.fromObject(map);
		System.out.println(jsonObject);
	}

	// List转换成JSON
	@Test
	public void testListToJSON() {

		List<UserInfo> list = new ArrayList<UserInfo>();
		UserInfo user = new UserInfo(1001, "张三");
		list.add(user);
		list.add(user);
		list.add(user);

		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println(jsonArray);
	}
}
