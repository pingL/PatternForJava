package SingletonPattern;

/**
 * Created by pingL on 2017/2/16 下午2:59.
 * 通用单例模式
 *
 */
public class Emperor {


    //定义一个私有构造方法
    private Emperor() {

    }

    //
    private static volatile Emperor emperor;


    //定义一个公有静态方法，返回该类型实例
    public static Emperor getInstance() {
        // 对象实例化与否判断，不等以null。直接返回对象，提高运行效率
        if (emperor == null) {
            // 同步代码块
            synchronized (Emperor.class){
                // 未初始化时，则初始化emperor变量
                if (emperor == null) {
                    emperor = new Emperor();
                }
            }
        }
        return emperor;
    }

    // 构造静态方法
    public static void emperorInfo() {


        System.out.println("我就是皇帝某某某....");

    }
}
