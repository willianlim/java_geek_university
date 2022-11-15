package br.com.geekuniversity.section21;

import java.util.Arrays;

public class Vector {
    private Student[] students = new Student[100];
    private int total = 0;

    public void add(Student student) {
        this.secureSpace();
        this.students[total] = student;
        this.total += 1;
    }

    public void add(int position, Student student) {
        this.secureSpace();
        if (!occupiedPosition(position)) {
            throw new IllegalArgumentException("Position invalid.");
        }
        for (int i = this.total - 1; i >= position; i--) {
            this.students[i + 1] = this.students[i];
        }
        this.students[position] = student;
        this.total++;
    }

    public Student take(int position) {
        if (!occupiedPosition(position)) {
            throw new IllegalArgumentException("invalid position");
        }
        return (this.students[position]);
    }

    public void remove(int position) {
        for (int i = 0; i < this.total; i++) {
            this.students[i] = this.students[i + 1];
        }
        this.total--;
    }

    public boolean contain(Student student) {
        for (int i = 0; i < total; i++) {
            if (student.equals(this.students[i])) {
                return (true);
            }
        }
        return (false);
    }

    public int size_() {
        return (this.total);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.students);
    }

    private boolean occupiedPosition(int position) {
        return (position >= 0 && position < total);
    }

    private void secureSpace() {
        if (total == students.length) {
            Student[] newArray = new Student[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                newArray[i] = students[i];
            }
            this.students = newArray;
        }
    }
}
