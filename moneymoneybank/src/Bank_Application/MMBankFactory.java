package Bank_Application;

import Bank_framework.CurrentAcc;
import Bank_framework.SavingsAcc;
import Bank_framework.bankfactory;

public class MMBankFactory extends bankfactory {
    @Override
    public SavingsAcc getNewSavingsAcc(int accno, String accnm, float accbal, boolean isSalary) {
     MMSavingAcc msaving= new MMSavingAcc(accno,accnm,accbal,isSalary);
        return null;
    }

    @Override
    public CurrentAcc getNewCurrentAcc(int accno, String accnm, float accbal, float creditLimit) {
        MMCurrentAcc mcurrent= new MMCurrentAcc(accno,accnm,accbal,creditLimit);
        return null;
    }
}
