package br.com.geekuniversity.section21;

public class LinkedList {
    private Cell first = null;
    private Cell last = null;
    private int total = 0;

    /**
     * Method that adds an object to the beginning of the list
     * @param element
     */
    public void addAtTheBeginning(Object element) {
        // TODO
        Cell newCell = new Cell(element, this.first);
        this.first = newCell;

        if (this.total == 0) {
            this.last = this.first;
        }
        this.total++;
    }

    /**
     * Method that adds an object to the end of the list
     * @param element
     */
    public void _add(Object element) {
        if (this.total == 0) {
            this.addAtTheBeginning(element);
        } else {
            Cell newCell = new Cell(element, null);
            this.last.setNext(newCell);
            this.last = newCell;
            this.total++;
        }
    }

    public void _add(int position, Object element) {
        if (position == 0) {
            this.addAtTheBeginning(element);
        } else if (position == this.total) {
            this._add(element);
        } else {
            Cell previous = this.takeCell(position - 1);
            Cell newCell = new Cell(element, previous.getNext());
            previous.setNext(newCell);
            this.total++;
        }
    }

    public Object take(int position) {
        return (this.takeCell(position).getElement());
    }

    public void remove(int position) {
        // TODO
    }

    public void removeFromBeginning() {
        if (this.total == 0) {
            throw new IllegalArgumentException("Empty list");
        }
        this.first = this.first.getNext();
        this.total--;
        if (this.total == 0)
            this.last = null;
    }

    public int _size() {
        return (this.total);
    }

    public boolean contains() {
        // TODO
        return (false);
    }

    @Override
    public String toString() {
        if (total == 0) {
            return "[]";
        }
        Cell actual = first;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < total; i++) {
            builder.append(actual.getElement());
            builder.append(",");

            actual = actual.getNext();
        }
        builder.append("]");
        return (builder.toString());
    }

    private boolean occupiedPosition(int position) {
        return (position >= 0 && position < this.total);
    }

    private Cell takeCell(int position) {
        if (!occupiedPosition(position)) {
            throw new IllegalArgumentException("Non-existent position");
        }

        Cell actual = this.first;
        for (int i = 0; i < position; i++) {
            actual = actual.getNext();
        }
        return (actual);
    }
}
