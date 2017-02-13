package logDemo;

import java.util.HashMap;

import org.junit.Test;

public class CommonTest {

	@Test
	public void test(){
		HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap.put(1, 1);
		hashMap.put(2, 1);
		System.err.println(hashMap.toString());
	}
}
