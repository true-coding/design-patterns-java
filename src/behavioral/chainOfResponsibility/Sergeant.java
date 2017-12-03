package behavioral.chainOfResponsibility;

public class Sergeant extends Handler {

    @Override
    public void handleRequest(Request request) {

        if (request.getRequestType() == RequestType.MISSION &&
                request.getClassificationType() == ClassificationType.UNCLASSIFIED) {

            System.out.println("Sergeant is handling the request.");
        }
        else
        {
            successor.handleRequest(request);
        }
    }
}
