import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main(String args[] ) throws Exception {
		 //Question18.enterValues();
	 }
	 
	 public static void calculate(int n) throws Exception {
	        List<Integer> list=new ArrayList<>();
	        list.add(0);
	        list.add(1);
	        for(int c=2;list.get(c-1)<=n; c++) {
	        	list.add(list.get(c-2)+list.get(c-1));
	        	if(list.get(c-1)==n) {
	        		System.out.println("yes");
	        	}
	        }
	        System.out.println("-----------------------");
	        for (Integer integer : list) {
				System.out.println(integer);
			}
	        
	 }
	 
	 public static int cornerCheck(int h, int i,int j) {
		 if (i==0 && j==0) {
			 // corner down
			 	//calculate min of 3
			 	
			 //corner equal
			 //corner high
		 }else if(i==0 && j=col-1) {
			 
		 }else if(i==row-1 && j==0) {
			 
		 }else if(i==row-1 && j==col-1) {
			 
		 }
		 
		 return h;
	 }
	       
	 public static int minValueCheck(int a, int b, int c) {
		 minValueCheck(a, b, c, null);
	 }
	 public static int minValueCheck(int a, int b, int c, int d) {
		 if (a!=null && b!=null) {
			 int min= a<b?a:b;
		 }
	 }
}
