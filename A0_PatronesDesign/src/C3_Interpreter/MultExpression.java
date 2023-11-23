package C3_Interpreter;

import java.util.Stack;

public class MultExpression implements Expression{

	@Override
	public void interpret(Stack<Integer> stack) {
		int aux = stack.pop();
		stack.push(stack.pop() * aux);
	}

}
