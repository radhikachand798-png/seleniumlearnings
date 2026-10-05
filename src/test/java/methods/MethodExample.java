package methods;

public class MethodExample {

    //method body

    //[access_modifier] [non-access-modifier] [return-type] [method_name] (parameters){
    // block of code
    // }

   static int a =5;
   static int b =2;
    public static void main(String[] args) {
        MethodExample obj1= new MethodExample();
        obj1.sum();
        obj1.diff();
         additional(10,20);
         obj1.name();
        System.out.println(obj1.name());
        obj1.isTrue();
        System.out.println(obj1.isTrue());

    }

    public void sum() {

        int sum = a + b;
        System.out.println("the total sum is :" + sum);
    }


    public

    void diff() {

        int diff = a - b;
        System.out.println("the difference is: " + diff);

    }
    public static void additional(int number1, int number2){
        int sum= number1+number2;
        System.out.println("the total sum is "+sum);
    }
    public String name(){
        return "radhika chand";

    }
    boolean isTrue(){
        return true;
    }
}




