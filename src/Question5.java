import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Question5 {

	public static void enterValues() throws Exception {
		Scanner s = new Scanner(System.in);
	    int numOfEntries = Integer.parseInt(s.nextLine());
	    List<String> entryList=new ArrayList<String>();
	    String initialEntry="";
	    int [] finalArr=new int[numOfEntries];
	    for(int counter=1; counter<=5; counter++) {
	    	entryList.add(s.nextLine());
	    }
	    int c=0;
	    for(int i=0; i<(2*numOfEntries-1); i+=2) {
	    	c++;
	    	System.out.println("i:"+i);
	    	HashMap<String,Integer> frequency=new HashMap<String,Integer>();
	    	for(int counter=0; counter<5; counter++) {
	    		if(frequency.get(String.valueOf(entryList.get(counter).charAt(i)))!=null) {
	    			int value=Integer.parseInt(String.valueOf(frequency.get(String.valueOf(entryList.get(counter).charAt(i)))))+1;
	    			frequency.put(String.valueOf(entryList.get(counter).charAt(i)),value);	    			
	    		}else {
	    			frequency.put(String.valueOf(entryList.get(counter).charAt(i)),1);

	    		}
	    	}
	    	
	    	int maxVal=0;
	    	for (String string : frequency.keySet()) {
				int val=frequency.get(string);
				if (val>maxVal) {
					finalArr[c-1]=Integer.parseInt(string);
					maxVal=val;
				}else if(val==maxVal) {
					finalArr[c-1]=-1;
				}
			}
	    }
	    
	    /*for(int counter=0; counter<5; counter++) {
	    	String[] initial = entryList.get(counter).split("\\s");
	    	String[] second = entryList.get(counter+1).split("\\s");
	    		
	    	for(int i=0; i<numOfEntries; i++) {
	    		if (Integer.valueOf(initial[i])==Integer.valueOf(second[i])) {
	    			
	    		}
	    	}
	    }*/
	    System.out.println(finalArr);
	    
	    
	}
	
}
