import java.util.ArrayList;

public class test{
    public static void main (String[] args){
        System.out.println("Calculator started");
        float answer = Calculator.exponential(2,3);

        ArrayList<Float> tests = new ArrayList<Float>();
        tests.add(2.0f);
        tests.add(2.0f);
        tests.add(2.0f);
        tests.add(2.0f);
        tests.add(2.0f);

        answer = Calculator.multiply(tests);
        System.out.println(answer);


    }
}
