package br.com.geekuniversity.section18;

public class Box {
    private Object[] objects;
    private int freePosition;

    public Box() {
        this.objects = new Object[100];
        this.freePosition = 0;
    }

    public void add(Object newAccount) {
        this.objects[this.freePosition] = newAccount;
        this.freePosition++;
    }

    public Object take(int freePosition) {
        return (this.objects[freePosition]);
    }
}
