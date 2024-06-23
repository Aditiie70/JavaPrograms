// it is the number whose square number last digit/s is equal to number. (ex.num=25 & sq=625. here last 25 equal to original number)
import java.util.Scanner;

class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sq=num*num;        
        if(num<10){
            if(num%10==sq%10){
                System.out.println(sq+" Automorphic number");
            }
            else{
                System.out.println(sq+" Not Automorphic number");
            }
        }
        else if(num>10 && num<100){
                if(num%100==sq%100){
                System.out.println(sq+" Automorphic number");  
                }
                else{
                    System.out.println(sq+" Not Automorphic number");
                }
            }
        
        
    }
}
