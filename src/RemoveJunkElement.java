public class RemoveJunkElement {

    public static void main(String [] args){
        String S="Shahbaj@#$%56";

       S= S.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("New String is"+S);
    }
}
