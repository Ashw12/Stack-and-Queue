
package Lecture33_Stack_And_Queue;

public class Stack {
	protected int[]data;
    protected int top=0; //top se pta chalega value kaha rakhana hai
	public Stack(){//this also constructor.
		this.data=new int[5];//ager user hame kuchh bhi bolega to 5 size ka array bana lege .
		//ager user koi capcity lake dega to utani size kar array me value ho jayega.ye cap ke jagah replace ho jayega.
	}
	public Stack(int cap) {//this is constructor 
		this.data=new int[cap];//cap is capasity of array
	}
	public boolean isEmpty() { 
		return top==0;//stack khali hai abhi.
	}
	public boolean isFull() {
		return this.top==this.data.length;//stack full hoga is time par.
	}
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is full"); 
		}
		this.data[this.top]=item;//element fill kar rahe hai stack me 
		this.top++;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		this.top--;//element remove ho raha hai yaha par.
		return this.data[this.top];
	}
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return this.data[this.top-1];//ye btayega top par kun sa element hai o return kar do but top ko change mat kar.
	}
	public int size() {
		return this.top;//jaha top hoga wahi utna hi hamara size hoaga.
	}
	public void display() {
		for (int i = 0; i < this.top; i++) {
			System.out.print(this.data[i]+" ");
		}
		System.out.println();
	}
}

