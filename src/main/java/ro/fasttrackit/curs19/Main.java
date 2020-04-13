package ro.fasttrackit.curs19;

public class Main {
    public static void main(String[] args) {
        usingOperations(x -> x / 2);
        
    }

    public static void usingOperations(MyLambda myLambda) {
        System.out.println(myLambda.intOperation(6));
    }
}
