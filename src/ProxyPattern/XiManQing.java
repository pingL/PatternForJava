package ProxyPattern;

/**
 * Created by pingL on 2017/2/16 下午2:46.
 */
public class XiManQing {

    public static void main(String[] args) {
        JiaShi mJiaShi = new JiaShi();
        WangPo mWangpo = new WangPo(mJiaShi);
        mWangpo.happyWithMan();
        mWangpo.makeEyesWithMan();
    }
}
