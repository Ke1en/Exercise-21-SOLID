package Transport;

import java.util.List;

public class TransportManager {
    private List<Transport> transports;

    public TransportManager(List<Transport> transports) {
        this.transports = transports;
    }

    public void start() {
        for (Transport transport: transports) {
            transport.move();
        }
    }
}
