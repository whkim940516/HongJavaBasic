package ReadingNumbersAdvanced;

// 숫자 읽기 고급
// 1) 왼쪽에서 부터 한개씩 처리
// 2) 일,이,삼,...,구,영을 쓰고 단위를 쓴다.
// 해당 숫자가 몇 자리 인지 알아내야 첫 글자가 단위가 어떤 것인지 안다.

public class ReadingNumbersAdvanced {

	public static void main(String[] args) {

		int k07_iNumVal = 1001034567;					// int 형태로 k07_iNumVal을 변수명으로 하여 해당 숫자를 대입하여 선언한다.
		String k07_sNumVal = String.valueOf(k07_iNumVal); 		// 숫자에 valueof를 태우면 문자로 전환이 되며 이것을 k07_sNumVal을 변수명으로 하여 선언해주었다.
		String k07_sNumVoice = "";							// String 형태로 k07_sNumVoice를 변수명으로 하여 공백을 넣어주었다. 
		
		System.out.printf("==> %s [%d자리]\n", k07_sNumVal, k07_sNumVal.length());	// k07_sNumval은 문자열이므로 %s 서식을 사용하여 출력하도록 하였고
																			// k07_sNumval의 길이는 10이므로 10이 출력된다. 그 10은 숫자이므로
		int k07_i, k07_j;    // int 형태로 하여 k07_i, k07_j를 선언해준다.					// %d 서식을 사용하여 출력해준다.
		
		String [] k07_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};  // String 형태로 하여 k07_units를 변수명으로 하여 배열을 선언해주었으며 다음 내용이 들어가도록 하였다.
		String [] k07_unitX = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};	  // String 형태로 하여 k07_unitX를 변수명으로 하여 배열을 선언해주었으며 다음 내용이 들어가도록 하였다.
		
		k07_i = 0;		// k07_i 변수를 초기화 해주었다.
		k07_j = k07_sNumVal.length() - 1;	// k07_sNumVal.length()에서 1을 뺀 것을 k07_j변수에 대입해주었다.(1빼준 것은 인덱스를 맞추기 위함이다.)
									// length 함수는 말그대로 길이를 출력해주기 때문에 인덱스와 같이 생각해야할 경우 1을 빼줘야 한다.
		
		while(true) {							// while(true)는 무한 반복과 같다
			if(k07_i >= k07_sNumVal.length()) break;	// k07_i가 sNumval.length() 이상일 경우 반복문을 탈출한다.
			
			// substring 함수는 입력 인자값이 두개이며 => substring(int beginindex, int endindex)
			// 첫번째 입력받는 인자 값은 인자값이 한 개인 substring과 같이 가져올 문자열의 시작 부분을 지정한다.
			// 두번째 입력받는 인자 값은 가져올 문자열의 끝 부분을 지정하는 한다.
			// beginindex 위치에서 시작하여 endindex 바로 전 위치까지의 값을 리턴한다.
			System.out.printf("%s[%s]",
					k07_sNumVal.substring(k07_i, k07_i+1),	// 한 개씩 짜른 것들을 보여준다. 즉, 여기서는 k07_i에서부터 k07_i까지 의 값을 리턴한다. 예를 들면 1을 넣었을 경우 '일'을 리턴할 수 있게된다.
					k07_units[Integer.parseInt(k07_sNumVal.substring(k07_i, k07_i+1))]); // 문자를 int형으로 바꾸기 위해 Integer.parseInt를 사용했다.
																		 // 즉, 짜른 문자들을 수치형으로 바꿔 준후 그 문자들을 k07_units 배열에서 출력하도록 하였다.
			if(k07_sNumVal.substring(k07_i, k07_i+1).equals("0")) {     // k07_sNumVal에서 짜른 문자가 0과 같다면 즉, (1001034567)에서 0부분과 같아진다면
	
																	// k07_unitX가 "만" 이거나 "억" 이면
				if(k07_unitX.equals("만") || k07_unitX[k07_j].equals("억")) {    // 해당 자리가 0이면 단위만 붙여준다. 
					k07_sNumVoice = k07_sNumVoice + "" + k07_unitX[k07_j];		    // 단위 붙여준 것을 k07_sNumVoice에 대입해준다.
				} else {
					// 아무짓도 안함
				}
			}else {															// 두 번째 if문이 아니라면(짜른 문자가 0이 아니라면)
				k07_sNumVoice = k07_sNumVoice										// sNumVoice에 짜른 문자에 맞는 단위를 대입해준다. 
						+ k07_units[Integer.parseInt(k07_sNumVal.substring(k07_i, k07_i+1))]
						+ k07_unitX[k07_j];
			}
			k07_i++; k07_j--;				// k07_i는 1씩 증가하도록 하고 k07_j는 1씩 감소하도록 하였다.
		}
	System.out.printf("\n %s[%s]\n", k07_sNumVal, k07_sNumVoice);	// 마지막 문장으로 k07_sNumVal과 sNumVoie를 문자 서식으로 출력하기 위해 %s를 사용해주었다.
}
	
}


