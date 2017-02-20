package StrategyPattern;

/**
 * Created by pingL on 2017/2/16 下午2:24.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行!");
    }
}
