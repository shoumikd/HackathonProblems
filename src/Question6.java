import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class Question6 {
	public static void enterValues() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String enterDet = br.readLine();
		String[] enterDetArr = enterDet.split("\\s");
		int numOfElements = Integer.parseInt(enterDetArr[0]);
		int k = Integer.parseInt(enterDetArr[1]);

		int[] arr = new int[numOfElements];
		String enterEle = br.readLine();
		String[] eleArr = enterEle.split("\\s");
		
		for (int i = 0; i < eleArr.length; i++) {
			arr[i]=Integer.valueOf(eleArr[i]);
		}
		calculation(arr, k);
	}

	public static void calculation(int[] arr, int k) {
		int nuberOfPrime = 0;

		TreeSet<Integer> diffSet=new TreeSet<Integer>(); 
		for (int i = 0; i < arr.length; i++) {
			boolean isPrime = checkPrime(arr[i]);
			if(isPrime==true) nuberOfPrime++;
		}
		
		int numberOfNumberRequiringOperatin=k-nuberOfPrime;
		
		if(k>nuberOfPrime) {
			for (int i = 0; i < arr.length; i++) {
				boolean isPrime=checkPrime(arr[i]);
				if(isPrime==false) {
					int nearestPrime=numOfOpr(arr[i]);
					diffSet.add(nearestPrime-arr[i]);
				}
			}
		}
		
		int sum=0;
		Iterator<Integer> it = diffSet.iterator();
		for(int count=0;count<numberOfNumberRequiringOperatin;count++) {
			sum+=it.next();
		}
		System.out.println(sum);
		
	}
	
	public static int numOfOpr(int num) {
		int diff1=0;
        int num1=0;
		for(int i=num;;i++)//No end limit as when prime will be found we will break the loop.
        {
            if(checkPrime(i))
            {
                diff1=i-num;
                num1=i;
                break;
            }
        }
        
      return num1;
    }
	
	

	public static boolean checkPrime(int n) {
		boolean flag = true;
		if(n==0||n==1){  
			   flag= false;    
			  }else{  
			   for(int i=2;i<=(n/2);i++){      
			    if(n%i==0){      
			     flag= false;     
			     break;      
			    }      
			   }      
			  }
		return flag;
	}
}
