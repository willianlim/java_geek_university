package br.com.geekuniversity.section21;

/**
 * Class that represents a cell (container) where we will have the object
 * (value) and a cell that will be the link to the next one.
 * @author willian
 */
public class Cell {
    private Object element;
    private Cell next;
    private Cell previous;

    public Cell(Object element, Cell next) {
        this.element = element;
        this.next = next;
    }

    public Cell(Object element) {
        this(element, null);
    }

    public Object getElement() {
        return (this.element);
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Cell getNext() {
        return (this.next);
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getPrevious() {
        return (this.previous);
    }

    public void setPrevious(Cell previous) {
        this.previous = previous;
    }
}
