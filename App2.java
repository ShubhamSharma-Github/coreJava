package Day2;
class Student{
    String name;
    int age;
    int roll;

    void call(){
        System.out.println("I am "+name+" and i am "+age+" old");
        System.out.println("my roll no is "+roll);
    }
}
class Persoon{
    String name;
    int age;

    int retairmentAgeLeft(){
      int  left = 65-age;
      return left;


    }
    int getAge(){
        return age+1;
    }
}
public class App2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Shubham Sharma";
        student1.age = 22;
        student1.roll = 1323;
        student1.call();

        Persoon person1 = new Persoon();
        person1.name = "Shubham Sharma";
        person1.age = 22;
        int years = person1.retairmentAgeLeft();
        System.out.println("Years left to retaire at "+years);

        int age = person1.getAge();
        System.out.println(age);
    }
}
