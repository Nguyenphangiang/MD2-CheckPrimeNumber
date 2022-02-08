import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number to check prime:");
        int number = scanner.nextInt();
        if (number<2){
            System.out.printf("%d is not prime",number);
        } else {
            int i = 2;
            boolean flag = true;
            while (i < Math.sqrt(number)){
                if (number%2==0){
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag){
                System.out.printf("%d is prime",number);
            } else {
                System.out.printf("%d is not prime",number);
            }
        }
    }
}
