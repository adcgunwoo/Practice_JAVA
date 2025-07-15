package ch08;

public class Dog extends Animal {
    //필드
    String breed; //견종
//    String name; //이름
//    int age; //나이
//
//    //메서드
//    public void eat(){
//        System.out.println(name+"이(가) 먹을 밥이 없습니다.");
//    }             부모 클래스인 Main 클래스에 이미 정의된 부분이기에 지운다
    public void roll(){
        System.out.println(name+"이(가) 바닥을 구릅니다");
    }
}
