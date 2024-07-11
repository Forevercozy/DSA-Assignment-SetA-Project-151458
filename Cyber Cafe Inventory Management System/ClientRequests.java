public class ClientRequests {

    private String clientName;
    private String requestType;

    public ClientRequests(String customerName, String requestType) {
        this.clientName = customerName;
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return "ClientRequests{" +
                "clientName='" + clientName + '\'' +
                ", requestType='" + requestType + '\'' +
                '}';
    }
}
    
