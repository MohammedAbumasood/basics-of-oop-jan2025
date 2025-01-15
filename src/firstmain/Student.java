package firstmain;

public class Student {
    int id;
    String name;
    String email;
    String gender;
    String address;
    int age;

    int pqr = 300; // non-static variable
    static int xyz = 400; // static variable


    public void demo1(){
        System.out.println("demo1 non-static method inside student class");
        // demo2(); in the non-static methods can call static as well
    }

    public static void demo2(){
        System.out.println("demo2 static method inside student class");
        //demo1(); in static methods only static should be called
    }


    // toString converts the object into format and prints ti in output
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
