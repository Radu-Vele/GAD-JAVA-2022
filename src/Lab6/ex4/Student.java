package Lab6.ex4;

import java.util.Objects;

public class Student extends Person{
    private String university;

    public Student(String university, String name) {
        super(name);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;

        Student p = (Student) o;
        return p.university.equals(((Student) o).university);
    }

}
