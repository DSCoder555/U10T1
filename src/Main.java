public class Main {
    public static int factorial(int num){
        int total = num;
        for(int i = num-1; i > 0; i--){
            total *= i;
        }
        return total;
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }
}
