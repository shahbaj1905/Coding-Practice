import java.util.Arrays;

public class FindMaxOrMin {
    public static void main(String[] args) {
        int arr []={10,50,20,40,70,90};
        findMaxAndmin(arr);

    }

    public static void findMaxAndmin(int arr[]){
        Arrays.sort(arr);
        System.out.println("Max element"+arr[arr.length-1]);
        System.out.println("Min element"+arr[0]);
    }

}
