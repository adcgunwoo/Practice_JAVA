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
    public void displayNames(){
        System.out.println("자식 클래스의 name : " + this.name);
        System.out.println("부모 클래스의 name : " + super.name); //super 키워드를 통해 부모 클래스의 필드에 접근가능하다.
    }
    //2. super 키워드는 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출할 때 사용한다.
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed=breed;
        System.out.println("품종 : " + this.breed);
    }
}
