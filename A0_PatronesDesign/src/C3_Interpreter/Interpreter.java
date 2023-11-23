package C3_Interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Interpreter {

	public Interpreter(String str) {
		
		for(String token : str.split(" ")) {
			if(token.equals("+")) {
				list.add(new PlusExpression());
			} else if(token.equals("-")) {
				list.add(new MinusExpression());
			} else if (token.equals("*")) {
				list.add(new MultExpression());
			} else if (token.equals("/")) {
				list.add(new DivExpression());
			} else {
				list.add(new NumberExpresion(Integer.valueOf(token)));
			}
		}
			
	}
	
	public int evaluate() {
		Stack<Integer> stack = new Stack<>();
		for(Expression e : list) {
			e.interpret(stack);
		}
		return stack.pop();
			
	}
	
	private List<Expression>list = new ArrayList<>();
	
}
