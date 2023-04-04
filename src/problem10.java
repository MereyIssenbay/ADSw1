import java.util.Scanner;
public class problem10 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me two integers to find gcd: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(gcd(n,k));
    }
    public static int gcd(int n, int k){
        if(k == 0){
            return n;
        }
        else{
            return gcd(k, n%k);
        }
    }
}
