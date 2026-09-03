import java.util.Scanner;
public class PrimeNumber3 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);

        int first,last, count=0;
        System.out.print("Enter initial Integer: ");
        first= input.nextInt();
        System.out.print("Enter last Integer: ");
        last= input.nextInt();
        
        for(int i=first; i<=last; i++)
        {
            if(i<2)
                continue;

            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
                System.out.printf( "  %d  ", i);   
            count=0;
        }
    }
}