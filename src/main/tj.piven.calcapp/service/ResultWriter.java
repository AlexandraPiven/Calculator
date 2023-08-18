package service;

public class ResultWriter {

    public static void printResult (int a, int b, int result, char sign, String operationName) {
        System.out.println (operationName + " " + a + sign + b + " = " + result);
    }
}
