package Lecture33_Stack_And_Queue;
public class Linear_Queue {
	private int[] data;
	private int front=0;
	private int size=0;
	public Linear_Queue() {
		this.data=new int[5];
	}
	 public Linear_Queue(int cap) {
		 this.data=new int[cap];
	 }
	 public boolean isEmpty() {
		 return this.size==0;//queue khali hai.
	 }
	 public boolean isFull() {
		 return this.size==this.data.length;//queue full hai.
	 }
	 public int size() {
		 return this.size;//size me jo value hai o return hoga.
	 }
	 public void Enqueue(int item) throws Exception {
		 if(isFull()) {
			 throw new Exception("queue is full");
		 }
		 int i=this.size+this.front;
		 this.data[i]=item;//Queue me data fill kara rahe hai yaha par.
		 this.size++;
	 }
	 public int Dequeue(int item) throws Exception {
		 if(isEmpty()) {
			 throw new Exception("queue is empty");
		 }
		 int rv=this.data[this.front];//Queue se data nikal rahe yaha par
		 this.front++;//rv means remove.
		 this.size--;//jitna element queue me bachega uska size  .
		 return rv;
	 }
	 public int getfront() throws Exception {
		 if(isEmpty()) {
			 throw new Exception("queue is empty");
		 }
		 return this .data[this.front];
	 }
}
