// 심심한데 함수 한번 만들어 볼까?
//대충 main에 써있는 public static void를 배껴보기
//일단 public은 이 클래스 Tax1밖에서도 사용할 수 있다는 의미인데
//어차피 main은 같은 클래스 안이라서 상관없고
//static은 자리를 차지하고 .. 부를때 new로 부르는게 아니라는 거..
//void는 반환값이 없다는 의미 하지만 우리는 세금값 int를 반환한다.abstract

// 세금은 내가 손해 안보려면 1원미만 금액이 생기면 무조건 1원 더 받을 것
// 함수, integer-double연산으로 올려버림, 형변환 등 연습하기

package Tax1;

// static은 자리를 차지하고 부를 때 new로 부르는게 아니다 !!!
// void는 반환값이 없다는 의미이지만 우리는 세금 값 int를 반환한다. !!

public class Tax1 {
	
	public static int netprice(int k07_price, double k07_rate) {
		return (int)(k07_price/(1+k07_rate));  // 세전가격은 k07_price 즉, 소비자 가격을 1+세율(1 + k07_rate)로 나눈 것이다.  
	}
	
	public static void main(String[] args) {
		int k07_price = 1234; // 상품의 세전가격은 1234원이며 해당 변수를 k07_price로 짓고 int 형태로 선언하였다.
		double k07_tax_rate = 0.1; // 세율은 0.1이며 해당 변수를 k07_tax_rate로 짓고 double 형태로 선언하였다.
		
		int k07_netprice = netprice(k07_price, k07_tax_rate);  // 위의 함수를 적용하여 나온 값을 k07_netprice 변수에 대입해주었으면 int 형태로 선언하였다.
		int k07_tax = k07_price - k07_netprice;  			   // k07_price(소비자 가격) - k07_netprice(세전가격)을 계산해주면 세금이 나오며 이를 
															   // k07_tax로 짓고 int 형태로 선언해주었다.
		System.out.printf("**************************************\n");
		System.out.printf("*    소비자가,  세전가격, 세금 계산         *\n");
		System.out.printf("소비자가격: %d, 세전가격: %d, 세금: %d\n", k07_price, k07_netprice, k07_tax);  // 소비자가격, 세전가격, 세금 모두 %d를 사용해 정수형태로 출력해주었다.
		System.out.printf("**************************************\n");
	}

}
