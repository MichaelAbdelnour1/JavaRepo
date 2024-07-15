import java.util.StringJoiner;

public class UnaryOperator {
    public static void main(String[] args)
    {
        int sum = +1;
        // sum is now 1
        System.out.println(sum);

        sum--;
        // sum is now 0
        System.out.println(sum);

        sum++;
        // sum is now 1
        System.out.println(sum);

        sum = -sum;
        // sum is now -1
        System.out.println(sum);

        boolean result = false;
        // false
        System.out.println(result);
        // true
        System.out.println(!result);

        StringJoiner joinData = new StringJoiner( "],[","[","]");
        joinData.add("Java");
        joinData.add("Python");
        joinData.add("C#");
        joinData.add("JavaScript");
        System.out.println(joinData.toString());
    }
}