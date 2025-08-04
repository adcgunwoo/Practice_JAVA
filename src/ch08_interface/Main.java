package ch08_interface;
//ps) 인터페이스 에서의 디폴트 메서드와 정적 메서드
//디폴트 메서드는 메서드 동작이 구현된 메서드로, 메서드 앞에 default 키워드가 붙는다. default 키워드가 붙지않으면 추상메서드로 인식
//인터페이스를 구현한 클래스에서 오버라이딩할 수 있다. 디폴트 메서드를 사용하면 구현 클래스의 기존 구조와 동작을 망가뜨리지 않으면서
//새 기능을 추가할 수 있다.
//정적 메서드는 앞에 static 키워드가 붙으며 인터페이스 이름으로 직접 호출할 수 있다. 디폴트 메서드처럼 동작이 구현돼 있지만, 구현 클래스에서
//오버라이딩 할 수는 없다.
//인터페이스는 또한 상수만 포함할 수 있다. 인터페이스에 필드를 선언하면 자동으로 public, static, final 키워드가 붙는다.
public class Main {
    public static void main(String[] args){
        CheckingAccount myChecking = new CheckingAccount("123-4567890", 10000,0.02);
        //계좌 상태 초기화
        myChecking.displayAccountInfo(); //계좌 상태 출력
        myChecking.deposit(5000); //입금메서드 호출
        myChecking.addInterest(); //이자 입금 메서드 호출
        myChecking.withdraw(1000); //출금메서드 호출
        myChecking.displayAccountInfo();
    }
}
