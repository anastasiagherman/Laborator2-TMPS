package Proxy;

public class ProxyDBOperation  implements DataBaseOperations{
    private String userName;
    private RealDBOperation realDBOperation;

    public ProxyDBOperation(String userName){
        this.userName = userName;
    }

    @Override
    public void view() {
        if (getRole(userName).equals("Admin") ||
                getRole(userName).equals("User")) {
            realDBOperation = new RealDBOperation();
            realDBOperation.view();
        }
        else {
            System.out.println("You can not view this record.");
        }
    }

    @Override
    public void edit() {
        if (getRole(userName).equals("ADMIN")) {
            realDBOperation = new RealDBOperation();
            realDBOperation.edit();
        }
        else {
            System.out.println("You can not edit this record.");
        }
    }
    public String getRole(String userName) {

        return userName;
    }
}
