package codevita;
import java.util.*;
public class PRIMEFIBONACCI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		List<Integer> primesFirst = new ArrayList<Integer>();
		primesFirst = getPrimes(n1,n2);
//		System.out.println("Generating all primes between " + n1 + " and " + n2);
//		System.out.println(primesFirst);
		List<Integer> primesSecond = new ArrayList<Integer>();
		primesSecond = getSecondList(primesFirst);
		//System.out.println(primesSecond);
		List<Integer> primesThird = new ArrayList<Integer>();
		for(int i=0;i<primesSecond.size();i++)
		{
			if(isPrime(primesSecond.get(i)))
				primesThird.add(primesSecond.get(i));
		}
		//System.out.println(primesThird);
		long low = primesThird.get(0), high = primesThird.get(0);
		for(int i=0;i<primesThird.size();i++)
		{
			if(primesThird.get(i) < low)
				low = primesThird.get(i);
		}
		for(int i=0;i<primesThird.size();i++)
		{
			if(primesThird.get(i) > high)
				high = primesThird.get(i);
		}
//		System.out.println("size = " + primesThird.size());
//		System.out.println("Low = " + low);
//		System.out.println("High = " + high);
		long result = getFibonacciDigit(primesThird.size(),low,high);
		System.out.println(result);
	}
	
	private static long getFibonacciDigit(int n, long low, long high)
	{
		int count = 1;
		long next = 0;
		while(count < n-1)
		{
			next = low+high;
			low = high;
			high = next;
			count++;
		}
		return next;
		
	}
	
	private static boolean isPrime(int n)
	{
		if (n<=1)
			return false;
		for(int i=2;i<n;i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}

	private static List<Integer> getSecondList(List<Integer> list)
	{
		List<Integer> secondList = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.size();j++)
			{
				if(i!=j)
				{
					String str = Integer.toString(list.get(i)) + Integer.toString(list.get(j));
					//secondList.add(Integer.parseInt(str));
					int num = Integer.parseInt(str);
					if (!secondList.contains(num))
						secondList.add(num);
				}
			}
		}
		return secondList;
	}
	
	private static List<Integer> getPrimes(int a, int b)
	{
		List<Integer> finalPrimes = new ArrayList<Integer>();
		int flag;
		if (a == 1) { 
	        finalPrimes.add(a); 
	        a++; 
	        if (b >= 2) { 
	        	finalPrimes.add(a);
	            a++; 
	        }
	    }
		if (a == 2) 
	        finalPrimes.add(a);
		if (a % 2 == 0) 
	        a++;
		for (int i = a; i <= b; i = i + 2) {  
	        flag = 1; 
	        for (int j = 2; j * j <= i; ++j) { 
	            if (i % j == 0) { 
	                flag = 0; 
	                break; 
	            } 
	        } 
	        if (flag == 1) 
	            finalPrimes.add(i); 
	    }
		return finalPrimes;
	}
	
}
