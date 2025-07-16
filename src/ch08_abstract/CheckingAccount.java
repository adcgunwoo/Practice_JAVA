package ch08_abstract;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, double initialBalance){
        super(accountNumber, initialBalance);
    }
    //오버라이딩해서 추상 메서드 구현(출금 메서드)
    public void withdraw(double amount){
        if(amount>0 && balance >=amount){
            balance-=amount;
            System.out.println(amount+"원이 인출됐습니다.");
            System.out.println("현재 잔액 : "+balance);
        }
        else {
            System.out.println("잔액이 부족합니다.");
        }
    }
    //오버라이딩해서 추상 메서드 구현(입금 메서드)
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount+"원이 입금됐습니다.");
            System.out.println("현재 잔액 : "+balance);
        }
        else {
            System.out.println("입금은 0원 이상이어야 합니다.");
        }
    }
}

