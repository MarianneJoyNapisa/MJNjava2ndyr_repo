import java.util.Scanner;
import java.util.Stack;

public class SimpleExpressionEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mathematical expression: ");
        String expression = scanner.nextLine();
        scanner.close();

        double result = evaluateExpression(expression);

        if (!Double.isNaN(result)) {
            System.out.println("Answer: " + result);
        } else {
            System.out.println("Invalid expression");
        }
    }

    public static double evaluateExpression(String expression) {
        expression = expression.replaceAll("\\s+", "");

        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar) || currentChar == '.') {
                String operand = "";

                while (i < expression.length() &&
                        (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    operand += expression.charAt(i);
                    i++;
                }

                numbers.push(Double.parseDouble(operand));
                i--; // Move back one position after parsing the operand
            } else if (currentChar == '(') {
                operators.push(currentChar);
            } else if (currentChar == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    performOperation(numbers, operators);
                }
                operators.pop(); // Remove the '('
            } else if (isOperator(currentChar)) {
                while (!operators.isEmpty() && hasPrecedence(currentChar, operators.peek())) {
                    performOperation(numbers, operators);
                }
                operators.push(currentChar);
            }
        }

        while (!operators.isEmpty()) {
            performOperation(numbers, operators);
        }

        if (numbers.size() == 1 && operators.isEmpty()) {
            return numbers.pop();
        } else {
            return Double.NaN;
        }
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static boolean hasPrecedence(char operator1, char operator2) {
        return (operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-');
    }

    public static void performOperation(Stack<Double> numbers, Stack<Character> operators) {
        if (numbers.size() >= 2 && !operators.isEmpty()) {
            double operand2 = numbers.pop();
            double operand1 = numbers.pop();
            char operator = operators.pop();
            double result = 0.0;

            if (operator == '+') {
                result = operand1 + operand2;
            } else if (operator == '-') {
                result = operand1 - operand2;
            } else if (operator == '*') {
                result = operand1 * operand2;
            } else if (operator == '/') {
                if (operand2 != 0) {
                    result = operand1 / operand2;
                }
            }
            numbers.push(result);
        }
    }
}
