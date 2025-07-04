import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a>0){
            System.out.println("양의정수");
        }
        else {
            System.out.println("0 또는 음의정수");
        }
        scan.close();
    }
}