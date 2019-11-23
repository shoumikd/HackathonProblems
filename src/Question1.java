/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import for Scanner and other utility classes
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Question1 {
    public static void enterValues() throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter list length");
        String name = br.readLine();         

        // Write your code here
        
        int arrayLength=Integer.parseInt(name);
        System.out.println("Enter elements separated by space");
        String elements = br.readLine();
        System.out.println("Enter number of queries");
        int numberOfQueries=Integer.parseInt(br.readLine());
        
        int items[]=new int[arrayLength];
        
        String[] splitted=elements.split("\\s");
        
        for(int i=0;i<arrayLength;i++){
            items[i]=Integer.parseInt(splitted[i]);
        }
        calculate(items,numberOfQueries,arrayLength);
    }
    
    public static void calculate(int items[],int numberOfQueries,int arrayLength) throws Exception {
        String query1[]=new String[numberOfQueries];
        System.out.println("Enter queries");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        TreeSet<Integer> itemSet=null;
        for(int i=1;i<=numberOfQueries;i++){
            query1[i-1]= br.readLine();
        }
        
        int finalVlue=0;
		for (int i = 0; i < numberOfQueries; i++) {
			String query = query1[i];
			String[] endpoints = query.split("\\s");
			Integer startingPnt=Integer.parseInt(endpoints[0]);
			Integer endingPnt=Integer.parseInt(endpoints[1]);
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int counter = 0;

			itemSet = new TreeSet<Integer>();
			for (int j = startingPnt; j <= endingPnt; j++) {
				itemSet.add(items[j - 1]);
			}
			
			for (Integer item : itemSet) {
				for(int j=startingPnt;j<=endingPnt ;j++) {
					if(items[j-1]==item) {
						counter++;
					}
				}
				map.put(item, counter);
				counter=0;
			}
			for (int key : map.keySet()) {
				int mapValue = map.get(key);
				if (mapValue % 2 != 0) {
					finalVlue += mapValue * key;

				}
			}
			System.out.println(finalVlue);
			finalVlue = 0;
		}
    
    
}
}
