package logDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class CommonTest {
	
	@Test
	public void jjjjjjjj(){
		 String jsonStr =  "{\"isGameOver\":false,\"pai_hu\":11,\"player_all_info\":[{\"huaNum\":0,\"fen_add\":-54,\"fen_now\":9962,\"peng\":{\"11\":1141},\"pai\":[11,11,11,12,12,12,21,22,22,31,31,32,33],\"pos\":1},{\"huaNum\":0,\"fen_add\":0,\"fen_now\":10000,\"pai\":[15,16,18,19,24,26,27,28,36,38,94,95,96],\"pos\":3},{\"huaNum\":0,\"fen_add\":54,\"fen_now\":10038,\"pai\":[11,12,12,13,13,14,14,15,16,17,18,19,91,91],\"pos\":2},{\"huaNum\":2,\"fen_add\":0,\"fen_now\":10000,\"pai\":[15,16,23,24,25,25,25,28,28,33,36,92,95],\"pos\":4}],\"huFangShi\":3,\"playerId_hu\":[{\"fan_feng\":0,\"playerId\":1137,\"fan_zon\":9,\"huType\":[16,2,13],\"pos\":2}],\"player_g\":1}";
		 JSONObject parseObject = JSON.parseObject(jsonStr, new TypeReference<JSONObject>(){});		
		 System.err.println(parseObject.toString());
	}

	@Test
	public void test(){
//		HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
//		hashMap.put(1, 1);
//		hashMap.put(2, 1);
//		System.err.println(hashMap.toString());
		List<Integer> list = new ArrayList<Integer>();
		list.add(1231);
		list.add(1231);
		list.add(1231);
		list.add(1231);
		list.removeAll(Arrays.asList(1231));
		System.err.println(list.toString());
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
	
	
//	@Test
//	public void arrayCircleTest(){
//		new
//		int index = 1;
//		
//		
//		if (index == 0 || index >= array.size()) {
//            return array;
//        }
//        int num = array.size() - index;
//        for (int k = 0; k < num; k++) {
//            long temp;
//            temp = array.get(array.size() - 1);
//            for (int i = array.size() - 1; i > 0; i--) {
//                array.set(i, array.get(i - 1));
//            }
//            array.set(0, temp);
//        }
//		
//	}
	
}


