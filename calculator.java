import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       
        System.out.println("Enter 1st operand");
        int operand1=sc.nextInt();
        System.out.println("Enter 2nd operand");
        int operand2=sc.nextInt();
        System.out.println("Enter operator");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':  System.out.println(operand1 + " + " + operand2 + " = "  + (operand1 + operand2));
            break;
            case '-':   System.out.println(operand1 + " - " + operand2 + " = "  + (operand1 - operand2));
            break;
            case '*':   System.out.println(operand1 + " * " + operand2 + " = "  + (operand1 * operand2));
            break;
            case '/':   System.out.println(operand1 + " / " + operand2 + " = "  + (operand1 / operand2));
            break;
            case '%':   System.out.println(operand1 + " % " + operand2 + " = "  + (operand1 % operand2));
            break;
            default:  System.out.println("Invalid input");
        }

    }
}
