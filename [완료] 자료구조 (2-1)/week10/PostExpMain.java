import java.util.Stack;


class EvalPost{
	private String str;
	public int evalPostfix(String postfix){
			//스택 객체를 생성
			Stack s1 =new Stack();
			//필요한 변수들을 선언
			str=postfix; //불러들이는 값을 str에 저장
			int op1, op2, value;//피연산자 1,2와 값을 저장하는변수
			//(피)연산자가 없어 질 때 까지
			for(int i=0;str.charAt(i)!='$';i++){
				//연산자가 아닐 경우
				if (str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/') {
					//스택에 저장
					value=str.charAt(i)-'0'; //정수로만들기위해
					s1.push(value);
				}
				//연산자인 경우
				else{
					//각 피연산자를 빼낸뒤
					op2=(Integer)s1.pop();
					op1=(Integer)s1.pop();
					//연산자에 따라 계산 하고 다시 스택에 저장
					switch(str.charAt(i)){
						case '+' :s1.push(op1+op2); break;
						case '-' :s1.push(op1-op2); break;
						case '/' :s1.push(op1/op2); break;
						case '*' :s1.push(op1*op2); break;
						//채워라
					}
				}
			}
			//최종 계산 결과 반환
			return (Integer)s1.pop();
		}
	}
public class PostExpMain{
	public static void main(String[] arg){
		//EvalPost 객체 생성
		EvalPost post1 = new EvalPost();
		int result;
		String exp="35*62/-$"; //후위연산식을넣고테스트해보아라. 숫자는1~9, 연산자는+-*/만가능
		System.out.printf("\n후위표기식: %s",exp);
		result = post1.evalPostfix(exp);
		System.out.printf("\n연산결과= %d", result);
		}
	}
