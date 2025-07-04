import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] scoreArray;
        String gradeArray[]; //자바에서는 다음과 같이 배열을 선언할 수 있다.

        String[] gradeArray2 = {"A+", "B+", "B+"}; //선언과 동시에 초기화 하는 방법이다. 자료형 뒤에 []기호를 꼭 붙여주자.

        int[] scoreArray2 = new int[4]; //이렇게도 배열을 생성할 수 있다.
        // 크기가 4인 정수형 배열을 선언하고 값을 모두 0으로 초기화할 수 있다.

        String[] copyArray = gradeArray2; //다음과 같이 배열을 복사할 수 있다. 얕은 복사겠죠?
    }
}