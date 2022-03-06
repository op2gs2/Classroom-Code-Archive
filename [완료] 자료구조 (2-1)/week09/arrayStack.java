class arrayStack {
	int stack_size=10;
	int stack[]=new int[stack_size];
	private int top;
	public arrayStack(){
		top=-1;
	}
	//��ġ�� ������ ������ �÷���
	public void stackOverflow(){
		stack_size +=10;
		int[] temp_arr=new int[stack_size];
		for(int i=0; i<=top; i++)
			temp_arr[i]=stack[i];
		stack=temp_arr;
	}
	//�� ����
	void push(int x){
		top=top+1;
		if(top>stack_size){System.out.println("Stack Overflow");
		}
		else {
			stack[top]=x;
		}
	}
	//top ��ȯ
	@SuppressWarnings("null")
	int peek(){
		if(top<0){
			System.out.println("Stack Underflow");
			return (Integer) null;
		}
		int value=stack[top];//ä����
		return value;  //
	}
	//�� ����
	int pop(){
		int y=0;
		if(top<0){System.out.println("Stack Underflow");}
		else {y=stack[top];
			top=top-1;
		}
		return y;
	}
	//����
	void remove(){//�� ���� �ڿ�, top�� �� ĭ ������
		if(top<0){
			System.out.println("Stack Underflow");
		}
		else{
			stack[top]=0;
			top-=1;
		}
	}
	//����ִ��� Ȯ��
	boolean empty(){
		if(top<0){return true;}
		else return false;
	}
}
