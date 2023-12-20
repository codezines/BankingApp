package Bank_framework;

public abstract class SavingsAcc extends BankAcc {
    private boolean isSalary;
    private static final float minbal=0;

    public SavingsAcc(int accno, String accnm, float accbal, boolean isSalary) {
        super(accno, accnm, accbal);
    }
    public boolean isSalary() {
        return isSalary;
    }
    public static float minbal(){
        return minbal;
    }

    public void withdraw(float minbal){
        System.out.println("the amount withdrawl is:"+ minbal);
    }

    @Override
    public String toString() {
        return "SavingsAcc{" +
                "isSalary=" + isSalary +
                '}';
    }
}
