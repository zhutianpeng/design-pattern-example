package StrategyPattern;

/**
 * Created by AndrewKing on 10/22/2019.
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}