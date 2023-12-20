package Bank_framework;

public abstract class CurrentAcc extends BankAcc{
    private final float creditLimit=3000;

    public CurrentAcc(int accno, String accnm, float accbal, float minbal) {
        super(accno, accnm, accbal);
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public void withdraw(float minbal){
        System.out.println("Dear customer your account balance shoud not be less than"+minbal);
    }

    @Override
    public String toString() {
        return "CurrentAcc{" +
                "creditLimit=" + creditLimit +
                '}';
    }
}
