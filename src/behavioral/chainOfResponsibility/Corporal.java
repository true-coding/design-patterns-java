package behavioral.chainOfResponsibility;

public class Corporal extends Handler {

    @Override
    public void handleRequest(Request request) {

        if (request.getRequestType() == RequestType.GROUPING &&
                request.getClassificationType() == ClassificationType.OFFICIAL) {

            System.out.println("Corporal is handling request.");
        }
        else
        {
            successor.handleRequest(request);
        }
    }
}
