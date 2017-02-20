package StrategyPattern;

/**
 * Created by pingL on 2017/2/16 下午2:21.
 */
public class BackDoor implements IStrategy {


    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
