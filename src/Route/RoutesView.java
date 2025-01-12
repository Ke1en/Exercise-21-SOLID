package Route;

import java.util.List;

public class RoutesView {
    public void displayRoutes(List<Route> routes) {
        System.out.println("Все доступные маршруты: ");

        for (int i = 0; i < routes.size(); i++) {
            Route route = routes.get(i);
            System.out.println("[" + i + "] " + "Маршрут номер " + route.getNumber() + " стоимостью " + route.getTicket().getPrice());
        }
        System.out.println();
    }

    public void displayTickets(List<Person> personList) {
        System.out.println("Все забронированные билеты: ");

        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            System.out.println("[" + i + "] " + "Билет забронирован за " + person.getName());
        }
        System.out.println();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
