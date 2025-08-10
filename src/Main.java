import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요.--> ");
        int a = scan.nextInt();
        System.out.println("두 번째 정수를 입력하세요.--> ");
        int b = scan.nextInt(); //b(분모)에 0 입력
        try{
            int result = a / b;
            System.out.println("결과 : " + result);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
// tty-catch-finally 문으로 예외처리하기 만약 하지 않았다면?
// ArithmeticException 예외 발생, 왜? 밑에 0이 들어갔기 때문에