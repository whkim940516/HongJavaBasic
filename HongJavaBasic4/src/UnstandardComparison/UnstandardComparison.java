package UnstandardComparison;

// ������ ��
// �Ŵ� ������ ��¥�� �ٸ��� ��Ģ�� ����.
// ������ �Ƴ��� ���� ���������� !

public class UnstandardComparison {

	public static void main(String[] args) {

		for(int i = 1; i < 13; i++) {		  // k07_i�� 1���� �����Ͽ� 12���� 1�� �����Ѵ�.
			System.out.printf(" %d�� =>", i);		// �����ϴ� ��� k07_i�� ����Ѵ�.
			for(int j = 1; j < 32; j++) {	  // k07_j�� 1���� 31���� 1�� �����Ѵ�.
				System.out.printf("%d,", j);		// �����ϴ� ��� k07_j�� ����Ѵ�.
				
				if(i==1 && j == 31) break;    // 1���� 31�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
				if(i==2 && j == 28) break;	  // 2���� 28�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
				if(i==3 && j == 31) break;	  // 3���� 31�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
				if(i==4 && j == 30) break;	  // 4���� 30�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
				if(i==5 && j == 31) break;    // 5���� 31�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
				if(i==6 && j == 30) break;    // 6���� 30�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
				if(i==7 && j == 31) break;    // 7���� 31�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
				if(i==8 && j == 31) break;    // 8���� 31�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
				if(i==9 && j == 30) break;    // 9���� 30�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
				if(i==10 && j == 31) break;   // 10���� 31�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
				if(i==11 && j == 30) break;   // 11���� 30�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
				if(i==12 && j == 31) break;   // 12���� 31�� ���� �ֵ��� �ϰ� break�� �Ǵ�.
			}
			System.out.printf("\n");
		}
	}

}
