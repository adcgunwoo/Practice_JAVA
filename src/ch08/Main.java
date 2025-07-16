package ch08;

public class Main {
    public static void main(String[] args){
        //super
        //super는 부모 클래스를 참조하는데 사용한다.
        //1. super 키워드는 자식 클래스에서 부모 클래스의 메서드를 호출할 때 사용한다.
        Cat mycat = new Cat("삼색이", 3);
        Dog mydog = new Dog("바둑이", 2, "진돗개");
        mycat.name = "바둑";
        mycat.age = 1;
        mycat.eat(); //super.eat()을 작성해뒀기에 실행 시 부모, 자식 클래스의 eat()의 결과가 모두 출력된다.

        mydog.eat(); //자식 클래스 객체가 부모 클래스의 필드에 접근 가능하다.(public 이기 때문에)

    }
}
