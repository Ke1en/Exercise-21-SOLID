package Route;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RouteModel {
    private final List<Route> routes = new ArrayList<>();
    private final List<Person> personList = new ArrayList<>();

    public void addRoute(int route, int price) {
        routes.add(new Route(route, new Ticket(price)));
    }

    public void bookTicket(String name, int route) {
        for (Route route1 : routes) {
            if (route1.getNumber() == route) {
                personList.add(new Person(name));
                for (Person person : personList) {
                    if (person.getTicket() == null) {
                        person.setTicket(route1.getTicket());
                    }
                }
            }
        }
    }

    public void unbookTicket(String name) {
        personList.removeIf(person -> person.getName().equalsIgnoreCase(name));
    }

    public List<Person> getTickets() {
        return personList;
    }

    public List<Route> getRoutes() {
        return routes;
    }
}
