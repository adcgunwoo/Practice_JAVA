import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;                    //4바이트
        int b = 10;
        int intNum = 123;
        long longNum  =123L; //int와의 구분을 위해 뒤에 L을 붙여줌     8바이트
        float floatNum = 123.4F; //double과의 구분을 위해 뒤에 F를 붙여줌     4바이트
        double doubleNum = 123.4; //8바이트
        char Txt = 'A'; //char 문자 자료형은 ''로 묶어줌            2바이트
        boolean isTrue = true; //bool이 아닌 boolean으로 선언한다!!          1바이트

        //위까지 일반자료형 

        String strTxt = "ABCD"; 
        //참조 자료형이라고 한다. 값을 저장하는 기본 자료형과 달리 참조자료형은 값이 저장된 주소를 저장한다.
        //이때 주소는 메모리에서 위치를 나타낸다. 참조 자료형에는 배열, 클래스, 인터페이스등이 있다.
        
        var c =10; //c에서의 auto와 비슷, 컴파일러가 초기화한 값에 의해 자료형을 추론 즉, 타입 추론

        System.out.printf("%d", b);
        //printf는 c언어와 매우 유사 %d, %f와 같은 서식 지정자 또는 형식 지정자가 필요함
        //서식 지정자의 종류(%d 정수, %f 실수, %c 문자, %s 문자열, %b 논리형 값, %t 시간과 날짜, %n 줄 바꿈, %%  % 기호)

    }
}