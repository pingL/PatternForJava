package ProxyPattern;

/**
 * Created by pingL on 2017/2/16 下午2:41.
 */
public class WangPo implements KindWomen {

    private KindWomen mKindWomen;

    public WangPo (){
        this.mKindWomen = new PanJingLe();
    }

    public WangPo (KindWomen kindWomen) {
        this.mKindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.mKindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.mKindWomen.happyWithMan();
    }
}
