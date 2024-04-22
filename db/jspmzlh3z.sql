-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: jspmzlh3z
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) NOT NULL COMMENT '地址',
  `name` varchar(200) NOT NULL COMMENT '收货人',
  `phone` varchar(200) NOT NULL COMMENT '电话',
  `isdefault` varchar(200) NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358547930 DEFAULT CHARSET=utf8 COMMENT='地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2024-03-10 06:29:32',1,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2024-03-10 06:29:32',2,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2024-03-10 06:29:32',3,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2024-03-10 06:29:32',4,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2024-03-10 06:29:32',5,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2024-03-10 06:29:32',6,'宇宙银河系月球1号','月某','13823888886','是'),(1615358547929,'2024-03-10 06:42:27',1615358250298,'广东省梅州市梅江区三角镇贵田坝','张三','13000000000','是');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tablename` varchar(200) DEFAULT 'siliaogoumai' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) DEFAULT NULL COMMENT '图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float DEFAULT NULL COMMENT '单价',
  `discountprice` float DEFAULT NULL COMMENT '会员价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358355679 DEFAULT CHARSET=utf8 COMMENT='购物车表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358587045 DEFAULT CHARSET=utf8 COMMENT='在线客服';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (71,'2024-03-10 06:29:32',1,1,'提问1','回复1',1),(72,'2024-03-10 06:29:32',2,2,'提问2','回复2',2),(73,'2024-03-10 06:29:32',3,3,'提问3','回复3',3),(74,'2024-03-10 06:29:32',4,4,'提问4','回复4',4),(75,'2024-03-10 06:29:32',5,5,'提问5','回复5',5),(76,'2024-03-10 06:29:32',6,6,'提问6','回复6',6),(1615358587044,'2024-03-10 06:43:06',1615358250298,NULL,'‍测试\r\n','测试\r\n',0);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chongwubaike`
--

DROP TABLE IF EXISTS `chongwubaike`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chongwubaike` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chongwumingcheng` varchar(200) DEFAULT NULL COMMENT '宠物名称',
  `xinggetedian` varchar(200) DEFAULT NULL COMMENT '性格特点',
  `chongwuleibie` varchar(200) DEFAULT NULL COMMENT '宠物类别',
  `siyangfangshi` varchar(200) DEFAULT NULL COMMENT '饲养方式',
  `chongwujianjie` varchar(200) DEFAULT NULL COMMENT '宠物简介',
  `jiagejine` varchar(200) DEFAULT NULL COMMENT '价格金额',
  `chongwutupian` varchar(200) DEFAULT NULL COMMENT '宠物图片',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358715381 DEFAULT CHARSET=utf8 COMMENT='宠物百科';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chongwubaike`
--

LOCK TABLES `chongwubaike` WRITE;
/*!40000 ALTER TABLE `chongwubaike` DISABLE KEYS */;
INSERT INTO `chongwubaike` VALUES (31,'2024-03-10 06:29:32','宠物名称1','性格特点1','宠物类别1','饲养方式1','宠物简介1','价格金额1','http://localhost:8080/jspmzlh3z/upload/chongwubaike_chongwutupian1.jpg',1,1),(32,'2024-03-10 06:29:32','宠物名称2','性格特点2','宠物类别2','饲养方式2','宠物简介2','价格金额2','http://localhost:8080/jspmzlh3z/upload/chongwubaike_chongwutupian2.jpg',3,2),(33,'2024-03-10 06:29:32','宠物名称3','性格特点3','宠物类别3','饲养方式3','宠物简介3','价格金额3','http://localhost:8080/jspmzlh3z/upload/chongwubaike_chongwutupian3.jpg',3,3),(34,'2024-03-10 06:29:32','宠物名称4','性格特点4','宠物类别4','饲养方式4','宠物简介4','价格金额4','http://localhost:8080/jspmzlh3z/upload/chongwubaike_chongwutupian4.jpg',4,4),(35,'2024-03-10 06:29:32','宠物名称5','性格特点5','宠物类别5','饲养方式5','宠物简介5','价格金额5','http://localhost:8080/jspmzlh3z/upload/chongwubaike_chongwutupian5.jpg',5,5),(36,'2024-03-10 06:29:32','宠物名称6','性格特点6','宠物类别6','饲养方式6','宠物简介6','价格金额6','http://localhost:8080/jspmzlh3z/upload/chongwubaike_chongwutupian6.jpg',6,6),(1615357852640,'2024-03-10 06:30:52','金毛','乖巧','犬类','测试','可爱','10000','http://localhost:8080/jspmzlh3z/upload/1615357850012.jpg',1,0),(1615358715380,'2024-03-10 06:45:15','英短','乖巧','猫科','测试','可爱','10000','http://localhost:8080/jspmzlh3z/upload/1615358713172.jpg',0,0);
/*!40000 ALTER TABLE `chongwubaike` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chongwufuwujigou`
--

DROP TABLE IF EXISTS `chongwufuwujigou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chongwufuwujigou` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jigoumingcheng` varchar(200) DEFAULT NULL COMMENT '机构名称',
  `jigouleibie` varchar(200) DEFAULT NULL COMMENT '机构类别',
  `jigoujianjie` varchar(200) DEFAULT NULL COMMENT '机构简介',
  `suozaididian` varchar(200) DEFAULT NULL COMMENT '所在地点',
  `pingjunxiaofei` varchar(200) DEFAULT NULL COMMENT '平均消费',
  `jigouzhaopian` varchar(200) DEFAULT NULL COMMENT '机构照片',
  `jigouxiangqing` longtext COMMENT '机构详情',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358822503 DEFAULT CHARSET=utf8 COMMENT='宠物服务机构';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chongwufuwujigou`
--

LOCK TABLES `chongwufuwujigou` WRITE;
/*!40000 ALTER TABLE `chongwufuwujigou` DISABLE KEYS */;
INSERT INTO `chongwufuwujigou` VALUES (51,'2024-03-10 06:29:32','机构名称1','宠物店','机构简介1','所在地点1','平均消费1','http://localhost:8080/jspmzlh3z/upload/chongwufuwujigou_jigouzhaopian1.jpg','机构详情1',1,1),(52,'2024-03-10 06:29:32','机构名称2','宠物店','机构简介2','所在地点2','平均消费2','http://localhost:8080/jspmzlh3z/upload/chongwufuwujigou_jigouzhaopian2.jpg','机构详情2',2,2),(53,'2024-03-10 06:29:32','机构名称3','宠物店','机构简介3','所在地点3','平均消费3','http://localhost:8080/jspmzlh3z/upload/chongwufuwujigou_jigouzhaopian3.jpg','机构详情3',3,3),(54,'2024-03-10 06:29:32','机构名称4','宠物店','机构简介4','所在地点4','平均消费4','http://localhost:8080/jspmzlh3z/upload/chongwufuwujigou_jigouzhaopian4.jpg','机构详情4',4,4),(55,'2024-03-10 06:29:32','机构名称5','宠物店','机构简介5','所在地点5','平均消费5','http://localhost:8080/jspmzlh3z/upload/chongwufuwujigou_jigouzhaopian5.jpg','机构详情5',5,5),(56,'2024-03-10 06:29:32','机构名称6','宠物店','机构简介6','所在地点6','平均消费6','http://localhost:8080/jspmzlh3z/upload/chongwufuwujigou_jigouzhaopian6.jpg','机构详情6',6,6),(1615358192028,'2024-03-10 06:36:31','嘉应宠物店','宠物店','卖宠物','广州','500','http://localhost:8080/jspmzlh3z/upload/1615358160969.png','可添加文字\\图片<img src=\"http://localhost:8080/jspmzlh3z/upload/1615358189601.png\" width=\"900\" height=\"560\" _src=\"http://localhost:8080/jspmzlh3z/upload/1615358189601.png\">\r\n',1,1),(1615358822502,'2024-03-10 06:47:01','嘉应宠物医院','宠物医院','提供治疗服务','广州','100','http://localhost:8080/jspmzlh3z/upload/1615358807916.png','可添加文字图片<img src=\"http://localhost:8080/jspmzlh3z/upload/1615358819715.png\" width=\"900\" height=\"560\" _src=\"http://localhost:8080/jspmzlh3z/upload/1615358819715.png\">\r\n',0,0);
/*!40000 ALTER TABLE `chongwufuwujigou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chongwuleibie`
--

DROP TABLE IF EXISTS `chongwuleibie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chongwuleibie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `leibie` varchar(200) DEFAULT NULL COMMENT '类别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358658210 DEFAULT CHARSET=utf8 COMMENT='宠物类别';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chongwuleibie`
--

LOCK TABLES `chongwuleibie` WRITE;
/*!40000 ALTER TABLE `chongwuleibie` DISABLE KEYS */;
INSERT INTO `chongwuleibie` VALUES (21,'2024-03-10 06:29:32','蛇类'),(22,'2024-03-10 06:29:32','类别2'),(23,'2024-03-10 06:29:32','类别3'),(24,'2024-03-10 06:29:32','类别4'),(25,'2024-03-10 06:29:32','类别5'),(26,'2024-03-10 06:29:32','类别6'),(1615357816318,'2024-03-10 06:30:15','犬类'),(1615358658209,'2024-03-10 06:44:17','猫科');
/*!40000 ALTER TABLE `chongwuleibie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/jspmzlh3z/upload/1615358912618.jpg'),(2,'picture2','http://localhost:8080/jspmzlh3z/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/jspmzlh3z/upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `defaultuser`
--

DROP TABLE IF EXISTS `defaultuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `defaultuser` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `username` varchar(200) NOT NULL COMMENT '用户名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `name` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(200) DEFAULT NULL COMMENT '性别',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `phone` varchar(200) DEFAULT NULL COMMENT '电话',
  `picture` varchar(200) DEFAULT NULL COMMENT '照片',
  `email` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `money` float DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='注册用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `defaultuser`
--

LOCK TABLES `defaultuser` WRITE;
/*!40000 ALTER TABLE `defaultuser` DISABLE KEYS */;
INSERT INTO `defaultuser` VALUES (91,'2024-03-10 06:29:32','用户名1','123456','姓名1','男',1,'020-89819991','http://localhost:8080/jspmzlh3z/upload/defaultuser_picture1.jpg','773890001@qq.com',100),(92,'2024-03-10 06:29:32','用户名2','123456','姓名2','男',2,'020-89819992','http://localhost:8080/jspmzlh3z/upload/defaultuser_picture2.jpg','773890002@qq.com',100),(93,'2024-03-10 06:29:32','用户名3','123456','姓名3','男',3,'020-89819993','http://localhost:8080/jspmzlh3z/upload/defaultuser_picture3.jpg','773890003@qq.com',100),(94,'2024-03-10 06:29:32','用户名4','123456','姓名4','男',4,'020-89819994','http://localhost:8080/jspmzlh3z/upload/defaultuser_picture4.jpg','773890004@qq.com',100),(95,'2024-03-10 06:29:32','用户名5','123456','姓名5','男',5,'020-89819995','http://localhost:8080/jspmzlh3z/upload/defaultuser_picture5.jpg','773890005@qq.com',100),(96,'2024-03-10 06:29:32','用户名6','123456','姓名6','男',6,'020-89819996','http://localhost:8080/jspmzlh3z/upload/defaultuser_picture6.jpg','773890006@qq.com',100);
/*!40000 ALTER TABLE `defaultuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusschongwubaike`
--

DROP TABLE IF EXISTS `discusschongwubaike`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusschongwubaike` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358297831 DEFAULT CHARSET=utf8 COMMENT='宠物百科评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusschongwubaike`
--

LOCK TABLES `discusschongwubaike` WRITE;
/*!40000 ALTER TABLE `discusschongwubaike` DISABLE KEYS */;
INSERT INTO `discusschongwubaike` VALUES (151,'2024-03-10 06:29:32',1,1,'用户名1','评论内容1','回复内容1'),(152,'2024-03-10 06:29:32',2,2,'用户名2','评论内容2','回复内容2'),(153,'2024-03-10 06:29:32',3,3,'用户名3','评论内容3','回复内容3'),(154,'2024-03-10 06:29:32',4,4,'用户名4','评论内容4','回复内容4'),(155,'2024-03-10 06:29:32',5,5,'用户名5','评论内容5','回复内容5'),(156,'2024-03-10 06:29:32',6,6,'用户名6','评论内容6','回复内容6'),(1615358297830,'2024-03-10 06:38:17',32,1615358250298,NULL,'测试',NULL);
/*!40000 ALTER TABLE `discusschongwubaike` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusschongwufuwujigou`
--

DROP TABLE IF EXISTS `discusschongwufuwujigou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusschongwufuwujigou` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358371838 DEFAULT CHARSET=utf8 COMMENT='宠物服务机构评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusschongwufuwujigou`
--

LOCK TABLES `discusschongwufuwujigou` WRITE;
/*!40000 ALTER TABLE `discusschongwufuwujigou` DISABLE KEYS */;
INSERT INTO `discusschongwufuwujigou` VALUES (171,'2024-03-10 06:29:32',1,1,'用户名1','评论内容1','回复内容1'),(172,'2024-03-10 06:29:32',2,2,'用户名2','评论内容2','回复内容2'),(173,'2024-03-10 06:29:32',3,3,'用户名3','评论内容3','回复内容3'),(174,'2024-03-10 06:29:32',4,4,'用户名4','评论内容4','回复内容4'),(175,'2024-03-10 06:29:32',5,5,'用户名5','评论内容5','回复内容5'),(176,'2024-03-10 06:29:32',6,6,'用户名6','评论内容6','回复内容6'),(1615358371837,'2024-03-10 06:39:31',1615358192028,1615358250298,NULL,'测试',NULL);
/*!40000 ALTER TABLE `discusschongwufuwujigou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusssiliaogoumai`
--

DROP TABLE IF EXISTS `discusssiliaogoumai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusssiliaogoumai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358346074 DEFAULT CHARSET=utf8 COMMENT='饲料购买评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusssiliaogoumai`
--

LOCK TABLES `discusssiliaogoumai` WRITE;
/*!40000 ALTER TABLE `discusssiliaogoumai` DISABLE KEYS */;
INSERT INTO `discusssiliaogoumai` VALUES (161,'2024-03-10 06:29:32',1,1,'用户名1','评论内容1','回复内容1'),(162,'2024-03-10 06:29:32',2,2,'用户名2','评论内容2','回复内容2'),(163,'2024-03-10 06:29:32',3,3,'用户名3','评论内容3','回复内容3'),(164,'2024-03-10 06:29:32',4,4,'用户名4','评论内容4','回复内容4'),(165,'2024-03-10 06:29:32',5,5,'用户名5','评论内容5','回复内容5'),(166,'2024-03-10 06:29:32',6,6,'用户名6','评论内容6','回复内容6'),(1615358346073,'2024-03-10 06:39:05',1615357997783,1615358250298,NULL,'测试',NULL);
/*!40000 ALTER TABLE `discusssiliaogoumai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358443346 DEFAULT CHARSET=utf8 COMMENT='宠物论坛';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (81,'2024-03-10 06:29:32','帖子标题1','帖子内容1',1,1,'用户名1','开放'),(82,'2024-03-10 06:29:32','帖子标题2','帖子内容2',2,2,'用户名2','开放'),(83,'2024-03-10 06:29:32','帖子标题3','帖子内容3',3,3,'用户名3','开放'),(84,'2024-03-10 06:29:32','帖子标题4','帖子内容4',4,4,'用户名4','开放'),(85,'2024-03-10 06:29:32','帖子标题5','帖子内容5',5,5,'用户名5','开放'),(86,'2024-03-10 06:29:32','帖子标题6','帖子内容6',6,6,'用户名6','开放'),(1615358429381,'2024-03-10 06:40:29','测试','<p>可输入文字图片</p>\n<p><img src=\"../../..//upload/1615358424302.jpg\" alt=\"\" width=\"452\" height=\"290\" /></p>',0,1615358250298,'123','开放'),(1615358443345,'2024-03-10 06:40:42',NULL,'测试',1615358429381,1615358250298,'123',NULL);
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358944136 DEFAULT CHARSET=utf8 COMMENT='宠物资讯';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (142,'2024-03-10 06:29:32','标题2','简介2','http://localhost:8080/jspmzlh3z/upload/news_picture2.jpg','内容2'),(143,'2024-03-10 06:29:32','标题3','简介3','http://localhost:8080/jspmzlh3z/upload/news_picture3.jpg','内容3'),(144,'2024-03-10 06:29:32','标题4','简介4','http://localhost:8080/jspmzlh3z/upload/news_picture4.jpg','内容4'),(145,'2024-03-10 06:29:32','标题5','简介5','http://localhost:8080/jspmzlh3z/upload/news_picture5.jpg','内容5'),(146,'2024-03-10 06:29:32','标题6','简介6','http://localhost:8080/jspmzlh3z/upload/news_picture6.jpg','内容6'),(1615358944135,'2024-03-10 06:49:03','活动','测试','http://localhost:8080/jspmzlh3z/upload/1615358933373.jpg','可添加文字图片<img src=\"http://localhost:8080/jspmzlh3z/upload/1615358942121.jpg\" width=\"900\" height=\"560\" _src=\"http://localhost:8080/jspmzlh3z/upload/1615358942121.jpg\">\r\n');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orderid` varchar(200) NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) DEFAULT 'siliaogoumai' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) DEFAULT NULL COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float NOT NULL DEFAULT '0' COMMENT '价格/积分',
  `discountprice` float DEFAULT '0' COMMENT '折扣价格',
  `total` float NOT NULL DEFAULT '0' COMMENT '总价格/总积分',
  `discounttotal` float DEFAULT '0' COMMENT '折扣总价格',
  `type` int(11) DEFAULT '1' COMMENT '支付类型',
  `status` varchar(200) DEFAULT NULL COMMENT '状态',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358571822 DEFAULT CHARSET=utf8 COMMENT='订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1615358571821,'2024-03-10 06:42:50','202431014425294205541','siliaogoumai',1615358250298,1615357997783,'狗粮','http://localhost:8080/jspmzlh3z/upload/1615357942662.jpg',5,100,100,500,500,1,'已完成','广东省梅州市梅江区三角镇贵田坝');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `siliaogoumai`
--

DROP TABLE IF EXISTS `siliaogoumai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `siliaogoumai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `siliaomingcheng` varchar(200) DEFAULT NULL COMMENT '饲料名称',
  `shiyongchongwu` varchar(200) DEFAULT NULL COMMENT '使用宠物',
  `siliaozhonglei` varchar(200) DEFAULT NULL COMMENT '饲料种类',
  `pinpaishangjia` varchar(200) DEFAULT NULL COMMENT '品牌商家',
  `siliaozhiliang` varchar(200) DEFAULT NULL COMMENT '饲料质量',
  `siliaopeiliao` varchar(200) DEFAULT NULL COMMENT '饲料配料',
  `siliaotupian` varchar(200) DEFAULT NULL COMMENT '饲料图片',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `price` float NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615357997784 DEFAULT CHARSET=utf8 COMMENT='饲料购买';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `siliaogoumai`
--

LOCK TABLES `siliaogoumai` WRITE;
/*!40000 ALTER TABLE `siliaogoumai` DISABLE KEYS */;
INSERT INTO `siliaogoumai` VALUES (41,'2024-03-10 06:29:32','饲料名称1','使用宠物1','种类5','品牌商家1','饲料质量1','饲料配料1','http://localhost:8080/jspmzlh3z/upload/siliaogoumai_siliaotupian1.jpg',1,1,99.9),(42,'2024-03-10 06:29:32','饲料名称2','使用宠物2','饲料种类2','品牌商家2','饲料质量2','饲料配料2','http://localhost:8080/jspmzlh3z/upload/siliaogoumai_siliaotupian2.jpg',2,2,99.9),(43,'2024-03-10 06:29:32','饲料名称3','使用宠物3','饲料种类3','品牌商家3','饲料质量3','饲料配料3','http://localhost:8080/jspmzlh3z/upload/siliaogoumai_siliaotupian3.jpg',3,3,99.9),(44,'2024-03-10 06:29:32','饲料名称4','使用宠物4','饲料种类4','品牌商家4','饲料质量4','饲料配料4','http://localhost:8080/jspmzlh3z/upload/siliaogoumai_siliaotupian4.jpg',4,4,99.9),(45,'2024-03-10 06:29:32','饲料名称5','使用宠物5','饲料种类5','品牌商家5','饲料质量5','饲料配料5','http://localhost:8080/jspmzlh3z/upload/siliaogoumai_siliaotupian5.jpg',5,5,99.9),(46,'2024-03-10 06:29:32','饲料名称6','使用宠物6','饲料种类6','品牌商家6','饲料质量6','饲料配料6','http://localhost:8080/jspmzlh3z/upload/siliaogoumai_siliaotupian6.jpg',6,6,99.9),(1615357997783,'2024-03-10 06:33:17','狗粮','金毛','蔬菜','华思','100g','包菜','http://localhost:8080/jspmzlh3z/upload/1615357942662.jpg',1,1,100);
/*!40000 ALTER TABLE `siliaogoumai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `siliaozhonglei`
--

DROP TABLE IF EXISTS `siliaozhonglei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `siliaozhonglei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhonglei` varchar(200) DEFAULT NULL COMMENT '种类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358840762 DEFAULT CHARSET=utf8 COMMENT='饲料种类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `siliaozhonglei`
--

LOCK TABLES `siliaozhonglei` WRITE;
/*!40000 ALTER TABLE `siliaozhonglei` DISABLE KEYS */;
INSERT INTO `siliaozhonglei` VALUES (61,'2024-03-10 06:29:32','种类1'),(62,'2024-03-10 06:29:32','种类2'),(63,'2024-03-10 06:29:32','种类3'),(64,'2024-03-10 06:29:32','种类4'),(65,'2024-03-10 06:29:32','种类5'),(66,'2024-03-10 06:29:32','种类6'),(1615358007536,'2024-03-10 06:33:27','蔬菜'),(1615358840761,'2024-03-10 06:47:20','猫粮');
/*!40000 ALTER TABLE `siliaozhonglei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358378537 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1615358290773,'2024-03-10 06:38:09',1615358250298,32,'chongwubaike','宠物名称2','http://localhost:8080/jspmzlh3z/upload/chongwubaike_chongwutupian2.jpg'),(1615358324766,'2024-03-10 06:38:44',1615358250298,1615357852640,'chongwubaike','金毛','http://localhost:8080/jspmzlh3z/upload/1615357850012.jpg'),(1615358339885,'2024-03-10 06:38:59',1615358250298,1615357997783,'siliaogoumai','狗粮','http://localhost:8080/jspmzlh3z/upload/1615357942662.jpg'),(1615358378536,'2024-03-10 06:39:37',1615358250298,1615358192028,'chongwufuwujigou','嘉应宠物店','http://localhost:8080/jspmzlh3z/upload/1615358160969.png');
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','v2yej50a6374jrps2vyusiko6w2ltkto','2024-03-10 06:29:57','2024-03-10 07:43:53'),(2,1615358250298,'123','yonghu','用户','72bk2qynqjnwx8dzze8iroulh5o9ir0g','2024-03-10 06:37:40','2024-03-10 07:37:41');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2024-03-10 06:29:32');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `chongwushangciyimiaoriqi` datetime DEFAULT NULL COMMENT '宠物上次疫苗日期',
  `chongwuleibie` varchar(200) DEFAULT NULL COMMENT '宠物类别',
  `chongwuxingbie` varchar(200) DEFAULT NULL COMMENT '宠物性别',
  `money` float DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1615358250299 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2024-03-10 06:29:32','用户1','123456','姓名1','男','13823888881','773890001@qq.com','440300199101010001','http://localhost:8080/jspmzlh3z/upload/yonghu_touxiang1.jpg','2024-03-10 14:29:32','宠物类别1','雌',100),(12,'2024-03-10 06:29:32','用户2','123456','姓名2','男','13823888882','773890002@qq.com','440300199202020002','http://localhost:8080/jspmzlh3z/upload/yonghu_touxiang2.jpg','2024-03-10 14:29:32','宠物类别2','雌',100),(13,'2024-03-10 06:29:32','用户3','123456','姓名3','男','13823888883','773890003@qq.com','440300199303030003','http://localhost:8080/jspmzlh3z/upload/yonghu_touxiang3.jpg','2024-03-10 14:29:32','宠物类别3','雌',100),(14,'2024-03-10 06:29:32','用户4','123456','姓名4','男','13823888884','773890004@qq.com','440300199404040004','http://localhost:8080/jspmzlh3z/upload/yonghu_touxiang4.jpg','2024-03-10 14:29:32','宠物类别4','雌',100),(15,'2024-03-10 06:29:32','用户5','123456','姓名5','男','13823888885','773890005@qq.com','440300199505050005','http://localhost:8080/jspmzlh3z/upload/yonghu_touxiang5.jpg','2024-03-10 14:29:32','宠物类别5','雌',100),(16,'2024-03-10 06:29:32','用户6','123456','姓名6','男','13823888886','773890006@qq.com','440300199606060006','http://localhost:8080/jspmzlh3z/upload/yonghu_touxiang6.jpg','2024-03-10 14:29:32','宠物类别6','雌',100),(1615358250298,'2024-03-10 06:37:30','123','123','张三','男','13000000000','123@qq.com','441400000000000000','http://localhost:8080/jspmzlh3z/upload/1615358607759.jpg','2024-03-25 13:34:25','犬类','雄',9499);
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-11 15:42:30
