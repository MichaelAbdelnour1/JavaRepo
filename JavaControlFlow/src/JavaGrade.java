import java.util.Scanner;

public class JavaGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Grade (Number between 0-100): ");
        int grade = sc.nextInt();

        if(grade>100){
            System.out.println("Score out of range");
        }else if(grade>=90 && grade<=100){
            System.out.println("Grade is A");
        } else if(grade>=80 && grade<90){
            System.out.println("Grade is B");
        } else if(grade>=70 && grade<80){
            System.out.println("Grade is C");
        } else if(grade>=60 && grade<70){
            System.out.println("Grade is D");
        } else if(grade<60 && grade>=0){
            System.out.println("Grade is F");
        } else{
            System.out.println("Score out of range");
        }

    }


}
