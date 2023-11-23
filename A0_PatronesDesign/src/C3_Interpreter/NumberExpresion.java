package C3_Interpreter;

import java.util.Stack;

public class NumberExpresion implements Expression{

	public NumberExpresion(int number) {
		this.number = number;
	}

	@Override
	public void interpret(Stack<Integer> stack) {	
		stack.push(number);
	}
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}




	private int number;
	
}
