import java.util.HashMap;
import java.util.Map;

public class Maps {
	public static void main(String[] args) {
		/* 
		 * they are key value pairs
		 *  implement map interfaces
		 */
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		MapUtil(hMap);
	}

	public static void MapUtil(Map<Integer, String> map) {
		map.put(100, "ankita");
		map.put(203, "ananya");
		map.put(23, "zoya");
		
		System.out.println("see all keys " + map.keySet());
		System.out.println("see all key value pairs " + map);
		System.out.println(map.get(23));
		
		for(int key : map.keySet())
		{
			System.out.println(key + " ");
		}
	}
}
