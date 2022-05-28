package scoreJsonmake;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class scoreJsonmake {
	
	// 반복되는 것을 간소화 하기 위해 JSONObject 메서드를 만들어 주었다.
	// 하는 일이 반복되는 것 같아서 함수로 뺐다(하나씩 집어넣으려으니까 너무 많아서 함수로 만들어줌)
	// JSONObject를 반환하고 oneRec를 만들어서 매개변수 name, studentid, kor, eng, mat를 받도록 하였다.
	public static JSONObject oneRec(String k07_name, int k07_studentid, int k07_kor, int k07_eng, int k07_mat) { 
		JSONObject k07_dataObject = new JSONObject();	// dataObject라는 이름으로 JSONObject 객체를 생성해주었다.
		k07_dataObject.put("name", k07_name);	// JSONObject의 객체 dataObject에 name값을 넣어주었다.
		k07_dataObject.put("studentid", k07_studentid);	// JSONObject의 객체 dataObject에 studentid값을 넣어주었다.
		
		// JSON Array 생성
		JSONArray k07_score = new JSONArray();	// score라는 이름으로 JSONArray 객체를 생성해주었다.
		k07_score.add(k07_kor);		// JSONArray의 객체 score에 kor 값을 넣어주었다.
		k07_score.add(k07_eng);		// JSONArray의 객체 score에 eng 값을 넣어주었다.
		k07_score.add(k07_mat);		// JSONArray의 객체 score에 mat 값을 넣어주었다.
		k07_dataObject.put("score", k07_score);	 // JSONObject의 객체 dataObject에 score값을 넣어주었다.
		
		return k07_dataObject;
	}	// 최종적으로 가져올 것을 밑의 메인 메서드에 있는 코드에서 JSONObject 메서드로 붙여넣기 한다.

	public static void main(String[] args) {		// 메인 메서드 부분이다.
		
		// 최종 완성될 JSONObject 선언(전체)
		JSONObject k07_jsonObject = new JSONObject();	// JSONObject의 객체 jsonObject를 선언해주었다.(최종완성될)
		// 한명 성적의 JSON 정보를 담을 Array 선언
		JSONArray k07_datasArray = new JSONArray();		//  JSONArray의 객체 datasArray를 선언해주었다.
		
		// 한명 정보가 들어갈 JSONObject 선언
		JSONObject k07_dataObject = new JSONObject();	// JSONObject의 객체 dataObject를 선언해주었다.(한명정보)
		k07_dataObject.put("name", "나연");		// JSONObject의 객체 dataObject에 name값으로 나연을 입력해주었다.
		k07_dataObject.put("studentid", 209901);  // JSONObject의 객체 dataObject에 studentid값으로 209901을 입력해주었다.
		
		// JSON Array 생성
		JSONArray k07_score = new JSONArray();	// JSONArray의 객체 score를 선언해주었다.
		k07_score.add(90);		// JSONArray의 객체 score에 90을 넣어주었다.
		k07_score.add(100);		// JSONArray의 객체 score에 100을 넣어주었다.
		k07_score.add(95);		// JSONArray의 객체 score에 95를 넣어주었다.
		k07_dataObject.put("score", k07_score);	 // JSONObject의 객체 dataObject에 score에 score값을 넣어주었다.
		k07_datasArray.add(k07_dataObject);		// JSONObject의 객체 datasArray에 JSONObject의 객체인 dataObject 값을 넣어주었다.
		
		// 깔끔하게 함수 처리
		k07_datasArray.add(oneRec("정연", 209902, 100, 85, 75));	 // JSONObject 객체 datasArray에 oneRec함수를 넣어주었고 매개변수는 정연 것을 받았다.
		k07_datasArray.add(oneRec("모모", 209903, 90, 75, 85));	 // JSONObject 객체 datasArray에 oneRec함수를 넣어주었고 매개변수는 모모 것을 받았다.
		k07_datasArray.add(oneRec("사나", 209904, 90, 85, 75));	// JSONObject 객체 datasArray에 oneRec함수를 넣어주었고 매개변수는 사나 것을 받았다.
		k07_datasArray.add(oneRec("지효", 209905, 80, 75, 85));	// JSONObject 객체 datasArray에 oneRec함수를 넣어주었고 매개변수는 지효 것을 받았다.
		k07_datasArray.add(oneRec("미나", 209906, 90, 85, 55));	// JSONObject 객체 datasArray에 oneRec함수를 넣어주었고 매개변수는 미나 것을 받았다.
		k07_datasArray.add(oneRec("다연", 209907, 70, 75, 65));	// JSONObject 객체 datasArray에 oneRec함수를 넣어주었고 매개변수는 다연 것을 받았다.
		k07_datasArray.add(oneRec("채영", 209908, 100, 75, 95)); // JSONObject 객체 datasArray에 oneRec함수를 넣어주었고 매개변수는 채영 것을 받았다.
		k07_datasArray.add(oneRec("쯔위", 209909, 80, 65, 95));  // JSONObject 객체 datasArray에 oneRec함수를 넣어주었고 매개변수는 쯔위 것을 받았다.
	
	// 예외처리
	try {	// FileReader는 무언가를 읽어야 하기 때문에 파일이 존재해야하고 FileWriter는 파일이 존재하지 않아도 사용가능하다.(만들어줌)
		FileWriter k07_file = new FileWriter("C:\\dev\\javaChapter9_Data\\twiceScore.json");	// 해당 경로에 twiceScore.json파일을 만들 수 있는 FileWriter를 사용하여 file객체를 만들어주었다.
		k07_file.write(k07_datasArray.toJSONString());		// datasArray의 내용이 JSONString으로 변환된다.(toJSONString())
		k07_file.flush();	// flush는 메모리 작업을 할떄 다 쓰고 끝내라는 의미를 가진다. 통상적으로 사용한다고 보면 된다.
		k07_file.close();	// 파일을 닫아준다.
	}	catch(IOException e) { 
		e.printStackTrace();	//  에러 메세지의 발생 근원지를 찾아 단계별로 에러를 출력해준다.
	}
	System.out.println("JSON 만든거 : " + k07_datasArray);	// 만든 JSON파일의 최종 결과를 출력한다.
}
}
 	