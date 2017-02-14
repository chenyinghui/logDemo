package logDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;

public class CommonTest {

	@Test
	public void test(){
		HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap.put(1, 1);
		hashMap.put(2, 1);
		System.err.println(hashMap.toString());
	}
	
	@Test
	public void jsonTest(){
		JSONObject object = new JSONObject();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1231);
		list.add(1231);
		list.add(1231);
		list.add(1231);
		object.put("playerIds", list);
		System.err.println(object.toString());
		JSONObject result = new JSONObject();
		result.put("info", object);
		System.err.println(result.toString());
		JSONObject jsonObject = result.getJSONObject("info");
		System.err.println(jsonObject.toString());
	}
}
