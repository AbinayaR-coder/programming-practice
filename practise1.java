package project;
import java.util.HashMap;
public class Frequency {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hashmap = new HashMap<>();
		int[] arr = {1,2,3,1,2,3};
		for(int i = 0 ; i < arr.length ; i++) {
			if(hashmap.containsKey(arr[i])) {
				hashmap.put(arr[i],hashmap.get(arr[i])+1);
			}
			else {
				hashmap.put(arr[i],1);
			}
		}
		System.out.println(hashmap);
	}
}
