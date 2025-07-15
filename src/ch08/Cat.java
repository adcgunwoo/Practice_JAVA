package ch08;

public class Cat extends Animal {

    public void rub(){
        System.out.println(name+"이(가) 몸을 비빕니다");
    }
    @Override //다음과 같은 애너테이션을 추가하여 명시적으로 나타낼 수도 있습니다.
    public void eat(){ //메서드 오버라이딩
        System.out.println(name+"이(가) 닭고기를 먹습니다.");
    } //부모 클래스의 메서드를 자식 클래스에서 오버라이딩 하려면, 이름, 반환형, 매개변수의 개수와 순서, 자료형이 모두 같아야 한다.
      //위 메서드는 void형으로 매개변수와 반환값이 없으므로, 이름과 반환형이 같으면 된다.
}
