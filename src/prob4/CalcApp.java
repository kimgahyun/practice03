package prob4;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// Scanner 와  String 클래스의 split 함수를 사용합니다.
		
		Scanner sc = new Scanner( System.in );
		System.out.print( ">>" );
		String expression = sc.nextLine();
		
		if( "quit".equals( expression ) == true )
		{
			return;
		}
		// lValue, operator, rValue로 구분
		String[] tokens = expression.split(" ");
		int lValue = Integer.parseInt( tokens[0] );
		String operator = tokens[1];
		int rValue = Integer.parseInt( tokens[2] );		
		
		switch( operator )
		{
		case "+":
			Add add = new Add();
			add.setValue( lValue, rValue );
			System.out.println(">>"+add.calculate());
			break;
		case "-":
			Min min = new Min();
			min.setValue( lValue, rValue );
			System.out.println(">>"+min.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue( lValue, rValue );
			System.out.println(">>"+mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue( lValue, rValue );	
			System.out.println(">>"+div.calculate());
			break;
		default:
			System.out.println("잘못됨");
		}

		sc.close();
	}
}
