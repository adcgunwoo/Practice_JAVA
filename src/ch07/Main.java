//프로젝트 창에서 ch07 패키지를 선택한 상태로 마우스 오른쪽 버튼을 클릭하고
//메뉴에서 새로만들기 -> 자바 이름을 Main으로 설정하면 아래와 같은 상태
//src에 있는 전에 쓰던 Main 클래스와 헷갈리면 안된다.
package ch07;

public class Main {
    public static void main(String[] args){
        Car car = new Car(); //기본생성자로 호출
        Car myCar = new Car("Hyndai", 2025); //브랜드와 연식을 매개변수로 전달
        Car yourcar = new Car("Kia", 2025, "White");
        yourcar.carInfo(); //객체의 인스턴스 메서드를 호출, 점을 통한 점 연산자로 호출하고, 객체의 참조변수인 yourCar로 접근해야함
    }
}
