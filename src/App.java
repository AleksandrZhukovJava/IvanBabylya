import model.BackendDeveloper;
import model.FrontendDeveloper;
import model.FullstackDeveloper;
import model.Programmer;
import repository.ListsOfWorkers;

public class App {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Oleg",100000);
        FullstackDeveloper fullstackDeveloper = new FullstackDeveloper("Gena",100000);
        BackendDeveloper backendDeveloper = new BackendDeveloper();
        FrontendDeveloper frontendDeveloper = new FrontendDeveloper();
        backendDeveloper.fullname = "Inakentiyi";
        backendDeveloper.salary = 20000;
        frontendDeveloper.fullname = "Gosha";
        frontendDeveloper.salary = 25000;

        ListsOfWorkers.getBackendDevelopers().add(backendDeveloper);
        ListsOfWorkers.getProgrammers().add(programmer);
        ListsOfWorkers.getFullstackDevelopers().add(fullstackDeveloper);
        ListsOfWorkers.getFrontendDevelopers().add(frontendDeveloper);

        ListsOfWorkers listsOfWorkers = new ListsOfWorkers();

        listsOfWorkers.getAllWorkers();
        listsOfWorkers.remove(programmer);
        listsOfWorkers.getAllSalary();
        listsOfWorkers.workAll();

        listsOfWorkers.getSalary(null, fullstackDeveloper, null, null);
        listsOfWorkers.getSalary(null, null, null, programmer);
    }
}
