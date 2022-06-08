package book.StaticDemo;

class MyClass {
    public String message = "Hello World";
    public void displayMessage(){
        System.out.println("Message = "+message);
    }

    public static String greeting = "Good morning";
    public static void displayGreeting(){
        System.out.println("Greeting = "+greeting);
    }
}

public class StaticDemo{
    public static void main(String[] args) {
        MyClass sd = new MyClass();
        System.out.println(sd.message);
        sd.displayMessage();

        System.out.println(MyClass.greeting);
        MyClass.displayGreeting();
    }
}

