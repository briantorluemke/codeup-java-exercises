public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i =5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
        for (long i = 2; i <= 1000000; i *= i) {
            System.out.println(i);
        }
    }
}