import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("점수를 입력하세요 : ");

        int a = scan.nextInt();
        switch (a){
            case (100):
                System.out.println("축하드립니다!");
                break;
            default:
                int b = 100-a;
                System.out.println("100점에 "+ b +"점이 부족했습니다.");
        }

        scan.close();


    }
}