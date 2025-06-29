import java.io.IOException; //이 문장과 아래의 예외처리 구문을 추가해서 에러를 해결
//자바에서 패키지른 클래스와 파일 등을 하나로 묶은 단위이다. 폴더라고 생각하면 편하다. IOException 클래스는 java.io
//라는 패키지에 포함되어 있다. 하지만 다른 패키지에 속한 클래스를 사용하려면 해당 클래스를 사용할 때마다 현재 클래스명 앞에 해당 패키지명과
//클래스명을 모두 붙여야 한다. 이 방법이 매우 불편하므로 간소화하기 위해, 임포트 라는 작업을 한다. 클래스 위에 다음 형식으로
//임포트하면 다른 패키지의 클래스를 불러와 사용할 수 있다.
//참고로 System 클래스는 java.lang 라는 패키지에 속한다. 다만 자바는 기본으로 java.lang*을 적용하므로 따로 임포트 하지 않음


//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException { //throws IOException 이라는 예외처리 구문 추가
        //System.in.read() 이 명령어는 키보드로 값을 입력받으라는 의미이다.
        System.out.println(System.in.read()); //키보드로 입력받은 값을 출력, 얘만 단독으로 쓰면 에러 발생

        System.out.println((char)System.in.read()); //위 메서드는 1을 입력하면 1이 아닌 아스키코드 값인 49가 출력된다
        //하지만 (char)로 명시적 형변환을 해주면 숫자 1을 문자 1로 변환해서 출력해준다.
    }
}