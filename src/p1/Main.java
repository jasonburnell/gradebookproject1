package p1;

import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args){

double[] testsone= {80, 85, 90};
double totalone= (80 + 85 +90);
testsone[0] = 80;
testsone[1] = 85;
testsone[2] = 90;

double averageone = totalone / 3;
        System.out.println("Joe scored an average of " + averageone);
double[] teststwo = {81,86,91};
double totaltwo = (81 + 86 + 91);
teststwo[0] = 81;
teststwo[1] = 86;
teststwo[2] = 91;

double averagetwo = totaltwo / 3;
        System.out.println("John scored an average of " + averagetwo);
}
}