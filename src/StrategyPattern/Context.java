package StrategyPattern;

/**
 * Created by pingL on 2017/2/16 下午2:25.
 */
public class Context {

    private IStrategy mIStrategy;

    public Context(IStrategy iStrategy) {

        this.mIStrategy = iStrategy;

    }

    public void operate() {
       this.mIStrategy.operate();
    }
}
