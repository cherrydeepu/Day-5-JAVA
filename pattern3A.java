/*
A
A B
A B C
A B C D
A B C D E
*/
import java.util.*;
public class pattern3A{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println( );
        }
    }
}  
