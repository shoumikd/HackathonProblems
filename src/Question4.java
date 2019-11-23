import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class Question4 {

	public static void enterValues() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String enterDet=br.readLine();
		String[] enterDetArr=enterDet.split("\\s");
		Integer rows = Integer.parseInt(enterDetArr[0]);
		Integer columns = Integer.parseInt(enterDetArr[1]);
		ArrayList<String> strArr=new ArrayList<String>();
		for(int i=0;i<rows;i++) {
			String element=br.readLine();
			strArr.add(element);
		}
		calculation(strArr);
	}
	
	public static void calculation(ArrayList<String> strArr) {
		BigInteger highestNum=new BigInteger(strArr.get(1),2);
		int highestPos=0;
		int indexOfone=0;
		for (int i = 0; i < (strArr.size() - 1); i++) {
			 try {
				BigInteger presentNum = new BigInteger(strArr.get(i), 2);
				if (highestNum.compareTo(presentNum)<0) {
					highestNum = presentNum;
					highestPos = i;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(highestPos+1);
		/*char[] charArr=strArr.get(highestPos).toCharArray();
		for (int i=0;i<(charArr.length-1);i++) {
			if("1".equalsIgnoreCase(String.valueOf(charArr[i]))) {
				System.out.println(i);
			}
		}*/
	}
	
}
