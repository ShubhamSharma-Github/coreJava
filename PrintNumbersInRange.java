import java.util.Scanner;

public class PrintNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        for (int i = 0 ;i<=n;i++){
            System.out.println(i);
        }
    }
}
