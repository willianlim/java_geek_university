package br.com.geekuniversity.section11;

public class Account {
    private int number;
    private float balance;
    private float limit;
    private Client client;

    public Account() {

    }

    public Account(int number, float balance, float limit, Client client) {
        this.number = number;
        this.balance = balance;
        this.limit = limit;
        this.client = client;
    }

    public void withdraw(float value) {
        if (value <= this.balance) {
            this.balance -= value;
        } else if(value <= (this.balance + this.limit)) {
            float val_ret = this.balance - value;
            if (val_ret < 0)
                this.balance = 0;
            val_ret += this.limit;
            this.limit = val_ret;
            System.out.println("Insufficient funds");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    /**
     * Method to make a deposit
     *
     * @param value To be deposited
     */
    public void deposit(float value) {
        this.balance = this.balance + value;
    }

    /**
     * Method getter of the balance attribute
     *
     * @return The sum of the balance plus the limit
     */
    public float getBalance() {
        return (this.balance + this.limit);
    }

    public float getLimit() {
        return (this.limit);
    }

    @Override
    public String toString() {
        return ("The account balance is: " + this.getBalance());
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Account)) {
            return (false);
        } else {
            Account check = (Account) object;
            return check.getBalance() == this.getBalance();
        }
    }
}
