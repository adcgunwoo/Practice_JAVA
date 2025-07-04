import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        for (int i = 1; i <= a; i++){
            System.out.print(i);
        }
        System.out.println();
        int j=1;
        while (j<=a){
            System.out.print(j++);
        }


        scan.close();
    }
}