import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Question7 {
	public static void enterValues() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String enterDet=br.readLine();
		String[] enterDetArr=enterDet.split("\\s");
		BigInteger wareHouseCap = new BigInteger(enterDetArr[0]);
		BigInteger itemExpEveryDay = new BigInteger(enterDetArr[1]);
		BigInteger numVan = new BigInteger(enterDetArr[2]);
		BigInteger capVan = new BigInteger(enterDetArr[3]);
		BigInteger allowedExp = new BigInteger(enterDetArr[4]);
		BigInteger initialVan = new BigInteger(enterDetArr[2]);
		/*int itemExpEveryDay = Integer.parseInt(enterDetArr[1]);
		int numVan = Integer.parseInt(enterDetArr[2]);
		int capVan = Integer.parseInt(enterDetArr[3]);
		int allowedExp = Integer.parseInt(enterDetArr[4]);
		int initialVan= Integer.parseInt(enterDetArr[2]);*/
		calculation(wareHouseCap,itemExpEveryDay,numVan,capVan,allowedExp,initialVan);
	}
	
	public static void calculation(BigInteger wareHouseCap, BigInteger itemExpEveryDay, BigInteger numVan, BigInteger capVan,
			BigInteger allowedExp, BigInteger initialVan) {
		BigInteger deliveryPerDay=numVan.multiply(capVan);
		//double perDayItemHandled=Double.valueOf(deliveryPerDay+itemExpEveryDay);
		//double numberOfDays= Math.ceil(wareHouseCap/perDayItemHandled);
		BigInteger perDayItemHandled=deliveryPerDay.add(itemExpEveryDay);
		BigInteger numberOfDays= wareHouseCap.divide(perDayItemHandled);
		System.out.println(numberOfDays);
		int res= (numberOfDays.multiply(itemExpEveryDay)).compareTo(allowedExp);
		if(res==1) {
			calculation(wareHouseCap,itemExpEveryDay,numVan.add(new BigInteger("1")),capVan,allowedExp,initialVan);
		}else if(res==0||res==-1) {
			System.out.println(numVan.subtract(initialVan));
		}
		
	}
	
}
