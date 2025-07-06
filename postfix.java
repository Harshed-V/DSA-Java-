import java.util.*;

class postfix {
    public static void main(String[] args) {
        String[] post = {"5", "4", "3", "+", "-"};
        Stack<Integer> stack = new Stack<>();
        int Result = 0;
        for(String ele:post){
            if(ele.matches("-?\\d+")) {
                stack.push(Integer.parseInt(ele));
            }else{
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch(ele){
                    case "+":
                        Result = operand1+operand2;
                        break;
                    case "-":
                        Result = operand1-operand2;
                        break;
                    case "/":
                        Result = operand1/operand2;
                        break;
                    case "*":
                        Result = operand1*operand2;

                }stack.push(Result);
            }
        }
        System.out.println(stack.pop());
    }
}
