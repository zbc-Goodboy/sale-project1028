drop DATABASE if EXISTS saledb;
CREATE DATABASE saledb;
DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product`(
 `id` BIGINT(50) PRIMARY KEY AUTO_INCREMENT COMMENT'商品Id',
 `productName` VARCHAR(20) NOT NULL COMMENT'商品名称',
 `quantity` INT(20) NOT NULL COMMENT'库存量'
);
drop TABLE if EXISTS `sale`;
CREATE TABLE `sale`(
 `id` BIGINT(50) PRIMARY KEY AUTO_INCREMENT COMMENT'记录',
 `price` DOUBLE(4,2) NOT NULL COMMENT '销售单价',
 `quantity` INT(20) NOT NULL COMMENT '数量',
 `totalPrice` DOUBLE(7,2) NOT NULL COMMENT '总价',
 `saleDate` DATETIME NOT NULL COMMENT '销售日期',
 `productId` BIGINT(50) NOT NULL COMMENT '商品Id'
);
INSERT into `product` values(null,'可口可乐',2500),(null,'雪碧',1200),(null,'芬达',4000),(null,'七喜',1430),(null,'橙汁',3240);
INSERT into `sale` values(null,3,30,90,'2020-10-20',1),(null,4,50,200,'2020-10-19',2),(null,6,90,540,'2020-10-18',3),(null,3,500,1500,'2020-11-21',4),(null,3,160,480,'2020-10-30',5),(null,3,90,360,'2020-10-12',5),(null,3,80,240,'2020-10-14',1),(null,3,80,240,'2020-10-03',1),(null,6,60,360,'2020-10-10',3);

GRANT all on saledb.* to zbc@localhost IDENTIFIED by '123456';

