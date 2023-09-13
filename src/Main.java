public class Main {
    public static void main(String[] args) {
        //1. add
        int addResult= add(5,7);
        System.out.println(addResult);

        //2. addTwo
        int addAgainResult=add(5,7,6,6);
        System.out.println(addAgainResult);

        //3. morningGreeting
        String morningGreetingResult=morningGreeting("Toby Fox");
        System.out.println(morningGreetingResult);

        //4. afternoonGreeting
        String afternoonGreetingResult=afternoonGreeting("Mac Miller");
        System.out.println(afternoonGreetingResult);

        //5. triple
        String tripleResult=triple("oohbaby");
        System.out.println(tripleResult);

        //6. half
        double halfResult=half(19);
        System.out.println(halfResult);

        //7. roundPositiveValueToNearestInteger
        int roundPositiveValueToNearestIntegerResult=roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundPositiveValueToNearestIntegerResult);

        int roundPositiveValueToNearestIntegerTwoResult=roundPositiveValueToNearestInteger(8.49);
        System.out.println(roundPositiveValueToNearestIntegerTwoResult);

        //8. roundNegativeValueToNearestInteger
        int roundNegativeValueToNearestIntegerResult=roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundNegativeValueToNearestIntegerResult);

        int roundNegativeValueToNearestIntegerTwoResult=roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundNegativeValueToNearestIntegerTwoResult);
    }

    // 1. add
    public static int add(int num1, int num2){
        return num1+num2;
    }

    public static int add(int num1, int num2, int num3, int num4){
        int sum1=add(num1,num2);
        int sum2=add(num3,num4);
        return sum1+sum2;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, "+name+"!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, "+name+"!";
    }

    // 5. triple
    public static String triple(String text){
        return text+text+text;
    }

    // 6. half
    public static double half(int num){
        return num/2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double num){
        return (int) (num+0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num){
        return (int) (num-0.5);
    }
}
