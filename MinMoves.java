package test.test.simple;

public class MinMoves {

	public static void main(String[] args) {
		String str = "bbaabbaabbabab"; 
        int n = str.length(); 
  
        System.out.println(getCount(str.toCharArray(), n)); 
	}
	
	public static int getCount(char[] str, int n) 
    {
        int count = 1;
        char prev = str[0];
        int min = 0;
        for(int i = 1; i<n; i++) {
            if(prev == str[i]){
                ++count;
            } else {
                min += count/3;
                count = 1;
                prev = str[i];
            }
        }
        min += count/3;
        return min;
    }

}
