package com.jh.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class WebUtils {
    public static <T> T copyParamToBean(Map value, T bean){
        try {
            System.out.println("注入前："+bean);
            BeanUtils.populate(bean,value);
            System.out.println("注入后："+bean);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return bean;
    }
}
