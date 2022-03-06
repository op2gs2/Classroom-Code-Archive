public class linkStack {
	listNode top;
	public linkStack(){
	}
	//�� ����
	void push(int x){
		listNode newNode = new listNode();
		newNode.data=x;
		if(top==null){ // stack empty
			top=newNode;
			top.link=null;
		}
		else {
			newNode.link=top;
			top=newNode;
		}
	}
	//�� ����
	int pop(){
		int x;
		if(top==null){System.out.println("Stack underflow");
			return -1;
		}
		else{ 
			x=top.data;
			top=top.link;
			return x;
		}
	}
	//top ��ȯ
	int peek(){
		if(top==null){
			System.out.println("Stack underflow");
			return -1;
		}
		else{
			int temp_data=top.data;
			return temp_data;
		}
		
	}
	//����
	void delete(){
		if(top==null){
			System.out.println("Stack underflow");
		}
		top=top.link;
	}
}
