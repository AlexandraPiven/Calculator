package _main;

import service.ResultWriter;
import util.Calculator;

public class _Main {
    public static void main (String [] args){
        int a = 7;
        int b = 5;
        char sign = '+';
        char sign1 = '-';
        char sign2 = '*';
        int result = Calculator.sum(a,b);
        int result1 = Calculator.subtract(a,b);
        int result2 = Calculator.multiply(a,b);
        ResultWriter.printResult (a, b, result, sign, "Сумма");
        ResultWriter.printResult(a,b,result1, sign1, "Разность");
        ResultWriter.printResult(a,b,result2,sign2, "Произведение");


    }

}
