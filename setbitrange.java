import java.util.*;
public class setbitrange{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(n=1;n<=100;n++)
        {
            int pos=0;
            int count=0;
            while(pos<=n)
            {
                if((n&(1<<pos))!=0){
                    count+=1;
                count+=1;
                }
                pos++;
            }
            System.out.println("count="+count);
        }    
    }
}