import java.util.Scanner;

public class JavaSwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7");
        int num1 = sc.nextInt();

        switch(num1){
            case 1:
                System.out.println(num1 + " is a valid number");
                break;
            case 2:
                System.out.println(num1 + " is a valid number");
                break;
            case 3:
                System.out.println(num1 + " is a valid number");
                break;
            case 4:
                System.out.println(num1 + " is a valid number");
                break;
            case 5:
                System.out.println(num1 + " is a valid number");
                break;
            case 6:
                System.out.println(num1 + " is a valid number");
                break;
            case 7:
                System.out.println(num1 + " is a valid number");
                break;
            default:
                System.out.println(num1 + " is Out of range");
                break;
        }
    }
}
