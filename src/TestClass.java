class TestClass {
    private static void hello() {
        TestClass tc = new TestClass();
        tc.display(); //object create here because display is a non-static method
    }
    private void display(){
        System.out.println("Call from non-static method");
    }

    public static void main(String[] args) {
        hello();
    }
}

//public class TestClass {
//    public static void main(String[] args) {
//        display(4); //there is no object create here because display is a static method
//    }
//    public static void display(int x){
//        System.out.println("Call from static method"+x);
//    }
//}