package MS_13;

//import java.text.DecimalFormat;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;

public class MS_13_Test {

	public static void main(String[] args) {
		// 응모한 로또 번호 저장하는 ArrayList
		ArrayList<ArrayList<Integer>> lotto = new ArrayList<ArrayList<Integer>>();
		
		// 자동/수동 옵션 여부 저장 하는 ArrayList
		ArrayList<String> randOption = new ArrayList<String>();			
		
		// 당첨 번호 저장하는 ArrayList
		ArrayList<Integer> lottoList = new ArrayList<Integer>();		
		
		
		MS_13 lottoria = MS_13.getInstance();

		lottoria.buyLotto(lotto, randOption); 	// 복권번호 지정 메소드

		lottoria.printReceipt(lotto, randOption); 	// 지정한 복권 번호, 날짜 출력 메소드
		
		lottoria.lottoDraw(lottoList); 	// 번호 추첨 후 출력 메소드
		
		lottoria.resPrint(lotto, randOption, lottoList);	// 당첨 결과 출력 메소드
	}
}
