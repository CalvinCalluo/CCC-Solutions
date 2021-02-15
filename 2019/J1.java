import java.util.*;

public class J1{
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        int a1,a2,a3,b1,b2,b3;
        a1 = user.nextInt();
        a2 = user.nextInt();
        a3 = user.nextInt();

        b1 = user.nextInt();
        b2 = user.nextInt();
        b3 = user.nextInt();

        a1 *= 3;
        a2 *= 2;
        b1 *= 3;
        b2*= 2;
        if(a1 + a2 + a3 > b1+b2+b3){
            System.out.println("A");
        }
        else if(a1 + a2 + a3 < b1+b2+b3){
            System.out.println("B");
        }
        else{
            System.out.println("T");
        }
    }



}
