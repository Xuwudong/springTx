###�ܽ᣺
spring���������ֳ������ࣺ
1. ���ʽ�������
      + �ֶ���д��������������������ʹ�ã�demo1
2. ����ʽ�������
      + ����TransactionProxyFactoryBean�ķ�ʽ��������ʹ�ã�demo2
         - ��ҪΪÿһ���������������࣬����һ��TransactionProxyFactoryBean������ǿ
      + ����AspectJ��xml��ʽ��������ʹ�ã�demo3
         - һ�����ú�֮�����ϲ���Ҫ����κζ���
      + ����ע�ⷽʽ��������ʹ�ã�demo4
      - ���ü򵥣���Ҫ��ҵ������һ��@Transactionalע��

      
###���ݿ⽨�����
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