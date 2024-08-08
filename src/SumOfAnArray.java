import java.util.Arrays;

public class SumOfAnArray {
    public static void main(String[]args){
        int arr []={1,2,3,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum2=0;
        for (int j=1;j<=arr.length;j++){
            sum2=sum2+j;
        }
        int sum=0;
        for (int i: arr) {
            sum=sum+i;
        }
        System.out.println(sum);
        int missingNo=sum2-sum;
        System.out.println("Missing number"+missingNo);
    }
}
