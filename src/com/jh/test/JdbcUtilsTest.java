package com.jh.test;

import org.junit.Test;

import java.sql.Connection;

public class JdbcUtilsTest {



    @Test
    public void testJdbcUtils(){

        for(int i=0; i<100; i++){
            Connection connection = com.jh.utils.JdbcUtils.getConnection();
            System.out.println(connection);
            com.jh.utils.JdbcUtils.close(connection);

        }
    }
}
