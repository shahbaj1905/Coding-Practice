import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int count=0;


        String[] officeItems = new String[] {
                new String("stapler"),
                new String("monitor"),
                new String("computer"),
                new String("desk"),
                new String("lamp"),
                new String("computer"),
                new String("lamp"),
                new String("stapler"),
                new String("computer"),
                new String("computer")};
        System.out.println(Arrays.toString(officeItems));

        for (int i=0;i<officeItems.length;i++){
            if (officeItems[i].equals("computer")){
                count++;
            };
        }
        System.out.println(count);

    }
}