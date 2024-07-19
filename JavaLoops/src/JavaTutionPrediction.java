public class JavaTutionPrediction {
    public static void main(String[] args) {
        int tuition = 10000;
        int increasedTuition = tuition * 2;
        int countYear = 0;

        while(tuition<increasedTuition){
            tuition *= 1.07;
            countYear++;
        }
        System.out.println("It will take " + countYear + " years for the tuition to double to $20,000.");

    }

}
