package labExceptionalHandling;
class InsufficeientBalanceException extends Exception{
    InsufficeientBalanceException(String msg){
        super(msg);
    }
}
class BankAccount{
    private int accountNo;
    private int balance;
   BankAccount(int accountNo,int balance){
       this.accountNo=accountNo;
       this.balance=balance;
   }
    public void deposit(int amount){
        balance=balance+amount;
        System.out.println("amount "+amount+" is added cureent balance is "+balance);

    }
    public void withdraw(int amount) throws InsufficeientBalanceException{
        if(amount>balance){
            throw new InsufficeientBalanceException("balance is insuffficeient cant withdraw");
        }
        else{
            balance=balance-amount;
            System.out.println("amount "+amount+" successfully withdrawn current balance "+balance);
        }
    }

}
public class Main2 {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount(123,6000);
        b1.deposit(5000);

        try{
            b1.withdraw(11000);
        }catch(InsufficeientBalanceException e){
            e.printStackTrace();
        }
        try{
            b1.withdraw(1000);
        }catch(InsufficeientBalanceException e){
            e.printStackTrace();
        }

        System.out.println("other code executing");
    }

}
