public class StringPalendrom {
    public static void main(String[] args) {

        String Stro="aba";
        boolean b =false; chekPelendrom(Stro,b);
    }

    public static boolean chekPelendrom(String str, boolean b){
        String revs="";

        for(int i=str.length()-1;i>=0;i--){
            revs=revs+str.charAt(i);
        }
        System.out.println(revs);

        if(str.equals(revs)){

            b=true;
            System.out.println("that is pelendrom");

        }
        else {
            System.out.println("that is not pelendro");
        }
        return false;
    }
}