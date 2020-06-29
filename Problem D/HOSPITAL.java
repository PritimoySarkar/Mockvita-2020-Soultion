package codevita;
import java.util.*;
public class HOSPITAL {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		long target = sc.nextLong();
		List<Integer> months = new ArrayList<Integer>(
					Arrays.asList(31,28,31,30,31,30,31,31,30,31,30,31)
				);
		List<Integer> patients = new ArrayList<Integer>();
		for(int i=0;i<months.size();i++)
		{
			for(int j=1;j<=months.get(i);j++)
			{
				patients.add((int)Math.pow(6-i-1, 2) + Math.abs(j-15));
			}
		}
		int flag=0;
		for(int i=0;i<n;i++)
		{
			long cost = 0;
			for(int j=0;j<patients.size();j++)
			{
				if(patients.get(j) >= n)
				{
					cost += ((i*r1) + (n-i)*r2);
				}
				else
				{
					int nontv = n-i;
					if(patients.get(j)-nontv <= 0)
					{
						cost += patients.get(j)*r2;
					}
					else
					{
						cost += (((patients.get(j)-nontv)*r1)+(nontv*r2));
					}
				}
			}
			if(cost >= target)
			{
				System.out.println(i);
				flag=1;
				break;
			}
		}
		if(flag == 0)
			System.out.println(n);
	}
}
