package ch08;

public class Cat extends Animal {

    public void rub(){
        System.out.println(name+"이(가) 몸을 비빕니다");
    }
    @Override //다음과 같은 애너테이션을 추가하여 명시적으로 나타낼 수도 있습니다.
    public void eat(){ //메서드 오버라이딩
        super.eat();    //부모 클래스의 eat()메서드가 호출된다.
        System.out.println(name+"이(가) 닭고기를 먹습니다.");
    }
    //2. super 키워드는 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출할 때 사용한다.
    public Cat(String name, int age){
        super(name,age);
    }
}
