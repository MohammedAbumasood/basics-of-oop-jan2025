package polymorphismexample;

public class MainClass {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();

        sampleClass.sum(23, 34);
        sampleClass.sum(43,56,43);
        sampleClass.sum(45.76,46.87);
        sampleClass.sum(59.44f,33.65f);
    }
}
