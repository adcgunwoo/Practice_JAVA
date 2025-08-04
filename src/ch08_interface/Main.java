package ch08_interface;

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
