import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Question15 {

	
	public static void enterValues() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		calculation(str1, str2);
		
	}
	
	public static void calculation(String str1, String str2) {
		// char[] chr1=str1.toCharArray();
		LinkedList<Character> chr1 = new LinkedList<Character>();
		for (char c : str1.toCharArray()) {
			if(chr1.size()==0) {
				chr1.add(c);
			}else if (chr1.getLast() != c)
				chr1.add(c);
		}
		LinkedList<Character> chr2 = new LinkedList<Character>();
		for (char c : str2.toCharArray()) {
			if(chr2.size()==0) {
				chr2.add(c);
			}else if (chr2.getLast() != c)
				chr2.add(c);
		}
		/*System.out.println(chr1);
		System.out.println(chr2);
		System.out.println(chr1.containsAll(chr2));*/
		
		/*int size=chr1.size()<chr2.size()? chr1.size():chr2.size();
		
		for (int i=1;i<size;i++){
			if(chr1.get(i)!=chr2.get(i)) {
				System.out.println("Not possible");
			}
		}*/
		
		if(chr1.size()!=chr2.size()) {
			System.out.println("Not possible");
		}else {
			System.out.println(Math.abs(str1.length()-str2.length()));
		}
		
	}
	
	
}
