package ch08_abstract;

public abstract class BankAccount { //접근 제한자와 class 사이에 abstract를 추가하여 추상클래스를 선언하였다.
    String accountNumber; //계좌 번호
    double balance; //잔액
    public BankAccount(String accountNumber, double intialBalance){ //생성자, 계좌 번호외 초기 금액을 전달 받아 계좌를 생성한다.
        this.accountNumber=accountNumber;
        this.balance=intialBalance;
    }
    //추상 메서드(입출금)
    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);

    public void displayAccountInfo(){ //계좌번호 출력 메서드
        System.out.println("계좌번호 : " + accountNumber);
        System.out.println("잔액 : " + balance+ "원");
    }
}
