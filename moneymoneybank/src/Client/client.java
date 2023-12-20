package Client;

import Bank_Application.MMBankFactory;
import Bank_Application.MMCurrentAcc;
import Bank_Application.MMSavingAcc;
import Bank_framework.CurrentAcc;
import Bank_framework.SavingsAcc;
import Bank_framework.bankfactory;

public class client {
    public static void main(String[] args) {
        bankfactory bf = new MMBankFactory();
        SavingsAcc sa=new MMSavingAcc(123,"PRIYA",5000,true);
        sa.withdraw(sa.getAccbal());
        sa.toString();
        CurrentAcc ca= new MMCurrentAcc(345,"bharath",6000,3000);
        ca.withdraw(ca.getCreditLimit());
        ca.toString();
    }

}
