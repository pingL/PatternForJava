package StrategyPattern;

/**
 * Created by pingL on 2017/2/16 下午2:24.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
