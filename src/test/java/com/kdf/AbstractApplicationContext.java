package com.kdf;

/**
 * @program: myspring
 * @author: KDF
 * @create: 2019-04-26
 **/
public abstract class AbstractApplicationContext {
    public void refresh(){
        loadBeanDefinitions();
    }
    protected void loadBeanDefinitions(){
        System.out.println("执行 子类 loadBeanDefinitions（）");
    }

}



