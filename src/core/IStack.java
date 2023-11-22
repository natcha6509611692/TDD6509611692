package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	void push(int elm);
	boolean isFull();
	int getTop();
	int pop();
}
