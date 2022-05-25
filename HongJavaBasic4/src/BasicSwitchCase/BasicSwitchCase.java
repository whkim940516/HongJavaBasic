package BasicSwitchCase;

public class BasicSwitchCase {

	public static void main(String[] args) {

		String k07_jumin = "123456-1234567";   // 다음과 같은 주민번호로 하여 String 형태로 k07_jumin라는 변수를 선언한다. 
		
		switch(k07_jumin.charAt(7)) {          // switch case 문을 사용하는 데 charAt 메서드를 활용하여(charAt 메서드는 ~번째 자리수 하나를 가져오도록 해준다.)
			case '1' :					   // 7번째 자리에 해당하는 숫자를 확인하여 case에 대조하고 그에 맞는 코드를 출력하도록 한다.
				System.out.printf("20세기 전 태어난 남자 사람\n");     // case1의 경우(7번째 자리가 1) 20세기 전 태어난 남자 사람을 출력한다.  여기서는 break;를 걸지않았음에 주목하자
			case '2' :								
				System.out.printf("20세기 전 태어난 여자 사람\n");    //  case2의 경우(7번째 자리가 2) 20세기 전 태어난 여자 사람을 출력한다.
				break;											// 여기서 break;를 걸었으므로 위의 문장과 이 문장만 출력되고 아래서 부터는 출력되지 않는다.
			case '3' :
				System.out.printf("20세기 후 태어난 남자 사람\n");    //  case3의 경우(7번째 자리가 3) 20세기 후 태어난 남자 사람을 출력한다.
				break;
			case '4' :
				System.out.printf("20세기 후 태어난 여자 사람\n");	//  case4의 경우(7번째 자리가 4) 20세기 후 태어난 여자 사람을 출력한다.
				break;
			default :											// 조건식의 결과와 일치하는 case 문이 없을 경우 
				System.out.printf("사람\n");   				    // 사람이 출력되도록 한다.
				break;
		}
	}

}
