import java.util.Scanner;
public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num, count=0;
        System.out.print("Enter any Positive Integer: ");
        num= input.nextInt();
        
        if(num<2){
            System.out.println(num+ " is not a prime number.");
        }
        else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                    count++;
                    break;
                }
            }
            if(count==1){
                System.out.println(num+ " is not a prime number");
            }
            else{
                System.out.println(num+ " is a prime number");
            }
        } 
    }
}
