class DemoReference {
    public int number;
    public void change(DemoReference d){
        d.number = 99999999;
        System.out.println("Value of no: " + d.number);
    }
}

public class Passbyrefrence {
    public static void main(String[] args){
        DemoReference d = new DemoReference();
        d.number = 69696969;
        System.out.println("Before change method:");
        System.out.println("Value of no: " + d.number);
        d.change(d);
        System.out.println("After change method:");

        //in here we pass not the value but the object itself so the value is pass by refrence.
        System.out.println("Value of no: " + d.number);
        // The value of no is changed after the method call because Java passes the reference of the
    }
    
}
