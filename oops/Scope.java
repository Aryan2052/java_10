class Demo{
    public int var1;
    //method
    public void printValue(){
        int var2 = 69; //local variable of this method
        System.out.println("Value of var1: " + var1);
        System.out.println("Value of var2: " + var2);
    }

}
public class Scope{
    public static void main(String[] args){

        Demo demo = new Demo();
        demo.var1 = 44;
        demo.printValue();

        // System.out.println(demo.var2);
		// System.out.println(var1);

    }
}