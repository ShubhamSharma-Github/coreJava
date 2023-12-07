package Day2;
class Person{
    String name;
    int age;

    void speak(){
        System.out.println("Hello my name is: "+name+" amd i am "+age+" year old");
    }
    void hello(){
        System.out.println("hello");
    }
}
class Vehicle{
    String company;
    String model;
    int price;
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Shubham Sharma";
        person1.age = 22;
        person1.speak();
        person1.hello();


        Person person2 = new Person();
        person2.name = "alok";
        person2.age = 27;
        person2.speak();
        person2.hello();


        Vehicle car1 = new Vehicle();
        car1.company = "Honad";
        car1.model = "City";
        car1.price = 1000000;

        System.out.println(car1.company+" "+car1.model+" "+car1.price);
    }
}
