package Bank_framework;

public abstract class bankfactory {
   public abstract SavingsAcc getNewSavingsAcc(int accno, String accnm,float accbal, boolean isSalary);
   public abstract CurrentAcc getNewCurrentAcc(int accno, String accnm,float accbal,float creditLimit);
}
