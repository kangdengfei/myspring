package com.kdf;

/**
 * @program: myspring
 * @author: KDF
 * @create: 2019-04-27
 **/
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {


    public ClassPathXmlApplicationContext(){
        refresh();
    }

    protected void loadBeanDefinitions() {
        System.out.println("执行 父类 gloadBeanDefinitions（）");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
        System.out.println(classPathXmlApplicationContext instanceof ClassPathXmlApplicationContext);
        System.out.println(classPathXmlApplicationContext instanceof AbstractApplicationContext);
    }
}



