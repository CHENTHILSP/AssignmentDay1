package julyday5;

public class PrimeNumber {

	public static void main(String[] args) {
		int n= 84;
	    boolean a = false;
	    for (int i = 2; i <= n-2; ++i) {
	      if (n % i == 0) {
	        a = true;
	      }
	    }
	    if (a)
	      System.out.println("Non prime Number");
	    else
	      System.out.println("prime Number");

	}

}
