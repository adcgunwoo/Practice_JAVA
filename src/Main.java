
public class Main {
    public static void main(String[] args) {
        System.out.printf("%d\n", 11111); //일반적인 출력
        System.out.printf("%7d\n", 11111); //서식지정자 사이에 7을 넣어줌, 7자리중 왼쪽 2자리가 공백
        System.out.printf("%-7d\n", 11111); //서식지정자 사이에 -7을 넣어줌, 7자리중 오른쪽 2자리가 공백
        System.out.printf("%07d\n", 11111); //서식지정자 사이에 07을 넣어줌, 명령문 빈자리가 0으로 채워짐 0011111
        System.out.printf("%,7d\n", 11111); //서식지정자 사이에 ,을 넣어줌, 명령문은 천 단위로 구분 기호인 쉼표로 넣고, 빈자리는 공백
        // (공백)11,111
    }
}