package ch07;
//package는 패키지를 나타내는 키워드이다.
//ch07은 패키지명(패키지명은 무조건 소문자여야한다!!!)


//public은 접근 제한자로 아무것도 붙이지 않거나 public을 붙이는 2가지만 가능(C++에서는 protected 도 있었다)
//Class는 클래스임을 나태내는 키워드. 뒤 Car은 클래스명이다
public class Car {
    static int countOfCars = 0; //static 변수 또는 클래스 변수, 클래스로 생성된 모든 객체가 공유

    String brand; //아래 3개는 인스턴수 변수로, 객체마다 각각 고유한 값이 저장됨
    int year;
    String color;

    public void carInfo(){ //클래스 안에 정의한 함수를 메서드라고 한다.
        //public은 접근제한자로 접근범위를 제한할 수 있다.
        //반환형과 매개변수를 합쳐 메서드 시그니처라 한다.

        System.out.println("----자동차 정보----");
        System.out.println("브랜드 : "+ brand);
        System.out.println("연식 : "+ year);
        System.out.println("색 : "+ color);
        //다음과 같이 인스턴스 변수에 접근할 수 있는 메서드를 인스턴스 메서드라고 한다.
    }
    public static void countOfCarsInfo(){
        System.out.println("자동차 수량 : "+countOfCars);
        //클래스 변수에 접근하였다. 이처럼 클래스 변수에 접근할 수 있는 메서드를 클래스 메서드라고 한다.
        //static 키워드를 사용했기에 정적 메서드라고도 한다.
    }
    //중요!!!!!!!!! 클래스 메서드는 인스턴스 변수나 인스턴스 메서드에 접근할 수 없다!!

    public Car(){
        System.out.println("기본생성자를 통해 새 객체가 생성됐습니다.");
    }
    //위 생성자는 기본생성자로서 굳이 정의하지 않아도 컴파일러가 자동으로 추가한다.
    //생성자는 여러 개 정의할수 있고, 매개변수가 전부 달라야 한다.

    public Car(String brand, int year){
        System.out.println("브랜드와 연식을 받은 새로운 자동차 객체가 생성됐습니다.");
        this.brand=brand;
        this.year=year;
        this.color="white";
        this.carInfo();
    }
    public Car(String brand, int year,String color){
        System.out.println("브랜드, 연식, 색을 받은 새로운 자동차 객체가 생성됐습니다.");
        this.brand=brand;
        this.year=year;
        this.color=color;
        this.carInfo();
    }


}
