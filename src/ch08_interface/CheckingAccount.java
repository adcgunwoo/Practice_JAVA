package ch08_interface;

public class CheckingAccount implements BankAccount, InterestBearing{
    String accountNumber;
    double balance; //현재 잔액
    double interestRate; //이자율

    public CheckingAccount(String accountNumber, double intialBalance, double interestRate){
        this.accountNumber=accountNumber;
        this.balance=intialBalance;
        this.interestRate = interestRate; //이자율 초기화
    }

    @Override
    public void deposit(double amount) { //입금메서드
        if(amount>0) {
            balance += amount;
            System.out.println(amount+"원이 입금됐습니다.");
            System.out.println("잔액 : " + balance + "원 입니다.");
        }
        else {
            System.out.println("입금액은 0원 보다 커야합니다.");
        }
    }
    @Override
    public void withdraw(double amount){ //출금메서드
        if(amount>0 && balance >=amount){
            System.out.println(amount+"원이 출금됐습니다.");
            System.out.println("잔액 : "+balance+"원 입니다.");
        }
        else {
            System.out.println("잔액이 부족해서 출금할 수 없습니다.");
        }
    }
    @Override
    public void displayAccountInfo(){ //계좌 정보 출력 메서드 구현
        System.out.println("계좌 번호 : "+accountNumber);
        System.out.println("잔액 : "+balance+"원");
        System.out.println("이자율 : "+(interestRate*100)+"%");
    }
    public void addInterest(){ //이자 계산 메서드
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("이자 "+interest+"원이 추가됐습니다.");
    }
}
