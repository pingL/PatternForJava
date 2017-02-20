package MultitionPattern;

/**
 * Created by pingL on 2017/2/16 下午3:33.
 */
public class Minister {

    public static void main(String[] args) {
        int ministerNum  = 10 ;

        for (int i = 0; i< ministerNum; i++) {
            Emperor emperor;
            emperor = Emperor.getInstance();
            System.out.print("第" + (i+1) + "个大臣参拜的是:");
            Emperor.emperorInfo();
        }
    }
}
