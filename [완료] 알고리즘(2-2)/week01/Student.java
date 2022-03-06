package er;
public class Student {
	private int no; //학번
	private int kor , eng, mat; // 국어, 영어, 수학 점수
	
	//생성자
	public Student(int no_temp ,int kor_temp,int eng_temp, int mat_temp){
		no=no_temp;
		kor=kor_temp;
		eng=eng_temp;
		mat=mat_temp;
	}
	
	//학점 메소드
	public String getGrade(){
		int all_grade=kor+eng+mat; //성적의 총 합
		int ave_grade=all_grade/3; //학점 평균(실수)
		//이하 학점을 문자로 바꿈
		if(ave_grade>=90){
			return "A";
		}
		else if(ave_grade>=80){
			return "B";
		}
		else if(ave_grade>=70){
			return "C";
		}
		else if(ave_grade>=60){
			return "D";
		}
		else{
			return "F";
		}
	}
	
	//이 객체에 대한 정보를 출력
	public void print(){
		System.out.println("학번: "+no+" 국어 점수:"+kor+" 영어점수:"+eng+" 수학점수:"+mat+" 학점:"+getGrade());
	}
	

}
