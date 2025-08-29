 public class Calculator
 {
	 public int add(int a.int b){return a+b:}
	 public int substration(int a.int b){return a-b:}
	 public int multipy(int a.int b){return a*b:}
	 public int divide(int a.int b){if(b=0)
	 throw new arithmetic exception("cannot divide by zero"):return a/b:}
 public static void main(String[]args)
 {
	 Calculator calc=new Calculator();
	 System.out.println("addition;"+calc.add(10,5));
	 System.out.println("substration;"+calc.substract(10,5));
	 System.out.println("multiplication;"+calc.multipy(10,5));
	 System.out.println("division"+calc.divide(10,5));
 }
 }
	 