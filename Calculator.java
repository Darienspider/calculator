import java.util.ArrayList;
import java.lang.Math;

public class Calculator{

    public static float add (float num1, float num2){
        return num1 + num2;
    }

    public static float add (ArrayList<Float> numbers){
        float answer =0;
        for (int i=0; i<numbers.size(); i ++){
            answer = answer + numbers.get(i);
        }
        return answer;
    }

    public static float subtract ( float num1, float num2){
        return num1 - num2;
    }

    public static float subtract (ArrayList<Float>numbers){
        float answer = 0;
        // must be set to the first number provided, or else everything will be negative regardless of the first number
        answer = numbers.get(0);
        // we start at 1 since we already have a preset answer above
        for(int i=1; i < numbers.size(); i++){
            answer = answer - numbers.get(i);
        }
        return answer;

    }

    public static float multiply ( float num1, float num2){
        return num1 * num2;
    }
    public static float multiply (ArrayList<Float>numbers){
        float answer = 0;
        // must be set to the first number provided, or else everything will be negative regardless of the first number
        answer = numbers.get(0);
        // we start at 1 since we already have a preset answer above
        for(int i=1; i < numbers.size(); i++){
            answer = answer * numbers.get(i);
            }
        return answer;

    }

    
    public static float divide (float num1, float num2){
        return num1 / num2;
    }

    public static float exponential( float mainNumber, int exponent){
        float answer = 1;
        for (int i=0; i < exponent; i++){
            answer = answer*mainNumber;
        }
        return answer;
    }

    // Scientific Calculator functions 
    // TODO: Add the ability to use scientific calculator functions such as log,cos,and tangent 
    public static void logger(double valueHere){
        System.out.println(Math.log(valueHere));
    }

}