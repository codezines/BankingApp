package Bank_Application;

import Bank_framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
    public MMCurrentAcc(int accno, String accnm, float accbal, float creditLimit) {
        super(accno, accnm, accbal,creditLimit);
    }
    public void withdraw(float CreditLimit){
        System.out.println("Dear CurrentAcc Customer"+" "+getAccnm());
        System.out.println("your bank account credit limit is"+  CreditLimit);
        System.out.println("your bank account balance is"+getAccbal());
    }

    @Override
    public String toString() {
        return "MMCurrentAcc{}";
    }
}
