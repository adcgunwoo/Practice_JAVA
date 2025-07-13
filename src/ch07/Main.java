package ch07;
//접근제한자 in 자바
//public : 같은 패키지든 다른 패키지든 상관없이 어디서든 접근 가능하다. 클래스, 필드, 메서드, 생성자에 모두 사용할 수 있다.
//protected : 같은 패키지의 클래스나 다른 패키지의 상속받은 클래스에서 접근할 수 있다. 클래스에는 사용할 수 없고, 필드, 메서드, 생성자에 사용할 수 있다.
//privated : 같은 클래스에서만 접근할 수 있다. protected와 마찬가지로 필드, 메서드, 생성자에만 사용할 수 있다.
//default : 접근 제한자를 따로 명시하지 않으면 자동으로 default 권한이 주어지고, 같은 패키지의 클래스에서만 접근 가능하고, 클래스, 필드, 메서드, 생성자 모두 가능하다.
public class Main {
    public static void main(String[] args) {
    Car car = new Car(250);
    System.out.println("최대 속도 : " + car.getMaxSpeed());
    car.setMaxSpeed(200);
    System.out.println("바뀐 최대 속도 : " + car.getMaxSpeed());
    }
}