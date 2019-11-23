import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Question16 {

	public static void enterValues() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer numberOfDays = Integer.parseInt(br.readLine());
		String dates = br.readLine();
		calculation(numberOfDays, dates);

	}

	public static void calculation(Integer numberOfDays, String dates) {
		String[] datesArr = dates.split("\\s");
		ArrayList<Integer> dateList = new ArrayList<>();
		int[] pack1 = new int[30];
		int[] pack7 = new int[30];
		int[] pack30 = new int[30];
		int packValue1 = 199;
		int packValue7 = 799;
		int packValue30 = 2499;

		for (String string : datesArr) {
			dateList.add(Integer.valueOf(string));
		}

		// marking pack1
		for (int i = 0; i <= (dateList.size() - 1); i++) {
			pack1[dateList.get(i) - 1] = packValue1;
		}

		// marking pack7
		int endDate7 = 0;
		for (int i = 0; i <= (dateList.size() - 1); i++) {
			int startDate = dateList.get(i);

			if (endDate7 == 0 || dateList.get(i) - 1 > endDate7) {
				pack7[dateList.get(i) - 1] = packValue7;
				for(int k=0;k<=(dateList.get(i) - 1);k++) {
				pack1[k]=0;	
				}
			}
			if (endDate7 == 0 || endDate7 < startDate) {
				endDate7 = startDate + 6;
			}
		}
		
		// marking pack30
				int endDate30 = 0;
				for (int i = 0; i <= (dateList.size() - 1); i++) {
					int startDate = dateList.get(i);

					if (endDate30 == 0 || dateList.get(i) - 1 > endDate30) {
						pack30[dateList.get(i) - 1] = packValue30;
					}
					if (endDate30 == 0 || endDate30 < startDate) {
						endDate30 = startDate + 29;
					}
				}
	}
}