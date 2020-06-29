package codevita;
import java.util.*;
public class COLLISIONCOURSE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		List<Double> times = new ArrayList<Double>();
		List<Double> uniqueTimes = new ArrayList<Double>();
		while(c-- > 0)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int v = sc.nextInt();
			double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			double time = distance/v;
			times.add(time);
		}
		//System.out.println(times);
		for(int i=0;i<times.size();i++)
		{
			if(!uniqueTimes.contains(times.get(i)))
				uniqueTimes.add(times.get(i));
		}
		//System.out.println(uniqueTimes);
		int result = 0;
		for(int i=0;i<uniqueTimes.size();i++)
		{
			int occur = Collections.frequency(times, uniqueTimes.get(i));
			result += occur*(occur-1)/2;
		}
		System.out.println(result);
	}

}
