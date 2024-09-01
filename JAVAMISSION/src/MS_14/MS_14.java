package MS_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
	int no;
	String name;
	int score;
	String subject;
	
	public Person(int no, String name, int score, String subject) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.subject = subject;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + score + "\t" + subject;
	}
		
}
// 성적 순으로 내림차순 , 번호 순으로 오름차순 정렬하여 출력하시오
public class MS_14 {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		String filePath = "student.txt";
		System.out.println("번호\t이름\t성적\t반");
		
		
		try (
				// FileReader 객체를 사용하여 파일을 문자 단위로 입력
				FileReader fr = new FileReader(filePath);
				
				// BufferedReader 객체로 파일 데이터 입력 성능 향상
				BufferedReader br = new BufferedReader(fr);
		){
			String text;
			// readLine() : 파일의 문자 데이터를 한 줄씩 입력
			//				데이터가 더이상 없으며 null 반환
			while( (text = br.readLine()) != null) {
				String[] student=text.split("/");
				int aNo =Integer.parseInt(student[0]);
				String aName = student[1];
				int aScore = Integer.parseInt(student[2]);
				String aSubject = student[3];
				personList.add(new Person(aNo,aName,aScore,aSubject));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		personList.stream()
				  .sorted(Comparator.comparing(Person::getNo))
				  .sorted(Comparator.comparing(Person::getScore).reversed())
				  .forEach(p -> System.out.println(p));
		
	}
}
