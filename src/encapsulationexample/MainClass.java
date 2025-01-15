package encapsulationexample;

public class MainClass {
    public static  void main(String[] args){

        Student student1 = new Student();
        student1.setId(123);
        student1.setName("Ajay");
        student1.setEmail("abumasood@657gamil.com");
        student1.setGrade("8th grade");
        student1.setGender("Male");

        System.out.println("Student1 name :"+student1.getName());

        System.out.println("Student1 Email :"+student1.getEmail());

        //firstmain.Student student2 = new firstmain.Student();
    }
}
