import java.util.Scanner;
public class OddNumbersRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz Enter a number");
        int n = sc.nextInt();
        for(int i = 0; i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        System.out.println("Those all are odd Numbers");
    }
}
