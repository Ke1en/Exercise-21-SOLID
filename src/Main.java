/*
Задача:
        "Система заказа билетов на транспорт"
        Создайте консольное приложение для управления заказами на транспорт.
Пользователь может:
        1. Посмотреть доступные маршруты.
        2. Забронировать билет на маршрут, указав имя пассажира.
        3. Отменить бронь по имени пассажира.
        4. Вывести список всех бронированных мест.
Программа должна быть реализована с учётом SOLID.

* Дополнительное задание:
        1. Добавьте новый вид транспорта, например, "Самолёт".
        2. Реализуйте поиск брони по имени пассажира.
        3. Подсчитайте общее количество бронированных билетов.
*/

import Route.RouteController;
import Route.RouteModel;
import Route.RoutesView;

public class Main {
    public static void main(String[] args) {
        RouteModel model = new RouteModel();
        RoutesView view = new RoutesView();
        RouteController controller = new RouteController(model, view);

        controller.start();
    }
}