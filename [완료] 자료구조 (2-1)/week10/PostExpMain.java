import java.util.Stack;


class EvalPost{
	private String str;
	public int evalPostfix(String postfix){
			//���� ��ü�� ����
			Stack s1 =new Stack();
			//�ʿ��� �������� ����
			str=postfix; //�ҷ����̴� ���� str�� ����
			int op1, op2, value;//�ǿ����� 1,2�� ���� �����ϴº���
			//(��)�����ڰ� ���� �� �� ����
			for(int i=0;str.charAt(i)!='$';i++){
				//�����ڰ� �ƴ� ���
				if (str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/') {
					//���ÿ� ����
					value=str.charAt(i)-'0'; //�����θ��������
					s1.push(value);
				}
				//�������� ���
				else{
					//�� �ǿ����ڸ� ������
					op2=(Integer)s1.pop();
					op1=(Integer)s1.pop();
					//�����ڿ� ���� ��� �ϰ� �ٽ� ���ÿ� ����
					switch(str.charAt(i)){
						case '+' :s1.push(op1+op2); break;
						case '-' :s1.push(op1-op2); break;
						case '/' :s1.push(op1/op2); break;
						case '*' :s1.push(op1*op2); break;
						//ä����
					}
				}
			}
			//���� ��� ��� ��ȯ
			return (Integer)s1.pop();
		}
	}
public class PostExpMain{
	public static void main(String[] arg){
		//EvalPost ��ü ����
		EvalPost post1 = new EvalPost();
		int result;
		String exp="35*62/-$"; //������������ְ��׽�Ʈ�غ��ƶ�. ���ڴ�1~9, �����ڴ�+-*/������
		System.out.printf("\n����ǥ���: %s",exp);
		result = post1.evalPostfix(exp);
		System.out.printf("\n������= %d", result);
		}
	}
