
public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 3;
        System.out.println((double)a/b); //명시적 형변횐(int를 double로)
        //(자료형)변수의 형태를 가진다!! 헷갈리지 말것

        //묵시적 형변환
        //자바 컴파일러가 자동으로 수행하며 범위가 작은 자료형에서 범위가 큰 자료형으로의 변환만 허용!!
        //byte(1바이트) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8) 점점 커지는 범위
        //반대로 범위가 큰 자료형에서 범위가 작은 자료형으로 변환할 떄는 반드시 명시적 형변환을 해줘야 한다.
    }
}