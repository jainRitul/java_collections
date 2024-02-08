import java.util.Scanner;
class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        randomfun(n);
    }
    public static void randomfun(int n){
        
        int ran = (int)Math.random();
        if(n == ran)
        System.out.println("You Gussed it write");
        else if(n > ran)
        System.out.println("It is greater than random number");
        else
        {
            System.out.println("It is less than random number");
        }
    }
}
