package model;

public class FrontendDeveloper implements Worker{
    public String fullname;
    public int salary;

    public FrontendDeveloper() {
    }

    public FrontendDeveloper(String fullname, int salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public void work(){
        System.out.println("FrontendDeveloper working");
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
    public int hashCode() {
        return salary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "fullname='" + fullname + '\'' +
                ", workHours=" + salary +
                '}';
    }
}
