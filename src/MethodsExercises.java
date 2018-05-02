public class MethodsExercises {
    public static void main(String[] args) {
        add(5,7);
        subtract(45,9);
        multiply(5,8);
        divide(200,5);
        mod(60,13);
    }

    public static int add(int x, int y) {
        int result;
        result = x + y;
        System.out.println(x+"+"+y+"="+result);
        return result;
    }

    public static int subtract(int x, int y) {
        int result;
        result = x - y;
        System.out.println(x+"-"+y+"="+result);
        return result;
    }

    public static int multiply(int x, int y) {
        int result;
        result = x*y;
        System.out.println(x+"x"+y+"="+result);
        return result;
    }

    public static int divide(int x, int y) {
        int result;
        result = x/y;
        System.out.println(x+"/"+y+"="+result);
        return result;
    }

    public static int mod(int x, int y) {
        int result;
        result = x%y;
        System.out.println(x+"%"+y+"="+result);
        return result;
    }
}
