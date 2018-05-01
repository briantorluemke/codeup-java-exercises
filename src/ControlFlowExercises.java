public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i =5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
        long i = 2;
        do {
            System.out.println(i);
            i = i*i;
        } while (i<=1000000);
    }
}