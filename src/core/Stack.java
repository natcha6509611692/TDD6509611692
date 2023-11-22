package core;

import java.util.ArrayList;

public class Stack implements IStack {
	
	private ArrayList<Integer> stack;
	
	public Stack() {
		stack = new ArrayList<>();
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public int getSize() {
		if(stack != null) {
			return stack.size();
		}
		else
			return 0;
	}

	@Override
	public void push(int elm) {
		stack.add(elm);
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int getTop() {
		return stack.get(getSize()-1);
	}
	
	public int pop() {
		return stack.remove(stack.size()-1);
	}

}
