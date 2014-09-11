package leecodeoj;

public class Program {

	public static void main(String[] args) {
		
		int output = 1^2&2;
		System.out.println(output);
		
		int divisor = 2;
		int tmp = divisor;
		for(int i=1; i<=3; i++) {
			tmp = tmp << 1;
			System.out.print("divisor shift left ");
			System.out.print(i);
			System.out.print(" times => ");
			System.out.println(tmp);
		}
				
	}

}
