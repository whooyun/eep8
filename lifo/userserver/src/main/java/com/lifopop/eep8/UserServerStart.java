package com.lifopop.eep8;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author why
 * @date 2018/2/6 0006
 */
public class UserServerStart {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserServerStart.class);

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:application-config/applicationContext.xml");
        // QmtkCategorySearchInterface service = (QmtkCategorySearchInterface) factory.getBean("qmtkCategorySearchInterfaceImpl");
        String[] beanNames = factory.getBeanDefinitionNames();
        if (beanNames.length > 0) {
            Thread.currentThread().join();
        }
    }
}
