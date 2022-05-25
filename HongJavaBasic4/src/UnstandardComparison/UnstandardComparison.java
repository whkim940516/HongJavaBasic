package UnstandardComparison;

// 비정형 비교
// 매달 마지막 날짜가 다른데 규칙이 없다.
// 문장을 아끼지 말고 직관적으로 !

public class UnstandardComparison {

	public static void main(String[] args) {

		for(int i = 1; i < 13; i++) {		  // k07_i는 1부터 시작하여 12까지 1씩 증가한다.
			System.out.printf(" %d월 =>", i);		// 증가하는 대로 k07_i를 출력한다.
			for(int j = 1; j < 32; j++) {	  // k07_j는 1부터 31까지 1씩 증가한다.
				System.out.printf("%d,", j);		// 증가하는 대로 k07_j를 출력한다.
				
				if(i==1 && j == 31) break;    // 1월은 31일 까지 있도록 하고 break를 건다.
				if(i==2 && j == 28) break;	  // 2월은 28일 까지 있도록 하고 break를 건다.
				if(i==3 && j == 31) break;	  // 3월은 31일 까지 있도록 하고 break를 건다.
				if(i==4 && j == 30) break;	  // 4월은 30일 까지 있도록 하고 break를 건다.
				if(i==5 && j == 31) break;    // 5월은 31일 까지 있도록 하고 break를 건다.
				if(i==6 && j == 30) break;    // 6월은 30일 까지 있도록 하고 break를 건다.
				if(i==7 && j == 31) break;    // 7월은 31일 까지 있도록 하고 break를 건다.
				if(i==8 && j == 31) break;    // 8월은 31일 까지 있도록 하고 break를 건다.
				if(i==9 && j == 30) break;    // 9월은 30일 까지 있도록 하고 break를 건다.
				if(i==10 && j == 31) break;   // 10월은 31일 까지 있도록 하고 break를 건다.
				if(i==11 && j == 30) break;   // 11월은 30일 까지 있도록 하고 break를 건다.
				if(i==12 && j == 31) break;   // 12월은 31일 까지 있도록 하고 break를 건다.
			}
			System.out.printf("\n");
		}
	}

}
