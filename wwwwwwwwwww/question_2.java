import java.io.*; 
import java.util.*; 

class ReverseExpression {
	public int CalculateExpression(String[] StringArrays)
	{ 
		Stack<String> stack = new Stack<String>(); 
		int number1, number2; 
		String result = "";
		String charachterArray; 
		int value = 0; 
		String Concatenate = "";
 
		for (int i = 0; i < StringArrays.length; i++) { 
			if (!StringArrays[i].equals("+") && !StringArrays[i].equals("-") && !StringArrays[i].equals("*") && !StringArrays[i].equals("/")) {
                stack.push(StringArrays[i]); 
                System.out.println(stack);
				continue; 
			} 
			else { 
                charachterArray = StringArrays[i]; 
                System.out.println(charachterArray);
			} 

			// Switch-Case 
			switch (charachterArray) { 
			case "+": 
				number1 = Integer.parseInt(stack.pop()); 
				number2 = Integer.parseInt(stack.pop()); 
				value = number1 + number2; 
				result = Concatenate + value;
                stack.push(result); 
                System.out.println(stack);
				break; 

			case "-": 
				number1 = Integer.parseInt(stack.pop()); 
				number2 = Integer.parseInt(stack.pop()); 
				value = number1 - number2; 
				result = Concatenate + value;
                stack.push(result); 
                System.out.println(stack);
				break; 

			case "*": 
				number1 = Integer.parseInt(stack.pop()); 
				number2 = Integer.parseInt(stack.pop()); 
				value = number1 * number2; 
				result = Concatenate + value;
                stack.push(result); 
                System.out.println(stack);
				break; 

			case "/": 
				number1 = Integer.parseInt(stack.pop()); 
				number2 = Integer.parseInt(stack.pop()); 
				value = number2 / number1; 
				result = Concatenate + value;
                stack.push(result); 
                System.out.println(stack);
				break; 

			default: 
				continue; 
			} 
		} 
		return Integer.parseInt(stack.pop()); 
    } 
    
    
} 

class question_2 { 
	public static void main(String[] args) 
	{
		String[] stringbreaker = {"2","10","*","4","/"};
		ReverseExpression obj = new ReverseExpression();
		int result = obj.CalculateExpression(stringbreaker);
		System.out.println(result); 
	} 
}
