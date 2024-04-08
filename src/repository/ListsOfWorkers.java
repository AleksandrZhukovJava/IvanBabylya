package repository;

import model.BackendDeveloper;
import model.FrontendDeveloper;
import model.FullstackDeveloper;
import model.Programmer;
import model.Worker;

import java.util.ArrayList;

public class ListsOfWorkers {
    static ArrayList<BackendDeveloper> backendDevelopers = new ArrayList<>();
    static ArrayList<FullstackDeveloper> fullstackDevelopers = new ArrayList<>();
    static ArrayList<FrontendDeveloper> frontendDevelopers = new ArrayList<>();
    static ArrayList<Programmer> programmers = new ArrayList<>();

    public void getAllWorkers() {
        for (int i = 0; i < backendDevelopers.size(); i++) {
            System.out.println(backendDevelopers.get(i));
        }
        for (int i = 0; i < fullstackDevelopers.size(); i++) {
            System.out.println(fullstackDevelopers.get(i));
        }
        for (int i = 0; i < frontendDevelopers.size(); i++) {
            System.out.println(frontendDevelopers.get(i));
        }
        for (int i = 0; i < programmers.size(); i++) {
            System.out.println(programmers.get(i));
        }
    }

    public void getAllSalary() {
        int salary = 0;
        for (int i = 0; i < backendDevelopers.size(); i++) {
            salary = salary + backendDevelopers.get(i).salary;
        }
        for (int i = 0; i < fullstackDevelopers.size(); i++) {
            salary = salary + fullstackDevelopers.get(i).salary;
        }
        for (int i = 0; i < frontendDevelopers.size(); i++) {
            salary = salary + frontendDevelopers.get(i).salary;
        }
        for (int i = 0; i < programmers.size(); i++) {
            salary = salary + programmers.get(i).salary;
        }
        System.out.println("Суммарная зарплата - " + salary);
    }

    public void getSalary(BackendDeveloper backendDeveloper,
                          FullstackDeveloper fullstackDeveloper,
                          FrontendDeveloper frontendDeveloper,
                          Programmer programmer) {
        int salary = 0;
        if (backendDeveloper != null) {
            for (int i = 0; i < backendDevelopers.size(); i++) {
                salary = salary + backendDevelopers.get(i).salary;
            }
        }
        if (fullstackDeveloper != null) {
            for (int i = 0; i < fullstackDevelopers.size(); i++) {
                salary = salary + fullstackDevelopers.get(i).salary;
            }
        }
        if (frontendDeveloper != null) {
            for (int i = 0; i < frontendDevelopers.size(); i++) {
                salary = salary + frontendDevelopers.get(i).salary;
            }
        }
        if (programmer != null) {
            for (int i = 0; i < programmers.size(); i++) {
                salary = salary + programmers.get(i).salary;
            }
        }
        if (backendDeveloper != null) {
            System.out.println("Суммарная зарплата backendDeveloper - " + salary);
        }
        if (backendDeveloper != null) {
            System.out.println("Суммарная зарплата fullstackDeveloper - " + salary);
        }
        if (backendDeveloper != null) {
            System.out.println("Суммарная зарплата frontendDeveloper - " + salary);
        }
        if (backendDeveloper != null) {
            System.out.println("Суммарная зарплата programmer - " + salary);
        }
    }

    public void remove(Worker worker) {
        if (worker instanceof BackendDeveloper a) {
            backendDevelopers.remove(a);
        }
        if (worker instanceof FrontendDeveloper a) {
            frontendDevelopers.remove(a);
        }
        if (worker instanceof FullstackDeveloper a) {
            fullstackDevelopers.remove(a);
        }
        if (worker instanceof Programmer a) {
            programmers.remove(a);
        }
    }

    public void workAll() {
        for (int i = 0; i < backendDevelopers.size(); i++) {
            backendDevelopers.get(i).work();
        }
        for (int i = 0; i < fullstackDevelopers.size(); i++) {
            fullstackDevelopers.get(i).work();
        }
        for (int i = 0; i < frontendDevelopers.size(); i++) {
            frontendDevelopers.get(i).work();
        }
        for (int i = 0; i < programmers.size(); i++) {
            programmers.get(i).work();
        }
    }

    public static ArrayList<BackendDeveloper> getBackendDevelopers() {
        return backendDevelopers;
    }

    public static ArrayList<FullstackDeveloper> getFullstackDevelopers() {
        return fullstackDevelopers;
    }

    public static ArrayList<FrontendDeveloper> getFrontendDevelopers() {
        return frontendDevelopers;
    }

    public static ArrayList<Programmer> getProgrammers() {
        return programmers;
    }
}
