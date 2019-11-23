import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question18 {

	/*public static void enterValues() throws Exception {BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Integer totaltestCases = Integer.parseInt(br.readLine());
	List<Integer> result=new ArrayList<>();
	ArrayList<String> elementList = new ArrayList<String>();
	for (int i = 0; i < totaltestCases; i++) {
		Integer numberOfElements = Integer.parseInt(br.readLine());
		String elements = br.readLine();
		elementList.add(elements);
	}
	calculation(elementList);
		//result.addAll(calculation(elementList);
	}
	
	public static void calculation(ArrayList<String> elementList) {
		for (String elements : elementList) {
			String[] elementsArray=elements.split("\\s");
			ArrayList<Integer> eleLisst=new ArrayList<Integer>();
				for (String string : elementsArray) {
					eleLisst.add(Integer.valueOf(string));
				}
			printSubsets(eleLisst);
		} 
	}*/
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            long[] A = new long[N];
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
            	A[i_A] = Long.parseLong(arr_A[i_A]);
            }

            int out_ = solve(A,N);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    
	 
	static int solve(long[] A,int N) 
	    { 
	        int n = A.length; 
	        Map<Long, Long> hm = new HashMap<Long, Long>(); 
	        //ArrayList<Long> resList=new ArrayList<Long>();
	        for (int i = 0; i < (1<<n); i++) 
	        { 
	            for (int j = 0; j < n; j++) 
 	                if ((i & (1 << j)) > 0) {
 	                	Long k =A[j];
 	                	Long l = hm.get(k); 
 	                	hm.put(k, (l == null) ? 1 : l + 1); 
 	                }
 	                	//resList.add(A[j]);
	            	
	        } 
	        int sum=0;
	        for (Map.Entry<Long, Long> val : hm.entrySet()) { 
	            if(val.getKey() >= val.getValue()) {
	            	sum+=val.getKey();
	            }
	        } 
	        //int sum=countFrequencies(resList);
	        return sum;
	    }
	
	 public static int countFrequencies(ArrayList<Long> list) 
	    { 
	        // hashmap to store the frequency of element 
	        Map<Long, Long> hm = new HashMap<Long, Long>(); 
	        int sum=0;
	        for (Long i : list) { 
	        	Long j = hm.get(i); 
	            hm.put(i, (j == null) ? 1 : j + 1); 
	        } 
	  
	        // displaying the occurrence of elements in the arraylist 
	        for (Map.Entry<Long, Long> val : hm.entrySet()) { 
	            if(val.getKey() >= val.getValue()) {
	            	sum+=val.getKey();
	            }
	        } 
	        return sum;
	    } 
}
