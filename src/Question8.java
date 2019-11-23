import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Question8 {
	public static void enterValues() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in); 
		HashMap<String, Double> discMap=new HashMap<>();
		
		int numProd = Integer.parseInt(br.readLine()); 
		
		for(int count=0; count< numProd; count++) {
			String enterDet = br.readLine();; 
			String[] enterDetArr=enterDet.split("\\s");
			discMap.put(enterDetArr[0], Double.valueOf(enterDetArr[1]));
		}
		
		Double discCoupunPrize = Double.parseDouble(br.readLine());; 
		
		int excelSheetEntry = Integer.parseInt(br.readLine());  
		
		HashMap<String, Double> custValueMap=new HashMap<>();
		HashMap<String, String> custDetailsMap=new HashMap<>();
		for(int count=0; count< excelSheetEntry; count++) {
			/*
Customer ID	Product Type	Quantity	Price (1 Quantity)	Discount Coupon
1	clothes	1	600.00	Yes*/
			String enterDet = br.readLine(); 
			String[] enterDetArr=enterDet.split("\\s");
			custDetailsMap.put(enterDetArr[0], enterDet);
			
			if(custValueMap.get(enterDetArr[0]) != null) {
				Double value=custValueMap.get(enterDetArr[0])+(Double.valueOf(enterDetArr[2])*Double.valueOf(enterDetArr[3]));
				custValueMap.put(enterDetArr[0], value);
			}else if(custValueMap.get(enterDetArr[0]) == null) {
				Double value=(Double.valueOf(enterDetArr[2])*Double.valueOf(enterDetArr[3]));
				custValueMap.put(enterDetArr[0], value);
			}
			
		}
		ArrayList<Double> custValueList = new ArrayList<Double>(custValueMap.values()); 
		Collections.sort(custValueList);
		TreeSet<String> sortedId= new TreeSet<String>();		
		for (Double cust : custValueList) {
			for (Entry<String, Double> entry : custValueMap.entrySet()) {
				if (entry.getValue().equals(cust)) {
	                sortedId.add(entry.getKey());
	            }
			}
		}
		calculation(discMap,custDetailsMap,sortedId);
	}
	
	public static void calculation(HashMap<String, Double> discMap,HashMap<String, String> custDetailsMap, TreeSet<String> sortedId) {
		int lastInde=sortedId.size()-1;
		Iterator<String> itr = sortedId.descendingIterator();
		while(itr.hasNext()) {
			String custShopping=custDetailsMap.get(itr);
			
		}
	}
}
