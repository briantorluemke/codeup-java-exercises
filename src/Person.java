public class Person {
    // instance variables
    private String name;

    // constructor
    public Person(String name) {this.name = name;}


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Changing user's name to "+ name);
    }

    public void sayHello() {System.out.println(this.name + " says Hello!");}

    public static void main(String[] args) {
        Person brian = new Person("Brian");
        brian.setName("NotBrian");
        brian.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());  // John
//        System.out.println(person2.getName());  // null?
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // John
//        System.out.println(person2.getName()); // Jane
    }
}