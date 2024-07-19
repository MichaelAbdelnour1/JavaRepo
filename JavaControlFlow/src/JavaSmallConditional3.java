public class JavaSmallConditional3 {
    public static void main(String[] args) {
        int x = 15;

        if(x<10){
            System.out.println("x: Less then 10");
        } else if(x>10 && x<20){
            System.out.println("x: Between 10 and 20");
        } else if(x>=20){
            System.out.println("x: Greater than or equal to 20");
        }

        int x1 = 50;

        if(x1<10){
            System.out.println("x1: Less then 10");
        } else if(x1>10 && x1<20){
            System.out.println("x1: Between 10 and 20");
        } else if(x1>=20){
            System.out.println("x1: Greater than or equal to 20");
        }
    }
}
