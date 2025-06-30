
public class Main {
    public static void main(String[] args) {
        System.out.printf("이름 : %s\n", "김건우"); //계행문자로 \n 사용
        System.out.printf("나이 : %d%n", 23);  //개행문자로 %n 사용(자바 특인듯)
        System.out.printf("취미 : %s", "코딩");
        System.out.printf("\n");

        System.out.printf("이름 : %s%n나이 : %s\n취미 : %s","김건우",23,"코딩"); //일열로 작성가능
    }
}