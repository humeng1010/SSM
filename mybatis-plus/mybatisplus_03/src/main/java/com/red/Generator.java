package com.red;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;

public class Generator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///spring_db");
        dataSource.setUsername("root");
        dataSource.setPassword("12345678");
        autoGenerator.setDataSource(dataSource);


        autoGenerator.execute();
    }
}
