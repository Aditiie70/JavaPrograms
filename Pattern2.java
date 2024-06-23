package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int r=4;
        int clm=5;

        for(int i=1;i<=r;i++){
            for(int j=1;j<=clm;j++){
                if(i==1 || i==r || j==1 || j==clm)
                    System.out.print(" * ");

                else
                    System.out.print(" "+" "+" ");
            }
            System.out.println();
        }
    }
}

