package ApplyToPhysicalFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ApplyToPhysicalFiles {

	public static void main(String[] args) throws IOException {
		
		// \는 특수문자이므로 \\ 두개를 써야한다.
		File f = new File("C:\\Users\\김우형\\Desktop\\csv로변환_무료와이파이정보.csv");  // txt
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt;
		
		// 한줄을 먼저 읽어야 필드명을 알 수 있다.
		if((readtxt = br.readLine()) == null) {
			System.out.println();
			return;
		}
		String[] field_name = readtxt.split(",");
		
		int LineCnt = 0;
		while((readtxt = br.readLine()) != null)  {
			
			String[] field = readtxt.split(",");
			System.out.printf("**[%d번째 항목]********************\n", LineCnt);
			for(int j = 0; j < field_name.length; j++) {
				System.out.printf(" %s : %s\n", field_name[j], field[j]);
			}
			System.out.printf("**************************************\n");
			if(LineCnt == 100) break;
			LineCnt++;
		}
		br.close();
	}

}
