package br.com.geekuniversity.section21;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return (this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return other.getName().equals(this.name);
    }

    @Override
    public String toString() {
        return (this.name);
    }
}
