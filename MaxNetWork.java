package test.test.simple;

import java.util.HashMap;

public class MaxNetWork {

	public static void main(String[] args) {
		System.out.println(maxNetWork(new int[]{1, 2, 3, 4, 5, 6, 3, 12, 11, 10, 9}, new int[]{ 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8}, 11));

	}
	
	public static int maxNetWork(int[] A, int[] B, int m) {
		final var incoming = new HashMap<Integer,Integer>();
		for(int i = 0; i< A.length; i++) {
			incoming.put(A[i], incoming.getOrDefault(A[i], 0) +1);
			incoming.put(B[i], incoming.getOrDefault(B[i], 0) +1);
		}
		int res = Integer.MIN_VALUE;
		for(int i = 0; i< m; i++) {
			res = Math.max(res, incoming.get(A[i]) + incoming.get(B[i]) -1);
		}
		return res;
	}

}
