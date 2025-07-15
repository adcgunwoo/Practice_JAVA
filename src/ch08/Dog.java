package ch08;

public class Dog extends Animal {
    //필드
    String breed; //견종

    public void roll(){
        System.out.println(name+"이(가) 바닥을 구릅니다");
    }
    public void roll(int cnt){
        System.out.println(name + "이(가) 바닥을 " +cnt+"번 구릅니다." );
    }//메서드 오버로딩 : 메서드명은 같지만 매개변수의 개수와 순서, 자료형이 다른 메서드를 같은 클래스 안에 여러 개 정의하는 것이다.
}
