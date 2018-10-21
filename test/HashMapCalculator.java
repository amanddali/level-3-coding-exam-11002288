import java.util.HashMap;

public class HashMapCalculator {
	public static void main(String[] args) {

	}

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int value = 0;
		for (String map : hashmap1.keySet()) {
			if (hashmap2.containsKey(map)) {
				if (hashmap1.get(hashmap1.keySet())) {
					value += 1;
				}
			}
		}
		return value;
	}
}
