import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Java Calculator Sample");
        Scanner numInput_1 = new Scanner(System.in);
        System.out.print("Enter Number: ");
        float input_1 = numInput_1.nextFloat();
        Scanner operator = new Scanner(System.in);
        System.out.print("Operator: ");
        String operator_1 = operator.nextLine();
        System.out.print("Enter Number: ");
        Scanner numInput_2 = new Scanner(System.in);
        float input_2 = numInput_2.nextFloat();

        if (numInput_1.equals(null) || numInput_2.equals(null)) {
            System.out.println("Please neter a number!");
        }
        else if (operator_1.equals("+")) {
            float sum = input_1 + input_2;
            System.out.println("Answer: " + sum);
        }
        else if (operator_1.equals("-")) {
            float diff = input_1 + input_2;
            System.out.println("Answer: " + diff);
        }
        else if (operator_1.equals("*")) {
            float prod = input_1 + input_2;
            System.out.println("Answer: " + prod);
        }
        else {
            float quo = input_1 / input_2;
            System.out.println("Answer: " + quo);
        }
    }
}
