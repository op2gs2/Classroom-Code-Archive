package er;
public class Student {
	private int no; //�й�
	private int kor , eng, mat; // ����, ����, ���� ����
	
	//������
	public Student(int no_temp ,int kor_temp,int eng_temp, int mat_temp){
		no=no_temp;
		kor=kor_temp;
		eng=eng_temp;
		mat=mat_temp;
	}
	
	//���� �޼ҵ�
	public String getGrade(){
		int all_grade=kor+eng+mat; //������ �� ��
		int ave_grade=all_grade/3; //���� ���(�Ǽ�)
		//���� ������ ���ڷ� �ٲ�
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
	
	//�� ��ü�� ���� ������ ���
	public void print(){
		System.out.println("�й�: "+no+" ���� ����:"+kor+" ��������:"+eng+" ��������:"+mat+" ����:"+getGrade());
	}
	

}
