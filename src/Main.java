import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력하세요. -->");
        int a = scan.nextInt();
        System.out.println("두번째 정수를 입력하세요. -->");
        int b = scan.nextInt();
        try {
            if(b==3){ //3으로 나누려 할때 고의로 예외를 던짐
                throw new ArithmeticException("3으로 나눌 수 없습니다.");
                //new 키워드로 ArithmeticException 클래스의 객체를 생성
                //이 객체를 catch로 던짐
            }
            int result=a/b;
            System.out.println("결과: "+result);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            //getMessage() 메서드는 Throwable 클래스에 속한 메서드로, 예외가 발생할 때 표시하는 예외 메시지에(by zero)를 문자열로 반환
            //예외 객체를 생성할 때 예외 메시지를 지정해 전달하면 getMessage() 메서드로 반환할 메시지를 직접 지정할 수 있다.
        }
        finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
