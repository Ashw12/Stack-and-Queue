package Lecture33_Stack_And_Queue;
//jab hamara data wala array full ho gya to ham linear queue me data add nhi kar pa raha tab use kiye circular queue.
public class Circular_Queue {
	protected int[] data;
	protected int front=0;
	private int size=0;
	public Circular_Queue() {
		this.data=new int[5];
	}
	 public Circular_Queue(int cap) {
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
		 int i=(this.size+this.front)%this.data.length;
		 this.data[i]=item;//Queue me data fill kara rahe hai yaha par.
		 this.size++;
	 }
	 public int Dequeue() throws Exception {
		 if(isEmpty()) {
			 throw new Exception("queue is empty");
		 }
		 int rv=this.data[this.front];//Queue se data nikal rahe yaha par
		 this.front=(this.front+1)%this.data.length;//rv means remove.
		 this.size--;//jitna element queue me bachega uska size  .
		 return rv;
	 }
	 public int getfront() throws Exception {
		 if(isEmpty()) {
			 throw new Exception("queue is empty");
		 }
		 return this .data[this.front];
	 }
	 public void display() {
		 for (int i = 0; i < this.size; i++) {
			 int idx=(this.front+i)%this.data.length;
			System.out.print(this.data[idx]+" ");
		}
		 System.out.println();
	 }

}
 