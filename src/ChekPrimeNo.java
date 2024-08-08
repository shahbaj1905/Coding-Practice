import java.util.Scanner;

public class ChekPrimeNo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Plese enter Nujmber");

        System.out.println(isPrime(sc.nextInt()));
    }

    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2;i<=a/2;i++){
            if (a%i==0){
                return false;

            }

        }
        return true;

    }
}
