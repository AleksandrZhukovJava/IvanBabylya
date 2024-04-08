package model;

import java.util.List;

public class Programmer implements Worker{
    public int id;
    public String fullname;
    public int salary;


    public Programmer(String fullname, int salary) {
        this.id = getId();
        this.fullname = fullname;
        this.salary = salary;
    }

    public void work(){
        System.out.println("Programmer working");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackendDeveloper that)) {
            return false;
        }
        return salary == that.salary && fullname == that.fullname;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "fullname='" + fullname + '\'' +
                ", workHours=" + salary +
                '}';
    }
}
