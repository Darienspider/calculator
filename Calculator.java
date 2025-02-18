public class Calculator{

    public static float add (float num1, float num2){
        return num1 + num2;
    }

    public static float subtract ( float num1, float num2){
        
    }

    public static float multiply ( float num1, float num2){
        return num1 * num2;
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


}