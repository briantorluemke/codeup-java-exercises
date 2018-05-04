package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        input.getString();
        input.yesNo();
        input.getInt(1,10);
        input.getInt();
        input.getDouble(1.1, 5.4);
        input.getDouble();
    }
}
