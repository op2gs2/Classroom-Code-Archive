package er;
import java.util.*;
public class ScannerTest {
	public static void main(String[] args) {
		//declear Scanner Object
		Scanner in = new Scanner(System.in);
		//Input name in name variance(String type)
		System.out.println("당신의 이름을 입력해주세요:");
		String name=in.next();
		//Print result
		System.out.println("당신의 이름은 "+name"입니다.");
	}

}
