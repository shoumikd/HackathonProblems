import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Question17 {

	public static void enterValues() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String str=br.readLine();
		calculation(num, str);
		
	}
	
	public static void calculation(int num, String str) {
		char[] chr=str.toCharArray();
		int maxLeng=0; 
		for(int i=0;i<=(chr.length-1);i++) {
			for(int j=i+1;j<=(chr.length-1);j++) {
				ArrayList<Character> substring=new ArrayList<Character>();
				for(int k=i;k<=j;k++) {
					substring.add(chr[k]);
				}
				maxLeng=countElemets(substring,maxLeng);
			}
			
		}
		
		System.out.println(maxLeng);
		
	}
	
	public static int countElemets(ArrayList<Character> substring, int maxLength) {
		int len=substring.size();
		int zeroCount=0;
		
		for (Character character : substring) {
			if(String.valueOf(character).equalsIgnoreCase("0")) {
				zeroCount++;
			}
		}
		int oneCount=len-zeroCount;
		
		if(zeroCount>oneCount && len>maxLength) {
			return len;
		}
		return maxLength;
		
	}
	
	
}
