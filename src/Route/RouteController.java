package Route;

import java.util.Scanner;

public class RouteController {
    private final RouteModel model;
    private final RoutesView view;

    public RouteController(RouteModel model, RoutesView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int route;
        String passengerName;

        while (true) {
            System.out.println("Команды add, bookTicket, unbookTicket, routes, tickets, exit");
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();

            try {
                switch (command.toLowerCase()) {
                    case "add":
                        System.out.println("Введите номер маршрута и его цену {route price}");
                        route = Integer.parseInt(scanner.nextLine());
                        int price = Integer.parseInt(scanner.nextLine());
                        model.addRoute(route, price);
                        view.displayMessage("Маршрут создан");
                        break;
                    case "bookticket":
                        System.out.println("Введите имя пассажира и номер маршрута для брони {name route}");
                        passengerName = scanner.nextLine();
                        route = Integer.parseInt(scanner.nextLine());
                        model.bookTicket(passengerName, route);
                        break;
                    case "unbookticket":
                        System.out.println("Введите имя пассажира для снятия брони {name}");
                        passengerName = scanner.nextLine();
                        model.unbookTicket(passengerName);
                        break;
                    case "routes":
                        view.displayRoutes(model.getRoutes());
                        break;
                    case "tickets":
                        view.displayTickets(model.getTickets());
                        break;
                    case "exit":
                        view.displayMessage("Программа завершена");
                        return;
                    default:
                        view.displayMessage("Неизвестная команда");
                }
            } catch (Exception e) {
                view.displayMessage("Ошибка " + e.getMessage());
            }
        }
    }
}
