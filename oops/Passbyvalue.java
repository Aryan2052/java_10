class Demo{
    public void changeValue(int val1, int val2){
        val1 = val1+val2;
        val2 = val1-val2;
        System.out.println("Value of val1: " + val1);
        System.out.println("Value of val2: " + val2);
    }
}


public class Passbyvalue {
    public static void main(String[] args){
        Demo demo = new Demo();
        int a = 10;
        int b = 20; 
        System.out.println("Before changeValue method:");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        demo.changeValue(a,b);
        System.out.println("After changeValue method:");
        System.out.println("Value of a: " + a); 
        System.out.println("Value of b: " + b);
        // The values of a and b remain unchanged after the method call
        // because Java passes arguments by value, not by reference.

    }
    
}
