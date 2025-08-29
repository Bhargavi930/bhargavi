 public class Calculator
 {
	 public int add(int a.int b){return a+b;}
	 public int substrat(int a.int b){return a-b;}
	 public int multiply(int a.int b){return a*b;}
	 public int divide(int a.int b){if(b=0)throw new ArithmeticException("cannot divide by zero");return a/b;}
 public static void main(String[]args)
 {
	 Calculator calc=new Calculator();
	 System.out.println("addition;"+calc.add(10,5));
	 System.out.println("substration;"+calc.substract(10,5));
	 System.out.println("multiplication;"+calc.multiply(10,5));
	 System.out.println("division"+calc.divide(10,5));
 }
 }
	 