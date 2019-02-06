###总结：
spring将事务管理分成了两类：
1. 编程式事务管理
      + 手动编写代码进行事务管理。（很少使用）demo1
2. 声明式事务管理
      + 基于TransactionProxyFactoryBean的方式。（很少使用）demo2
         - 需要为每一个进行事务管理的类，配置一个TransactionProxyFactoryBean进行增强
      + 基于AspectJ的xml方式。（经常使用）demo3
         - 一旦配置好之后，类上不需要添加任何东西
      + 基于注解方式。（经常使用）demo4
      - 配置简单，需要在业务层添加一个@Transactional注解

      
###数据库建表语句
```
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `money` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
INSERT INTO `account` VALUES ('1', 'xwd', '1000');
INSERT INTO `account` VALUES ('2', 'lxt', '1000');
INSERT INTO `account` VALUES ('3', 'ccc', '1000');
```