package ch08;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog(); //강아지 객체 생성
        Cat cat = new Cat(); //고양이 객체 생성
        dog.breed = "포메라니안";
        dog.age = 1;
        dog.name = "광운";
        dog.eat();
        cat.age = 2;
        cat.name = "새빛";
        cat.rub();
        cat.eat();
        dog.roll(2);
        Animal myAnimal1 = new Dog();
        Animal myAnimal2 = new Cat();
        //업캐스팅 자식클래스의 객체를 부모클래스로 변환하는것, 명시적으로 변환하지 않아도 자동으로 이루어진다.
        myAnimal1.age=1;
        myAnimal1.name="비마";
        // myAnimal1.breed 업캐스팅된 참조 변수로는 부모 클래스에 선언된 필드와 메서드에만 접근할 수 있다. 자식클래스에 정의된 필드와 메서드에는 접근할수없다.
        myAnimal2.name="참빛";
        myAnimal2.age=3;
        myAnimal1.eat();
        myAnimal2.eat();
        //업캐스팅된 참조 변수는 자식 클래스에 정의된 필드와 메서드에는 접근할 수 없는데, 왜 쓸까?
        //부모 클래스 하나로 여러 자식 클래스의 객체를 다룰 수 있기 때문이다.

        //다운캐스팅 : 부모 클래스형 객체를 자식 클래스형으로 형변환하는것이다. (자식클래스 명)을 붙힌 명시적 변환을 통해야 한다.
        Dog mydog = (Dog)myAnimal1;
        Cat mycat = (Cat)myAnimal2;
        mydog.roll();
        mydog.roll(3);
        mycat.rub();
        mycat.eat();
        //위 업캐스팅에서 볼 수 있다시피 부모클래스 명으로 선언된 참조 변수는 자식 클래스에 접근할 수 없지만, 다운캐스팅을 거치면 다시 접근가능하다.



        //접근 제한자가 default이므로 같은 패키지 내에서는 제약없이 접근할 수 있었다.
    }
}
