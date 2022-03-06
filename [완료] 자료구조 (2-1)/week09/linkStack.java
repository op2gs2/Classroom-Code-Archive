public class linkStack {
	listNode top;
	public linkStack(){
	}
	//값 대입
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
	//값 추출
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
	//top 반환
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
	//삭제
	void delete(){
		if(top==null){
			System.out.println("Stack underflow");
		}
		top=top.link;
	}
}
