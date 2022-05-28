package scoreJsonParsing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class scoreJsonParsing {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		JSONParser k07_parser = new JSONParser();	// parser라는 이름으로 JSONParser의 객체를 선언해준다.
		
		// JSONParser의 객체 parser에서 parse 메서드에 FileReader를 태워서 twiceScore.json 을 읽어오도록하고 obj라는 이름으로 Object의 객체에 넣어준다.
		Object k07_obj = k07_parser.parse(new FileReader("C:\\dev\\javaChapter9_Data\\twiceScore.json"));  
		
		// JSONObject json object = (JSONObject) obj;
		JSONArray k07_array = (JSONArray)k07_obj;	// JSONArray의 객체 array를 만들어준다. 딱히 키가 없는 Array라 이런 식으로 연결할 수 있다.
		
		System.out.println("***************************************");	// 구분하기 위한 헤더이다.
		for(int k07_i = 0; k07_i < k07_array.size(); k07_i++) {		// i=0부터 Array의 크기만큼 반복한다.
			JSONObject k07_result = (JSONObject)  k07_array.get(k07_i);		// Array에서 하나를 빼와서 JSONObject의 객체 result에 대입해준다.
			System.out.println("이름 : " + k07_result.get("name"));	// JSONObject의 객체인 result에 name을 가져오도록한다.
			System.out.println("학번 : " + k07_result.get("studentid"));	// JSONObject의 객체인 result에 studentid를 가져오도록한다.
			
			JSONArray k07_score = (JSONArray) k07_result.get("score");	// JSONObjct의 객체인 result에 score를 가져오고 이를 JSONArray의 객체 score에 넣어준다.
			long k07_kor = (long)k07_score.get(0);	// 배열 중 첫번째 것은 국어이며 이 값을 kor에 대입해준다. (혹시 모르기 때문에 long으로 형변환을 해주었다.)
			long k07_eng = (long)k07_score.get(1);	// 배열 중 두번째 것은 영어이며 이 값을 eng에 대입해준다.
			long k07_mat = (long)k07_score.get(2);	// 배열 중 세번째 것은 수학이며 이 값을 mat에 대입해준다. 이때 잘못 만들어진 json이 배열이 3개가 아니면 에러가 발생할 것이다.
			System.out.println("국어 : " + k07_kor);	// 국어 점수를 출력해준다.
			System.out.println("영어 : " + k07_eng);	// 영어 점수를 출력해준다.
			System.out.println("수학 : " + k07_mat);	// 수학 점수를 출력해준다.
			System.out.println("총점 : " + (k07_kor + k07_eng + k07_mat));	// 총점을 출력해준다.
			System.out.println("평균 : " + ((k07_kor + k07_eng + k07_mat)/3.0));	// 평균을 출력해준다.
			System.out.println("***************************************");	// 구분하기 위한 출력물이다.

		}
		
	}

}

