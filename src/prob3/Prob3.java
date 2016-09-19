package prob3;

public class Prob3 {

	public static void main(String[] args) {
		CurrencyConverter.setRate( 1117.00 );
		
		double dollar = CurrencyConverter.toDollar( 1000000 );
		System.out.println( "백만원은 " + dollar + "달러입니다." );
		
		double krw = CurrencyConverter.toKRW( 100 );
		System.out.println( "백달러는 " + krw + "원 입니다." );		
	}
}
