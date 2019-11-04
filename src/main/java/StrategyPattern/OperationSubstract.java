package StrategyPattern;

/**
 * Created by AndrewKing on 10/22/2019.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}