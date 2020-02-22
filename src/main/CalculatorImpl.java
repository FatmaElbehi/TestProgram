package main;

public class CalculatorImpl implements Calculator{


	@Override
	public int add(int a, int b) {
		int res = a;
		if (b > 0) {
			while(b-- != 0) {
	                        res++;
	                }
	        }
		else if (b < 0) {
			while(b++ != 0) {
	                        res--;
	                }
	        }
		return res;
	}

	

}
