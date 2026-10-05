package operators;

public class LogicalOperator {
    public static void main(String [] args){
        int numberOne = 100;
        int numberTwo = 200;
        int numberThree = 300;

        //&&, ||, ! logical operator

        System.out.println((numberOne==numberTwo)&&(numberTwo == numberThree)); // false && false --> false
        System.out.println((numberOne<numberTwo)&&(numberTwo > numberThree)); // true && false --> false
        System.out.println((numberOne<numberTwo)&&(numberTwo < numberThree)); // true && true --> true

        System.out.println((numberOne==numberTwo)||(numberTwo == numberThree)); // false || false --> false
        System.out.println((numberOne<numberTwo)||(numberTwo > numberThree)); // true || false --> true
        System.out.println((numberOne<numberTwo)||(numberTwo < numberThree)); // true || true --> true

        System.out.println(!(numberOne==numberTwo)); // true
        System.out.println(!(numberOne>numberTwo)); // true
        System.out.println(!(numberOne<numberTwo)); // false



    }
}
