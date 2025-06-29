import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //read 명령어는 1바이트의 값만 입력받아서 불편하다.
        //하지만 Scanner 클래스는 다양한 형태의 값을 입력받을 수 있기에 자바에서 주로 사용된다.
        //또한 Scanner는 값을 어딘가에 저장해야 한다.
        //scan은 변수로 이 곳에 저장된다.


        System.out.println(scan.nextLine()); //nextLine()은 Scanner 클래스에 속한 명령어이다.
        //scan.nextLine()은 한 줄 단위, 즉 엔터키를 누를 때까지 내용을 입력받는다. 그 입력받은 값을 scan이라는 변수에 저장

        System.out.println(scan.next()); //nextLine()과 차이는 next()는 공백을 만나기 전까지만 출력한다.

        scan.close(); //입력 스트림 닫기
        //Scanner 클래스로 입력 스트림을 사용하다가 사용이 끝나면 다음과 같이 close 명령어로 닫아주는 것이 좋다.
    }
}