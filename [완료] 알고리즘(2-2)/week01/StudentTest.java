package er;
import java.util.*;
public class StudentTest {
	public static void main(String[] args) {
		//Scanner 객체 선언
		Scanner in =new Scanner(System.in);
		//stu 객체를 선언하고 필요한 값 받아내기
		System.out.println("학번, 국어/영어/수학 성적을 입력해주세요.");
		Student stu = new Student(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
		//결과 출력
		stu.print();
		//Scanner 객체 종료
		in.close();
	}

}
