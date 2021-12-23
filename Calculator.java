package week1.day2;

public class Calculator {
		 
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public double subtract(double num1,double num2)
	{
	    return num1-num2;
	}
    public double multiply(double num1,double num2)
    {
        return num1*num2;
    }
    public int division(int num1,int num2)
    {
        return num1/num2;
    }
    
 public static void main(String[] args) {
	 Calculator calc = new Calculator();
	 System.out.println(calc.add(20,30 ));
	 System.out.println(calc.subtract(20, 30));
	 System.out.println(calc.multiply(20, 30));
	 System.out.println(calc.division(20, 30));
	
    }

}
	

	


