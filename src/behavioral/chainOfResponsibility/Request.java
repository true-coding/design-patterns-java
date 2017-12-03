package behavioral.chainOfResponsibility;

public class Request {

    private RequestType requestType;
    private ClassificationType classificationType;

    public Request(RequestType requestType, ClassificationType classificationType) {
        this.requestType = requestType;
        this.classificationType = classificationType;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public ClassificationType getClassificationType() {
        return classificationType;
    }
}
