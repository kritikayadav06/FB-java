/*
n=6
 1 7  12 16 19 21
 2 8  13 17 20
 3 9  14 18
 4 10 15
 5 11
 6

*/
import java.util.*;
public class pattern1{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=0,k=0;
        System.out.println("Enter any number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {    k=i;
            for( int j=n;j>=i;j--){
                System.out.print(k+" ");
                k=k+j;
            }
            System.out.println();
        }
    }
}


    