-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: dbtest
-- ------------------------------------------------------
-- Server version	5.7.20

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
-- Table structure for table `t_address`
--

DROP TABLE IF EXISTS `t_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_address` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `user_tel` varchar(45) NOT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_address`
--

LOCK TABLES `t_address` WRITE;
/*!40000 ALTER TABLE `t_address` DISABLE KEYS */;
INSERT INTO `t_address` VALUES (101,1213801,'王杰','仙林大道163号南京大学仙林校区电子楼136','17865197657'),(104,1213801,'jaggerW','南大仙林校区学生宿舍23幢','17865197657'),(105,564050,'王','仙林大道163号南京大学仙林校区内','17865197657');
/*!40000 ALTER TABLE `t_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_category`
--

DROP TABLE IF EXISTS `t_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(45) NOT NULL,
  `t_store_store_id` int(11) NOT NULL,
  PRIMARY KEY (`category_id`),
  KEY `fk_t_category_t_store_idx` (`t_store_store_id`),
  CONSTRAINT `fk_t_category_t_store` FOREIGN KEY (`t_store_store_id`) REFERENCES `t_store` (`store_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_category`
--

LOCK TABLES `t_category` WRITE;
/*!40000 ALTER TABLE `t_category` DISABLE KEYS */;
INSERT INTO `t_category` VALUES (1,'热销',101),(2,'主食',101),(3,'饮品',101),(4,'热销',102),(5,'菜品',102),(6,'饮品',102),(7,'热销',103),(8,'炒菜',103),(9,'主食',103),(10,'饮品',103),(11,'热销',104),(12,'水饺',104),(13,'其他',104);
/*!40000 ALTER TABLE `t_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_comment`
--

DROP TABLE IF EXISTS `t_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_id` int(11) NOT NULL,
  `store_name` varchar(45) NOT NULL,
  `goods_name` varchar(45) NOT NULL,
  `comments` varchar(200) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `commit_time` varchar(45) NOT NULL,
  `user_image` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_comment`
--

LOCK TABLES `t_comment` WRITE;
/*!40000 ALTER TABLE `t_comment` DISABLE KEYS */;
INSERT INTO `t_comment` VALUES (1,102,'金川娃麻辣烫','川味麻辣烫套餐A','哈哈哈！好吃！特别棒！够味！',1213801,'王先生','2018-04-03 07:57:02 +0000',NULL),(2,101,'正新鸡排','孜然味鸡排番茄味鸡排','孜然味鸡排超级好吃！！！肌肉特别嫩，非常棒！',1213801,'王先生','2018-04-08 08:27:13 +0000',NULL),(3,101,'正新鸡排','香辣鸡腿堡奥尔良鸡腿堡','奥尔良鸡腿堡超级好吃！喜欢这家的汉堡，百吃不腻，疯狂安利奥尔良鸡腿堡！！！',1213801,'王先生','2018-04-08 08:28:38 +0000',NULL),(4,101,'正新鸡排','+孜然味鸡排+奥尔良鸡腿堡+香蕉牛奶','好吃好吃好吃！！！非常棒！',564050,'王小杰121380','2018-04-11 02:53:05 +0000',NULL),(5,101,'正新鸡排','+孜然味鸡排+番茄味鸡排','好吃好吃！！！：）',1213801,'王先生','2018-04-20 05:13:22 +0000',NULL);
/*!40000 ALTER TABLE `t_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_goods`
--

DROP TABLE IF EXISTS `t_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_goods` (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_category` varchar(45) NOT NULL,
  `goods_name` varchar(45) NOT NULL,
  `goods_price` float NOT NULL,
  `goods_sales_amount` int(11) DEFAULT NULL,
  `goods_image` varchar(45) DEFAULT NULL,
  `t_store_store_id` int(11) NOT NULL,
  `t_category_category_id` int(11) NOT NULL,
  PRIMARY KEY (`goods_id`),
  KEY `fk_t_goods_t_store_idx` (`t_store_store_id`),
  KEY `fk_t_goods_t_category_idx` (`t_category_category_id`),
  CONSTRAINT `fk_t_store` FOREIGN KEY (`t_store_store_id`) REFERENCES `t_store` (`store_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_goods`
--

LOCK TABLES `t_goods` WRITE;
/*!40000 ALTER TABLE `t_goods` DISABLE KEYS */;
INSERT INTO `t_goods` VALUES (1,'热销','孜然味鸡排',15,555,NULL,101,1),(2,'热销','番茄味鸡排',15,467,NULL,101,1),(3,'主食','香辣味鸡排',15,356,NULL,101,2),(4,'主食','香辣鸡腿堡',10,199,NULL,101,2),(5,'主食','奥尔良鸡腿堡',12,199,NULL,101,2),(6,'主食','鳕鱼堡',12,101,NULL,101,2),(7,'主食','墨西哥鸡肉卷',10,99,NULL,101,2),(8,'饮品','可乐',5,999,NULL,101,3),(9,'饮品','雪碧',5,395,NULL,101,3),(10,'饮品','香蕉牛奶',9,99,NULL,101,3),(11,'热销','川味麻辣烫套餐A',20,256,NULL,102,4),(12,'热销','川味麻辣烫套餐B',28,489,NULL,102,4),(13,'菜品','土豆片',4,100,NULL,102,5),(14,'菜品','甜不辣',5,297,NULL,102,5),(15,'菜品','培根',5,234,NULL,102,5),(16,'菜品','小油菜',3,555,NULL,102,5),(17,'饮品','可乐',4,356,NULL,102,6),(18,'饮品','雪碧',4,234,NULL,102,6),(19,'热销','营养午餐',25,899,NULL,103,7),(20,'热销','营养晚餐',19.9,999,NULL,103,7),(21,'炒菜','风味茄子',20,153,NULL,103,8),(22,'炒菜','糖醋排骨',35,99,NULL,103,8),(23,'炒菜','爆炒腰花',48,101,NULL,103,8),(24,'炒菜','干锅千叶豆腐',28,58,NULL,103,8),(25,'主食','米饭',2,999,NULL,103,9),(26,'主食','馒头',0.5,23,NULL,103,9),(27,'饮品','青岛啤酒',6,222,NULL,103,10),(28,'饮品','江小白',35,56,NULL,103,10),(29,'热销','三鲜水饺',28,320,NULL,104,11),(30,'热销','猪肉白菜水饺',18,234,NULL,104,11),(31,'水饺','鲅鱼水饺',25,45,NULL,104,12),(32,'水饺','芹菜猪肉水饺',22,46,NULL,104,12),(33,'水饺','羊肉水饺',30,67,NULL,104,12),(34,'水饺','肉三鲜水饺',28,101,NULL,104,12),(35,'其他','辣椒油',0.5,399,NULL,104,13),(36,'其他','醋',0.5,452,NULL,104,13);
/*!40000 ALTER TABLE `t_goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_order`
--

DROP TABLE IF EXISTS `t_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_order` (
  `order_id` varchar(45) NOT NULL,
  `order_status` int(11) NOT NULL,
  `store_id` int(11) NOT NULL,
  `store_name` varchar(45) NOT NULL,
  `order_time` varchar(45) NOT NULL,
  `arrive_time` varchar(45) DEFAULT NULL,
  `address` varchar(45) NOT NULL,
  `delivery_side` varchar(45) NOT NULL,
  `pay_way` varchar(45) NOT NULL,
  `delivery_cost` float NOT NULL,
  `preferential_price` float NOT NULL,
  `pay_cost` float NOT NULL,
  `user_id` int(11) NOT NULL,
  `comment_flag` int(11) NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_order`
--

LOCK TABLES `t_order` WRITE;
/*!40000 ALTER TABLE `t_order` DISABLE KEYS */;
INSERT INTO `t_order` VALUES ('1522137391102',1,102,'金川娃麻辣烫','2018-03-27 07:56:31 +0000','2018-03-27 08:51:37 +0000','默认地址','商家配送','支付宝',3,0,23,1213801,1),('1522417834101',1,101,'正新鸡排','2018-03-30 13:50:34 +0000','2018-03-30 14:18:48 +0000','南京大学仙林校区电子楼136室\n王先生	17865197657','商家配送','支付宝',2.5,0,24.5,1213801,1),('1522745143101',1,101,'正新鸡排','2018-04-03 08:45:43 +0000','2018-04-03 09:08:09 +0000','南大仙林校区学生宿舍23幢\njaggerW	17865197657','商家配送','支付宝',2.5,0,47.5,1213801,1),('1522749224102',1,102,'金川娃麻辣烫','2018-04-03 09:53:44 +0000','2018-04-03 09:53:56 +0000','南大仙林校区学生宿舍23幢\njaggerW	17865197657','商家配送','支付宝',3,0,31,1213801,0),('1523415146101',1,101,'正新鸡排','2018-04-11 02:52:26 +0000','2018-04-11 02:52:48 +0000','仙林大道163号南京大学仙林校区内\n王	17865197657','商家配送','支付宝',2.5,0,38.5,564050,1),('1525781768101',1,101,'正新鸡排','2018-05-08 12:16:08 +0000','2018-05-08 12:16:32 +0000','南大仙林校区学生宿舍23幢\njaggerW	17865197657','商家配送','支付宝',2.5,0,37.5,1213801,0),('1525827385101',1,101,'正新鸡排','2018-05-09 00:56:25 +0000','2018-05-09 00:56:50 +0000','仙林大道163号南京大学仙林校区电子楼136\n王杰	17865197657','商家配送','支付宝',2.5,0,41.5,1213801,0),('1525827764101',1,101,'正新鸡排','2018-05-09 01:02:44 +0000','2018-05-09 01:03:09 +0000','仙林大道163号南京大学仙林校区电子楼136\n王杰	17865197657','商家配送','支付宝',2.5,0,46.5,1213801,0);
/*!40000 ALTER TABLE `t_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_order_goods`
--

DROP TABLE IF EXISTS `t_order_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_order_goods` (
  `order_goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(45) NOT NULL,
  `goods_count` int(11) DEFAULT NULL,
  `goods_price` varchar(45) NOT NULL,
  `goods_image` varchar(45) DEFAULT NULL,
  `order_id` varchar(45) NOT NULL,
  PRIMARY KEY (`order_goods_id`),
  KEY `fk_t_order_goods_idx` (`order_id`),
  CONSTRAINT `fk_t_order_goods` FOREIGN KEY (`order_id`) REFERENCES `t_order` (`order_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_order_goods`
--

LOCK TABLES `t_order_goods` WRITE;
/*!40000 ALTER TABLE `t_order_goods` DISABLE KEYS */;
INSERT INTO `t_order_goods` VALUES (34,'川味麻辣烫套餐A',1,'20','','1522137391102'),(41,'香辣鸡腿堡',1,'10','','1522417834101'),(42,'奥尔良鸡腿堡',1,'12','','1522417834101'),(47,'孜然味鸡排',2,'15','','1522745143101'),(48,'番茄味鸡排',1,'15','','1522745143101'),(49,'川味麻辣烫套餐B',1,'28','','1522749224102'),(50,'孜然味鸡排',1,'15','','1523415146101'),(51,'奥尔良鸡腿堡',1,'12','','1523415146101'),(52,'香蕉牛奶',1,'9','','1523415146101'),(56,'孜然味鸡排',1,'15','','1525781768101'),(57,'番茄味鸡排',1,'15','','1525781768101'),(58,'可乐',1,'5','','1525781768101'),(59,'孜然味鸡排',1,'15','','1525827385101'),(60,'番茄味鸡排',1,'15','','1525827385101'),(61,'香蕉牛奶',1,'9','','1525827385101'),(62,'香辣味鸡排',1,'15','','1525827764101'),(63,'奥尔良鸡腿堡',2,'12','','1525827764101'),(64,'可乐',1,'5','','1525827764101');
/*!40000 ALTER TABLE `t_order_goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_store`
--

DROP TABLE IF EXISTS `t_store`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_store` (
  `store_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_name` varchar(45) NOT NULL,
  `sales_amount` int(11) NOT NULL,
  `store_grade` float NOT NULL,
  `sending_price` int(11) NOT NULL,
  `delivery_cost` float NOT NULL,
  `store_distance` int(11) NOT NULL,
  `store_activity_tip1` varchar(200) DEFAULT NULL,
  `store_activity_tip2` varchar(200) DEFAULT NULL,
  `store_image` varchar(200) DEFAULT NULL,
  `brief_introduction` varchar(200) DEFAULT NULL,
  `store_notice` varchar(45) DEFAULT NULL,
  `store_tel` varchar(45) DEFAULT NULL,
  `store_address` varchar(45) DEFAULT NULL,
  `send_start_time` varchar(45) DEFAULT NULL,
  `sent_end_time` varchar(45) DEFAULT NULL,
  `store_qualification` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`store_id`),
  UNIQUE KEY `store_name_UNIQUE` (`store_name`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_store`
--

LOCK TABLES `t_store` WRITE;
/*!40000 ALTER TABLE `t_store` DISABLE KEYS */;
INSERT INTO `t_store` VALUES (101,'正新鸡排',999,5,15,2.5,1050,'满20减8','满40减15',NULL,'这是一家很正经的鸡排店','黄渤代言','13565278652','山东济南山大路48号','11：00','21：00',NULL),(102,'金川娃麻辣烫',1024,4.8,20,3,888,'满10减2','满30减5',NULL,'这是一家很正经的麻辣烫','进店即送免费饮料','17862948733','山东济南山大西门对面','11：00','21：00',NULL),(103,'家乡味道',1500,5,35,5,150,'满50减5','满100减12',NULL,'这是一家很正经的鲁菜馆','菜品齐全，物美价廉','06335693746','山东济南山大南门往东150米','12：00','22：00',NULL),(104,'三可水饺',999,4.5,15,2.5,980,'满15减2','满25减6',NULL,'这是一家很正经的水饺店','买就送辣椒、醋','13435233334','山东济南山大北门往西500mi处','11：30','20：00',NULL),(105,'正新鸡排2',999,5,15,2.5,1050,'满20减8','满40减15',NULL,'这是一家很正经的鸡排店','黄渤代言','13565278652','山东济南山大路48号','11：00','21：00',NULL);
/*!40000 ALTER TABLE `t_store` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `user_password` varchar(45) DEFAULT NULL,
  `user_image` varchar(45) DEFAULT NULL,
  `user_tel` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (1213801,'王先生','123456',NULL,'17865197657'),(1213802,'JaggerW','123456',NULL,'17865197657'),(1213803,'王杰','123456',NULL,'17865197657'),(1213806,'王先生','1234556',NULL,'1233445566767'),(1213807,'王先生','1234556',NULL,'1233445566767'),(1213809,'王先生','1234556',NULL,'1233445566767');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'dbtest'
--

--
-- Dumping routines for database 'dbtest'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-08 14:57:14
