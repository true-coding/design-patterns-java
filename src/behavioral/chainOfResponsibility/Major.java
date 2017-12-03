package behavioral.chainOfResponsibility;

public class Major extends Handler {

    @Override
    public void handleRequest(Request request) {

        if (request.getRequestType() == RequestType.SECRETMISSION &&
                request.getClassificationType() == ClassificationType.SECRET) {

            System.out.println("Major is handling the request.");
        }
    }
}
