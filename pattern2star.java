/*
*  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *
 */
import java.util.*;
public class pattern2star{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println( );
        }
    }
}