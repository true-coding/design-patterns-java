package behavioral.chainOfResponsibility;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {

        Corporal corporal = new Corporal();
        Sergeant sergeant = new Sergeant();
        Major major = new Major();

        corporal.setSuccessor(sergeant);
        sergeant.setSuccessor(major);


        Request request = new Request(RequestType.GROUPING, ClassificationType.OFFICIAL);
        corporal.handleRequest(request);

        request = new Request(RequestType.MISSION, ClassificationType.UNCLASSIFIED);
        corporal.handleRequest(request);


        request = new Request(RequestType.SECRETMISSION, ClassificationType.SECRET);
        corporal.handleRequest(request);

    }
}
