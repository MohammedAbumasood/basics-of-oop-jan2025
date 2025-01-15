package firstmain;

public class mainClass {
   public static void main(String[] args)
   {
       System.out.println("Hello Evevryone");

       // create object;
       Student student1 = new Student();

       System.out.println("Student is :"+student1);

       student1.id = 123;
       student1.name = "Masood";
       student1.email = "jwegge@dkjfb.com";
       student1.address = "New home real";
       student1.gender = "Male";
       student1.age = 23;
       System.out.println("student is :"+student1);


        // final keyword
       final int abc = 145;
       System.out.println("final variable :"+abc);

       //abc = 100 // it cannot br created;
       final String product_codes_milk = "PR102";
       System.out.println(product_codes_milk);

       // static keyword
       Student student2 = new Student();
       student2.demo1(); //for non-static methods objects are needed

       Student.demo2(); //for static methods objects are not needed

       System.out.println("pqr value is :"+student2.pqr);
       System.out.println("xyz value is :"+Student.xyz);



   }
}
