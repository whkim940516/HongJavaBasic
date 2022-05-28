package FilePurification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FilePurification {

	public static void main(String[] args) {
		
		// \는 특수문자이므로 \\ 두개를 써야한다.
		File f = new File("");     // 풀경로
		BufferedReader br = new BufferedReader(new FileReader(f));
			
		File f1 = new File("")  경로
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
		
		String readtxt;
		
		int cnt = 0; 
		int wcnt = 0;
		
		while((readtxt = br.readLine()) != null) {
			StringBuffer s= new StringBuffer();
			String[] field = readtxt.split("%_%");
			
			if(field.length > 2&&field[2].replace("^", "").trim().substring(0, 1).equals("A")) {		// 코드가 A로 시작하는 것이 주식
				s.append(field[0].replace("^", "").trim());
			}
			bw1.write(s.toString());
			bw1.newLine();
			wcnt++;
		}
		cnt++;
	}
	br.close();
	bw1.close();
	
	System.out.printf("Program End[%d][%d]records\n", cnt, wcnt);
	
	}

}
