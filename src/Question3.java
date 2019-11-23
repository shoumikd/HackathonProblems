import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Question3 {
	
	public static void enterValues() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer totaltestCases = Integer.parseInt(br.readLine());
		List<Integer> result=new ArrayList<>();
		for (int i = 0; i < totaltestCases; i++) {
			Integer numberOfElements = Integer.parseInt(br.readLine());
			String elements = br.readLine();
			String[] elementsArray=elements.split("\\s");
			Integer numberOfQueries = Integer.parseInt(br.readLine());
			ArrayList<String> queryList = new ArrayList<String>();
			for (int j = 0; j < numberOfQueries; j++) {
				String query = br.readLine();
				queryList.add(query);
			}
			result.addAll(calculation(elementsArray,numberOfQueries, queryList));
		}
		
		for (Integer integer : result) {
			System.out.println(integer);
		}

	}
	
	public static List<Integer> calculation(String[] elementsArray,Integer numberOfQueries, ArrayList<String> queryList) {
		List<Integer> result=new ArrayList<>();
		for (String string : queryList) {
			String[] endPoints=string.split("\\s");				
			
			int end= Integer.parseInt(endPoints[1])-1;
			int oldNum=0;
			int coldNum=0;
			for (int start= Integer.parseInt(endPoints[0])-1; start<=end;start++) {
				int element=Integer.parseInt(elementsArray[start]);
				int count=countOddNumbers(element);
				if(element%count ==0) {
					oldNum++;
				}else {
					coldNum++;
				}
			}
			if(oldNum>=coldNum)
				result.add(0);
			else {
				result.add(Math.abs(oldNum-coldNum));
			}
		}
		return result;
	}
	
	public static Integer countOddNumbers(int element){
		int count=0;
		
		if(element%2==0) {
			count=element/2;
		}else {
			count=(element+1)/2;
		}
		return count;
	}
}
