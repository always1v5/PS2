package base;

public class MyInteger {
	int iValue;
	
	public MyInteger(int intvalue){
		
		int iValue = intvalue;
		
	}
	
	public int getiValue(){
		return iValue;
		
	}
	
	public boolean isEven(){
		
		if (iValue % 2 == 0){
			return true;
		
		}
		return false;
		
	}
	public boolean isOdd(){
		if (iValue % 2 !=0 ){
			return true;
		}
		return false;
		
	}
	public boolean isPrime(){
		int number = 0;
		for (number = 2; number <= (iValue/2); number++){
			if (iValue % number != 0){
				return true;
			}
		}
			return false;
			}
		
	
	
		public static boolean isEven(int iValue){
			if (iValue % 2 == 0){
				
			return true;
			
			}
			return false;
			
		}
		public static boolean isOdd(int iValue){
			if (iValue % 2 !=0 ){
			
			return true;
			}
				return false;
			
		}
		public static boolean isPrime(int iValue){
			int number = 0;
			for (number = 2; number <= iValue/2; number++){
				if (iValue % number != 0){
					return true;
				}
			}
		
				return false;

		}
		
		
	
	public boolean isEven(MyInteger iValue){
		return iValue.isEven();
				
	}
	public boolean isOdd(MyInteger iValue){
		return iValue.isOdd();
				
	}
	public boolean isPrime(MyInteger iValue){
		return iValue.isPrime();
				
	}
				
			

	
	public boolean equals(int newvalue){
		return this.iValue == newvalue;
		
	}
	public boolean equals(MyInteger iValue){
		return equals(iValue.getiValue());
		
		
	}
}


