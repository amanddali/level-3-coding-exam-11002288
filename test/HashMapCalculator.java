import java.util.HashMap;

public class HashMapCalculator {
	public static void main(String[] args) {
		
	}
	
	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int value = 0;
		for (int i = 0; i < hashmap1.size(); i++) {
			for (int j = 0; j < hashmap2.size(); j++) {
				if (hashmap1.get(i).equals(hashmap2.get(j))) {
					value++;
				}
			}
		}
		return value;
	}
}
