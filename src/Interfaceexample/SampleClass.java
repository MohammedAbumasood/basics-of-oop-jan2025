package Interfaceexample;

public class SampleClass implements SampleInterface{

    @Override
    public void demo() {
        System.out.println("demo methods body inside SampleClass");
        System.out.println("abc value is :"+ SampleInterface.abc);
    }

    @Override
    public void demo2() {
        System.out.println("demo2 methods body inside SampleClass");
        System.out.println("abc value is :"+ SampleInterface.xyz);

    }
}
