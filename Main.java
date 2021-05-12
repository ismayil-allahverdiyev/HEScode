import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter age of a person in between 0 and 100:");
        Person Isi = new Person();
        int age = input.nextInt();
        Isi.setAge(age);
        String name;
        String lastName;
        String gendertry;
        String hesCode;
        String chars = "ABCDEFGHIJKLMNOPRSTUWXYZ";
        Random rd = new Random();

        if(Isi.getAge()<=20) {
            System.out.println("Please enter the kid's name,last name and gender as Female or Male:");
            name = input.next();
            lastName = input.next();
            gendertry = input.next();
            hesCode = "";
            hesCode += chars.charAt(rd.nextInt(chars.length()));
            hesCode += rd.nextInt(9);
            hesCode += chars.charAt(rd.nextInt(chars.length()));

            for(int i=3; i <=9; i++) {
                hesCode += rd.nextInt(10);
                if(i==3 || i==7){
                    hesCode += " - ";
                }
            }
            boolean gender = true;
            if(gendertry.toLowerCase().equals("male")){
                gender = true;
            }if(gendertry.toLowerCase().equals("female")){
                gender = false;
            }
            Kid kid = new Kid(name,lastName,hesCode,gender);
        }if(Isi.getAge()>20 && Isi.getAge()<=60) {
            System.out.println("Please tell us how many kids the parent has");
            int numberOfKids = input.nextInt();
            System.out.println("Please enter name, last name and gender information of "+ numberOfKids + " kids of the parents.");
            int maleCounter = 0;
            int femaleCounter = 0;
            Parent parent;
            for(int x = 1; x<=numberOfKids;x++){
                System.out.println("Enter kid name, last name, age and gender for "+ x + "th kid:");
                name = input.next();
                lastName = input.next();
                age = input.nextInt();
                gendertry = input.next();

                boolean gender = true;
                if(gendertry.toLowerCase().equals("male")){
                    gender = true;
                    maleCounter++;
                }if(gendertry.toLowerCase().equals("female")){
                    gender = false;
                    femaleCounter++;
                }
                parent = new Parent(name, lastName, age, gender, x);
            }
            hesCode = "";
            hesCode += chars.charAt(rd.nextInt(chars.length()));
            hesCode += rd.nextInt(9);
            hesCode += chars.charAt(rd.nextInt(chars.length()));

            for(int a=3; a <=9; a++) {
                hesCode += rd.nextInt(10);
                if(a==3 || a==7){
                    hesCode += " - ";
                }
            }
            parent = new Parent(hesCode,maleCounter,femaleCounter);

        }if(age>60){

            System.out.println("Please enter elderly person's name and last name: ");

            name = input.next();
            lastName = input.next();
            hesCode = "";
            hesCode += chars.charAt(rd.nextInt(chars.length()));
            hesCode += rd.nextInt(9);
            hesCode += chars.charAt(rd.nextInt(chars.length()));

            for(int a=3; a <=9; a++) {
                hesCode += rd.nextInt(10);
                if(a==3 || a==7){
                    hesCode += " - ";
                }
            }
            Elderly elder = new Elderly(name, lastName, age, hesCode);

        }

    }
}





