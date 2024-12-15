class EvalRPN_Problem{
    public int evalRPN(String[] tokens) {
        Stack<Integer> operandStack = new Stack<>();
        for (String token : tokens) {
            if (Character.isDigit(token.charAt(token.length() - 1))) {
                operandStack.push(Integer.valueOf(token));
            } else {
                int operand2 = operandStack.pop(); // Second operand
                int operand1 = operandStack.pop(); // First operand
                if (token.equals("*")) {
                    operandStack.push(operand1 * operand2);
                } else if (token.equals("/")) {
                    operandStack.push(operand1 / operand2);
                } else if (token.equals("-")) {
                    operandStack.push(operand1 - operand2);
                } else if (token.equals("+")) {
                    operandStack.push(operand1 + operand2);
                }
            }
        }
        return operandStack.pop();
    }
}
