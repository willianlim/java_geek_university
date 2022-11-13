package br.com.geekuniversity.section15;

public class Account {
    private int number;
    private String client;
    public static int counter = 1;

    public Account(String client) {
        this.number = counter;
        this.client = client;
        Account.counter += 1;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
