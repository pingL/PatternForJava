package FactoryMethodPattern;

import java.io.IOException;

/**
 * Created by pingL on 2017/2/16 下午6:04.
 */
public class NvWa  {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.talk();
        blackHuman.laugh();
        blackHuman.cry();

        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();


        for (int i = 0; i< 10000000; i++ ) {
            System.out.println("\n\n\n ---------随机产生人类-------" + i );

            Human human = HumanFactory.createhuman();
            human.cry();
            human.talk();
            human.laugh();

        }
    }
}
