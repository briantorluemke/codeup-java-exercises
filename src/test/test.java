package test;

public class test {
    private static int adjacentElementsProduct(int[] inputArray) {
        int x = 0;
        int y = 0;
        int testnum = 0;
        int length = inputArray.length;
        for (int i = 0; i < length; i++) {
            if (i == length-1) {
                break;
            }
            testnum = inputArray[i] * inputArray[i+1];
            if ((x * y) < testnum || x * y == 0) {
                x = inputArray[i];
                y = inputArray[i+1];
            }
        }
        return x * y;
    }
    public static void main(String[] args) {
        int[] ints = {-23, 4, -3, 8, -12};

        System.out.println(adjacentElementsProduct(ints));
    }
}
