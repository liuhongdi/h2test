DROP TABLE IF EXISTS goods;

CREATE TABLE goods (
 goodsId BIGINT(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
 goodsName varchar(500)  NOT NULL DEFAULT '' COMMENT 'name',
 subject varchar(200) NOT NULL DEFAULT '' COMMENT '标题',
 price decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '价格',
 stock int(11) NOT NULL DEFAULT '0' COMMENT 'stock',
 PRIMARY KEY (`goodsId`),
 UNIQUE KEY `goodsName` (`goodsName`)
)