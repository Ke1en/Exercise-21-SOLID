package Route;

public class Route {
    private final int number;
    private final Ticket ticket;

    public Route(int number, Ticket ticket) {
        this.number = number;
        this.ticket = ticket;
    }

    public int getNumber() {
        return number;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
