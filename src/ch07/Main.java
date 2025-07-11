//프로젝트 창에서 ch07 패키지를 선택한 상태로 마우스 오른쪽 버튼을 클릭하고
//메뉴에서 새로만들기 -> 자바 이름을 Main으로 설정하면 아래와 같은 상태
//src에 있는 전에 쓰던 Main 클래스와 헷갈리면 안된다.
package ch07;

public class Main {
    public static void main(String[] args){
        Car car = new Car(); //기본생성자로 호출
        System.out.println("");
        Car myCar = new Car("Hyndai", 2025); //브랜드와 연식을 매개변수로 전달
        System.out.println("");
        Car yourcar = new Car("Kia", 2025, "White");
        System.out.println("");
        yourcar.carInfo(); //객체의 인스턴스 메서드를 호출, 점을 통한 점 연산자로 호출하고, 객체의 참조변수인 yourCar로 접근해야함
        System.out.println("");
        car.carInfo();

        //위에 static은 뭘까?
        //메서드 영역에는 클래스 변수와 클래스 메서드 같은 클래스 정보가 저장된다.
        //클래스 변수와 클래스 메서드는 프로그램이 시작될 때 메서드 영역을 할당받고 프로그램이 종료될 때까지 유지된다
        //반면에 인스턴스 변수와 인스턴스 메서드는 객체가 생성될 때마다 힙 영역을 새로 할당받는다.
        //클래스 변수와 클래스 메서드 앞에 static 키워드가 붙는다. static 키워드는 해당 필드나 메서드가, 특정 객체가 아니라
        //클래스 자체에 속함을 의미한다. 그래서 클래스 변수와 클래스 메서드에는 객체가 아니라 클래스명으로 접근한다.
    }
}
