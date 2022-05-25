package TaxcalcTeacher;

public class TaxcalcTeacher {
	
	// k07_val변수(세전가격)가 int로 값을 받고 k07_rate 변수(세율)가 int로 값을 리턴하는 세금을 계산하는 함수를 생성한다.
	public static int taxcal(int k07_netprice, int k07_taxrate) {     // 세전가격 105, 세율 10
		int k07_tax;    	// int 형으로 k07_tax 변수를 선언하였다.
		double k07_d_tax;   // double형으로 k07_d_tax 변수를 선언하였다.
		
		k07_d_tax = k07_netprice * k07_taxrate/100.0; // d_tax -> 105 * 10/100 = 10.5     100.0을 곱하면 결국엔 소수점 형태로 나오게 된다.
		k07_tax = (int) k07_d_tax;   // k07_d_tax 값인 10.5에서 (int)를 했으므로 결과가 10만 남게 된다.
		
		if(k07_d_tax != (double)k07_tax) {  // k07_d_tax는 10.5이고 (double)k07_tax는 10.0 이므로  10.5 == 10.0 
			k07_tax=k07_tax+1;				// k07_d_tax와 k07_tax의 값이 다를 때는 1을 더해준다.  
		}  		 							// 즉, 소수점이 있다면 세금을 1원 더 가져가는 식이다.
		
		return k07_tax;   // return 값으로 k07_tax를 주면 tax값을 계산하는 식이 된다.
	}

	public static void main(String[] args) {
		
		}

}
