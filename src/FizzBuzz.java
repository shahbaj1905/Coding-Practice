public class FizzBuzz {

    public static void main(String[] args){
        int n=100;

        for(int i=1;i<n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("That is FizzBuzz"+i);
            }
            else if(i%3==0){
                System.out.println("That is Fizz"+i);
            }
            else if(i%5==0){
                System.out.println("That is Buzz"+i);
            }
            else {
                System.out.println(i);
            }

        }
    }
}
