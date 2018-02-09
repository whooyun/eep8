

import com.google.gson.Gson;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by why on 2017/6/19 0019.
 */
public class ApplicationContextTest {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ApplicationContextTest.class);

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:application-config/applicationContext.xml");
        Gson gson=new Gson();

        System.out.println("aaaa");
   /*     QmtkGoodsSearchInterface QmtkGoodsSearchInterfaceImpl = (QmtkGoodsSearchInterface) factory.getBean("qmtkGoodsSearchInterfaceImpl");
//        QmtkCategorySearchInterface QmtkCategorySearchInterfaceImpl = (QmtkCategorySearchInterface) factory.getBean("qmtkCategorySearchInterfaceImpl");
//        List<QmtkCatagoryDto> list= QmtkCategorySearchInterfaceImpl.getCategoryCount();
        QmtkCategoryDto qmtkGoods = new QmtkCategoryDto();
        qmtkGoods.setCategory(1245);
//        System.out.println(gson.toJson(QmtkGoodsSearchInterfaceImpl.getGoodsCategoryCoupon(qmtkGoods)));
//        QmtkCategorySearchInterface qmtkCategorySearchInterface= (QmtkCategorySearchInterfaceImpl)factory.getBean("qmtkCategorySearchInterfaceImpl");
//        QmtkGoodsSearchInterface qmtkGoodManagerInterface=(QmtkGoodsSearchInterface)factory.getBean("qmtkGoodsSearchInterfaceImpl");
//        System.out.print(gson.toJson(qmtkGoodManagerInterface.getGoodsPageByGoodsName("上衣",1,10)));

//        String[] beanNames = factory.getBeanDefinitionNames();
//        for (String s: beanNames ) {
//            System.out.println(s);
//        }
//        if (beanNames.length > 0) {
            Thread.sleep(1000000000);
//        }*/
    }

}
