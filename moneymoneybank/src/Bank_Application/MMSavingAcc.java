package Bank_Application;

import Bank_framework.SavingsAcc;

public class MMSavingAcc extends SavingsAcc {

    public MMSavingAcc(int accno, String accnm, float accbal, boolean isSalary) {
        super(accno, accnm, accbal, isSalary);
    }
    public void withdraw(float accbal){
        System.out.println("Dear SavingAcc customer "+" "+ getAccnm()+" "+"your bank account balance is"+ accbal);
    }

    @Override
    public String toString() {
        return "MMSavingAcc{}";
    }
}
