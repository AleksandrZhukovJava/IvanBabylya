package service;

import model.BackendDeveloper;
import model.FrontendDeveloper;
import model.FullstackDeveloper;
import model.Programmer;
import model.Worker;
import repository.ListsOfWorkers;

public class IncreaseCenter {
    ListsOfWorkers listsOfWorkers = new ListsOfWorkers();

    public void increaseSalary(Worker worker, Byte percent) {
        boolean udachno = true;
        while(udachno) {
            try {
                ((BackendDeveloper) worker).salary = ((BackendDeveloper) worker).salary * percent;
                ((FrontendDeveloper) worker).salary = ((FrontendDeveloper) worker).salary * percent;
                ((FullstackDeveloper) worker).salary = ((FullstackDeveloper) worker).salary * percent;
                ((Programmer) worker).salary = ((Programmer) worker).salary * percent;
                udachno = false;
            } catch (ClassCastException e) {
                udachno = true;
            }
        }
        System.out.println("Зарплата - " + worker + " повышена");
    }
}
