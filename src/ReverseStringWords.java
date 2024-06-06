public class ReverseStringWords {

        public static void main(String[] args) {

            String str="i am shahbaj";
            ReverseStringWords.reverseWordString(str);

        }

        public static void reverseWordString(String str){
            String [] arrayOfStr=str.split(" ");
            String rev="";
            for(int i=arrayOfStr.length-1;i>=0;i--){
                rev=rev+arrayOfStr[i]+" ";
            }
            System.out.println("Reverse String"+" "+rev);
        }
    }

