package Bank_framework;

    public abstract class BankAcc {
        private int accno;
        private String accnm;
        private float accbal;

        public float getAccbal() {
            return accbal;
        }

        public String getAccnm() {
            return accnm;
        }

        public void setAccnm(String accnm) {
            accnm = accnm;
        }

        public int getAccno() {
            return accno;
        }

        public BankAcc(int accno,String accnm,float accbal) {
            super();
            this.accno = accno;
            this.accnm=accnm;
            this.accbal=accbal;
        }

        public void withdraw(float accbal){
            System.out.println("your amout in withdrawl"+ accbal);

        }
        public void deposite(float accbal){
            System.out.println("your amount is deposited"+ accbal);

        }

        @Override
        public String toString() {
            return "BankAcc{" +
                    "accno=" + accno +
                    ", accnm='" + accnm + '\'' +
                    ", accbal=" + accbal +
                    '}';
        }
    }
