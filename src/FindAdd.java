import java.util.Arrays;

public class FindAdd {

    public static void main(String[] args){
        int totald=0;
        int [] array={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));
        for (int i=0;i<array.length;i++){

            totald =totald+array[i];
        }

        System.out.println(totald);
    }

}
