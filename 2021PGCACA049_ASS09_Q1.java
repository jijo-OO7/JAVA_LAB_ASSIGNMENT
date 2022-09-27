//Write a program to use ArrayList to implement railway ticket booking operations.

import java.util.*;
class railwayticket{

    ArrayList<String> a ;
    int max;
    railwayticket(int max){
        this.a=new ArrayList<>() ;
        this.max=max;
    }
    void bookticket(){
        if(this.a.size()>=this.max)
        {
            System.out.println("no ticket available");
        }
        else{
            System.out.println("enter name of the candidate");
            Scanner in=new Scanner(System.in);
            String name=in.next();
            a.add(name);
            System.out.println("ticket booked");
        }
    }
    void cancelticket(){
        System.out.println("enter name of the candidate whose ticket you want to cancel");
        Scanner in=new Scanner(System.in);
        int index=-1;
        String name=in.next();
        for(int j=0;j<this.a.size();j++){
            String t=a.get(j);
            if(name.equals(t)==true){
                a.remove(j);
                index=j;
                break;
            }
        }
        if(index==-1)
            System.out.println("no data found \n please enter valid name ");
        else
            System.out.println("ticket canceled");
    }
    void ticketleft(){
        int ans=max-a.size();
        System.out.println("ticket left : "+ans);
    }
}
class Q1{
    public static void main(String []args){
        railwayticket r1=new railwayticket(10);
        boolean f=true;
        while(f){
            System.out.println("please choose valid option \n 1: bookticket \n2: cancelticket \n3: ticketleft \n4:exit ");
            Scanner in= new Scanner(System.in);
            int c=in.nextInt();
            switch(c){
                case 1: r1.bookticket();break;
                case 2: r1.cancelticket();break;
                case 3: r1.ticketleft();break;
                case 4: f=false;break;
                default:
                    System.out.println("please enter valid option");
            }
        }
    }

}
