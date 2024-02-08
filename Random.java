import java.util.Scanner;
class Random 
{
    public static void main(String[] args)
    {
        random();
    }
    public static void random(){
        int number = 1  + (int)(100*Math.random());
        System.out.println("Gusess the number between 1 to  100 within 5 trials");
        Scanner sc = new Scanner(System.in);
        int k =5;
        int i;
        for(i=0;i<k;i++){
            System.out.println("Gusess a number");
            int Gusess = sc.nextInt();
            if(Gusess == number)
            System.out.println("Congratulations ! you guessed it right");
            else if(number > Gusess && i != k-1){
                System.out.println("Gusess is lesser");

            }
            else{
                System.out.println("Gusess is  greater");
            }
            
        }
        if(i == k){
            System.out.println("You Exhausted the Trial ");
            System.out.println("The number is "+number);
        }
    }
}
