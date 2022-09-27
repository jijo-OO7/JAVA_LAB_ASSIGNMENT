/*Write a program to use HAshMap to implement login id and password database;
use the same to verify the username and password of a given user.*/


import java.util.*;
import java.util.HashMap;

class Credential{

    HashMap<Integer,String>UserBase = new HashMap<>();
    void SignUp(int id,String pass ){

        UserBase.put(id,pass);
        System.out.println("Signned Up SucessFully ....!");
    }
    void LogIn(int id,String pass){
        if(UserBase.containsKey(id)&& pass.equals(UserBase.get(id))) System.out.println("...log in sucessfuly");
        else System.out.println("wrong user name or password..!");
    }

}

public class Q2
{
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int num;
        String pass;
        boolean loop;
        loop = true;
        Credential obj1 = new Credential();
        while(loop) {
            System.out.println("*****************HOME PAGE**************");
            System.out.println("1.SIGN UP");
            System.out.println("2.LOG IN");
            System.out.println("3.EXIT HOME PAGE");
            System.out.println("*****************************************");
            System.out.println("ENTER YOUR CHOICE::");
            int choice =in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("ENTER USER ID::");
                    num = in.nextInt();
                    System.out.println("ENTER PASSWORD");
                    pass = in.next();
                    obj1.SignUp(num,pass);
                    break;

                case 2:
                    System.out.println("ENTER USER Id::");
                    num = in.nextInt();
                    System.out.println("ENTER PASSWORD::");
                    pass = in.next();
                    obj1.LogIn(num,pass);
                    break;
                case 3: loop = false;

                default:
                    System.out.println("ENTER VALID INPUT!");
                    break;

            }

        }
    }
}
