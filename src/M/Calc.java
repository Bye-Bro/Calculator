package M;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operatori; double num1,num2;
		Scanner calculator = new Scanner (System.in);
		System.out.println();
		
		System.out.println("Ju lutem zgjedhni operatorin: +, -, *, /, % : ");
		operatori = calculator.next().charAt(0);
		
		System.out.print("Shtypni numrin e parë: ");
		num1 = calculator.nextDouble();
		
		System.out.print("Shtypni numrin e dytë: ");
		num2 = calculator.nextDouble();
		
		switch(operatori) {
		case '+': System.out.println(num1 + num2);
		break;
		
		case '-': System.out.println(num1 - num2);
		break;
		
		case '*': System.out.println(num1 * num2);
		break;
		
		case '/': System.out.println(num1 / num2);
		break;
		
		case '%': System.out.println(num1 % num2);
		break;
		
		default: System.out.println("JU KENI ZGJEDHUR NJË OPERARATORË INVALID!");
		}
		Scanner close;
		

	}

}
