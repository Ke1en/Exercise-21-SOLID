package Route;

public class Person {
    private final String name;
    private Ticket ticket;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
