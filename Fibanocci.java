package julyday5;

public class Fibanocci {

	public static void main(String[] args) {
		int Firstnumber=0;
		int Secondnumber=1;
		int Sum=0;{
			System.out.println("firstNumber");
		}
		for(int i=1;i<11;i++) {
		Sum=Firstnumber+Secondnumber;
		Firstnumber=Secondnumber;
		Secondnumber=Sum;
		System.out.println(Sum);
		
		
	}



	}
}


