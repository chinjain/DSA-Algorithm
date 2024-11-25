package designpattern;

public class Proxy_With_Caching_Logging {
	
	public static void main(String[] args) {
		
	}

}

interface Calculator{

	long factorial(long num);
	
}


class RealCalculator implements Calculator{
	
	
	@Override
	public long factorial(long number) {
		
		System.out.println("RealCalculator: Calculating factorial of " + number);
        return calculateFactorial(number);
        
	}

	private long calculateFactorial(long number) {
		
		if(number <= 1)
			return 1;
		
		return number * calculateFactorial(number - 1);
		
	}
	
}

class RealCalculatorProxy implements Calculator{
	
	@Override
	public long factorial(long num) {
		return 0L;
	}
	
	
}

