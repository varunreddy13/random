package org.example.employes;

public class Employe {

    private int id;
    private String name;
    private String departmant;

    private String grade;
    private long salary;

    public Employe() {
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Employe(int id, String name, String departmant, String grade, long salary) {
        this.id = id;
        this.name = name;
        this.departmant = departmant;
        this.grade = grade;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departmant='" + departmant + '\'' +
                ", salary=" + salary +
                ", salary=" + grade +
                '}';
    }
}
