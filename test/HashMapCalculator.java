import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapCalculator {
	public static void main(String[] args) {

	}

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int value = 0;
		for (Entry<String, String> map : hashmap1.entrySet()) {
			if (hashmap2.containsKey(map.getKey())) {
				if (hashmap2.containsValue(map.getValue())) {
					value += 1;
				}
			}
		}
		return value;
	}
}
