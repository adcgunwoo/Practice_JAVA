import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] scoreArray;
        String gradeArray[]; //자바에서는 다음과 같이 배열을 선언할 수 있다.

        String[] gradeArray2 = {"A+", "B+", "B+"}; //선언과 동시에 초기화 하는 방법이다. 자료형 뒤에 []기호를 꼭 붙여주자.

        int[] scoreArray2 = new int[4]; //이렇게도 배열을 생성할 수 있다.
        // 크기가 4인 정수형 배열을 선언하고 값을 모두 0으로 초기화할 수 있다.

        String[] copyArray = gradeArray2; //다음과 같이 배열을 복사할 수 있다. 얕은 복사겠죠?

        int[] orginArray = {1,2,3}; //깊은 복사를 위한 원본 배열 선언 및 초기화
        int[] deepCopyArray = new int[orginArray.length]; //깊은 복사를 위한 deepCopyArray 배열을 원본 크기와 똑같이 선언
        //length라는 인자를 그냥 사용할 수 있네

        for (int i=0; i< orginArray.length; i++){
            deepCopyArray[i]=orginArray[i]; //일일히 원본 값을 복사해줍니다. 따라서 값만 옮겨가므로 깊은 복사가 이뤄짐
        }

        deepCopyArray[0]=10;
        //다음과 같이 복사 배열의 값을 변경해도, 원본 배열의 값은 변하지 않음.

    }
}