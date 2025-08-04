package ch08_interface;

public interface BankAccount { //계좌에 필요한 메서드를 선언
    void withdraw(double amount); //입금메서드
    void deposit(double amount); //출금메서드
    void displayAccountInfo(); //현 계좌 정보를 나타내는 메서드
}
