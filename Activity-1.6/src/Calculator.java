import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // 1.2 + 3.4
        String expression = input.nextLine();

        String[] tokens = expression.split(" ");

        double op1 = Double.parseDouble(tokens[0]);
        String op = tokens[1];
        double op2 = Double.parseDouble(tokens[2]);

        double result = 0;

        switch (op) {
            case "+" -> result = op1 + op2;
            case "-" -> result = op1 - op2;         
        }

        System.out.println(result);
    }
}
