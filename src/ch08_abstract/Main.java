package ch08_abstract;

public class Main {
    public static void main(String[] args){
        CheckingAccount myChecking = new CheckingAccount("1002652885161",8);
        myChecking.displayAccountInfo();//계좌정보 출력
        myChecking.withdraw(1); //출금해보기
        myChecking.deposit(2);//입금해보기
    }
}
