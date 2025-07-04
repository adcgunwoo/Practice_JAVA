import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        String Grade = (a>=95) ? "Great!" : "SoSo";

        System.out.println(Grade);

        scan.close();
    }
}