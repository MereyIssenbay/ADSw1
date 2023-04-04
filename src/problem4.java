import java.util.Scanner;
public class problem4 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("give a number: ");
            int n = sc.nextInt();
            if(n >= 0) {
                System.out.println(factorial(n));
            }
            else{
                break;
            }
        }
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
}
