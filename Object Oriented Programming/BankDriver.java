public class BankDriver {
    public static void main(String[] args) {
        // 사람 선언
        Person p1 = new Person(); // 생성자를 통해 객체 생성
        p1.name = "PJH";
        p1.age = 24;
        p1.cashAmount = 500000;

        // 계좌 생성
        BankAccount a1 = new BankeAccount();
        a1.balance = 100000;
        
        p1.account = a1;
        a1.owner = p1;
    
    }
}