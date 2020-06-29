package codevita;
import java.util.*;
import java.math.*;
public class LAZYSTUDENT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int t = sc.nextInt();
			int m = sc.nextInt();
			int u = n-m;
			BigInteger den = fact(n).multiply(fact(u-t));
			BigInteger num = den.subtract(fact(u).multiply(fact(n-t)));
			BigInteger mod = BigInteger.valueOf(1000000007);
			num = num.multiply(den.modInverse(mod));
			System.out.println(num);
		}
	}
	static BigInteger fact(int n) {
		BigInteger fact = BigInteger.valueOf(1);
		for(int i=2;i<=n;i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

}
