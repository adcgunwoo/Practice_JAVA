package ch08;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog(); //강아지 객체 생성
        Cat cat = new Cat(); //고양이 객체 생성
        dog.breed = "포메라니안";
        dog.age = 1;
        dog.name = "광운";
        dog.roll();
        System.out.println("저의 종은 " + dog.breed + "이고, 나이는 " + dog.age + "살이 되었어요. " + "이름은 " + dog.name+ "이에요");
        dog.eat();
        cat.age = 2;
        cat.name = "새빛";
        cat.rub();
        System.out.println("저는 " + cat.name + "이에요. 나이는 " + cat.age + "살이에요.");
        //접근 제한자가 default이므로 같은 패키지 내에서는 제약없이 접근할 수 있었다.
    }
}
