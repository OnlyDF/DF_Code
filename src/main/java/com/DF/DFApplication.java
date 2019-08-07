package com.DF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author DF
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DFApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DFApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  DF启动成功   ლ(´ڡ`ლ)ﾞ  \n" );
    }
}