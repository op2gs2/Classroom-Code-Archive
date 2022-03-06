class arrayStack {
	int stack_size=10;
	int stack[]=new int[stack_size];
	private int top;
	public arrayStack(){
		top=-1;
	}
	//넘치는 스택의 공간을 늘려줌
	public void stackOverflow(){
		stack_size +=10;
		int[] temp_arr=new int[stack_size];
		for(int i=0; i<=top; i++)
			temp_arr[i]=stack[i];
		stack=temp_arr;
	}
	//값 대입
	void push(int x){
		top=top+1;
		if(top>stack_size){System.out.println("Stack Overflow");
		}
		else {
			stack[top]=x;
		}
	}
	//top 반환
	@SuppressWarnings("null")
	int peek(){
		if(top<0){
			System.out.println("Stack Underflow");
			return (Integer) null;
		}
		int value=stack[top];//채워라
		return value;  //
	}
	//값 추출
	int pop(){
		int y=0;
		if(top<0){System.out.println("Stack Underflow");}
		else {y=stack[top];
			top=top-1;
		}
		return y;
	}
	//삭제
	void remove(){//내 보낸 뒤에, top을 한 칸 내려줌
		if(top<0){
			System.out.println("Stack Underflow");
		}
		else{
			stack[top]=0;
			top-=1;
		}
	}
	//비어있는지 확인
	boolean empty(){
		if(top<0){return true;}
		else return false;
	}
}
