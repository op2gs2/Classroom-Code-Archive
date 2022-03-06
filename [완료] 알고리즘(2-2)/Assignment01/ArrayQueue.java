package level;

class ArrayQueue implements Queue {
	public int front; 
	public int rear;
	public int count; 
	public int queueSize; 
	public int increment;
	public Object[] itemArray;

	public ArrayQueue()
	{
		front = 0;
		rear = 0;
		count = 0;
		queueSize = 50; 
		increment = 10; 
		itemArray = new Object[queueSize];
	}

	public boolean isEmpty() {
		return (count == 0);
	}

	public void enqueue(Object x)  //(1) 
	{
		if (count == queueSize)
			queueFull(); 
		itemArray[rear] = x; 
		rear = (rear + 1) % queueSize;
		count++;
	}

	public void queueFull()  //(2)
	{
		int oldsize = queueSize; 
		queueSize += increment; 
		Object[] tempArray = new Object[queueSize];
		for (int i = 0; i < count; i++) 
		{
			tempArray[i] = itemArray[front];
			front = (front + 1) % oldsize;
		}
		itemArray = tempArray;
		front = 0;
		rear = count;
	}

	public Object dequeue() //(3)
	{
		if (isEmpty())
			return null;
		Object item = itemArray[front]; 
		front = (front + 1) % queueSize;
		count--;
		return item;
	}

} 

