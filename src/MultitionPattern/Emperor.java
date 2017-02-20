package MultitionPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by pingL on 2017/2/16 下午3:32.
 */
public class Emperor {
    private static int maxNumOfEmperor = 2;
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);//皇帝名字
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);// 皇帝列表
    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i< maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇"+(i+1)+ "帝"));
        }
    }

    public Emperor() {

    }

    public Emperor(String info) {
        emperorInfoList.add(info);
    }

    public synchronized static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }

}
