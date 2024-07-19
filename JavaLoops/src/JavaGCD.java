import java.util.Scanner;

public class JavaGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first positive integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second positive integer: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int gcd = 1;
        for(int i = 1; i<=num1; i++){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
        }

        System.out.println("The greatest common divisor is " + gcd);

    sc.close();
    }
}
