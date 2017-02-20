package FactoryMethodPattern;


import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * Created by pingL on 2017/2/16 下午5:29.
 */
public class HumanFactory {

    public static Human createHuman(Class c) {

        Human mHuman = null;

        try {
            mHuman = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误!");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人类找不到!");
        }

        return mHuman;
    }

    public static Human createhuman() throws IOException, ClassNotFoundException {
        Human human = null;

        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);

        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;
    }

}
