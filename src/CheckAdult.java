import java.util.Scanner;

public class CheckAdult {

    public static void main(String[] args){
   Person[] person=new Person[2];

        Scanner sc=new Scanner(System.in);
        for (int i=0;i< person.length;i++){
            System.out.println("Enter Your Name");
            String name=sc.next();
            System.out.println("Enter Your age");
            int age=sc.nextInt();
            System.out.println("Enter Your Gender");
            String gender=sc.next();
            person[i]  =new Person (name,age,gender);
        }
        checkAdult(person);

    }
    static void checkAdult(Person[] personsDetails){
        for (int i=0;i< personsDetails.length;i++){
            if (personsDetails[i].age<=18){
                System.out.println("Not Adult Person");
            }
            System.out.println(" Not Adult Person");
        }

    }
}
