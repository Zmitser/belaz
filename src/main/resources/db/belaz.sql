-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: belaz
-- ------------------------------------------------------
-- Server version	5.7.12-log

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
-- Table structure for table `auxiliary`
--
SET AUTOCOMMIT=0;
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `auxiliary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auxiliary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auxiliary`
--

LOCK TABLES `auxiliary` WRITE;
/*!40000 ALTER TABLE `auxiliary` DISABLE KEYS */;
INSERT INTO `auxiliary` VALUES (1,'hydrodynamic retarder'),(2,'multiple-disk oil cooled brakes'),(3,'electrodynamic retarding by traction motors with forced air-cooling of braking resistors');
/*!40000 ALTER TABLE `auxiliary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `brake_type`
--

DROP TABLE IF EXISTS `brake_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `brake_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brake_type`
--

LOCK TABLES `brake_type` WRITE;
/*!40000 ALTER TABLE `brake_type` DISABLE KEYS */;
INSERT INTO `brake_type` VALUES (1,'with pneumatic drive'),(2,'with hydraulic drive ');
/*!40000 ALTER TABLE `brake_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engine`
--

DROP TABLE IF EXISTS `engine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engine`
--

LOCK TABLES `engine` WRITE;
/*!40000 ALTER TABLE `engine` DISABLE KEYS */;
INSERT INTO `engine` VALUES (1,'YaMZ-240PM2'),(2,'YaMZ-240M2-1'),(3,'MMZ D-280 '),(4,'Cummins QSM 11-C'),(5,'YaMZ-240NM2'),(6,'Cummins KTA 19-C'),(7,'Cummins QSX 15-C'),(8,'Cummins QSK 19-C'),(9,'Cummins QST 30-C'),(10,'Cummins KTA-38-C'),(11,'Cummins QSK 45-C'),(12,'Cummins KTA 50-C'),(13,'MTU DD 12V4000'),(14,'Cummins QSK 45-C'),(15,'MTU DD 16V4000'),(16,'Cummins QSK 60-C'),(17,'MTU DD 20V4000'),(18,'Cummins QSK 78-C');
/*!40000 ALTER TABLE `engine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `front_wheels`
--

DROP TABLE IF EXISTS `front_wheels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `front_wheels` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `front_wheels`
--

LOCK TABLES `front_wheels` WRITE;
/*!40000 ALTER TABLE `front_wheels` DISABLE KEYS */;
INSERT INTO `front_wheels` VALUES (1,'shoe brakes'),(2,'dry single-disk brakes '),(3,'dry disc brakes ');
/*!40000 ALTER TABLE `front_wheels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `machine_condition`
--

DROP TABLE IF EXISTS `machine_condition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `machine_condition` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `machine_condition`
--

LOCK TABLES `machine_condition` WRITE;
/*!40000 ALTER TABLE `machine_condition` DISABLE KEYS */;
INSERT INTO `machine_condition` VALUES (1,'GOOD'),(2,'BAD'),(3,'EXCELLENT'),(4,'SATISFACTORILY');
/*!40000 ALTER TABLE `machine_condition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `machine_location`
--

DROP TABLE IF EXISTS `machine_location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `machine_location` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `machine_location`
--

LOCK TABLES `machine_location` WRITE;
/*!40000 ALTER TABLE `machine_location` DISABLE KEYS */;
INSERT INTO `machine_location` VALUES (1,'Japan'),(2,'China'),(3,'Россия'),(4,'Russia'),(5,'Angola'),(6,'Indonesia');
/*!40000 ALTER TABLE `machine_location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manufacturer`
--

DROP TABLE IF EXISTS `manufacturer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manufacturer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manufacturer`
--

LOCK TABLES `manufacturer` WRITE;
/*!40000 ALTER TABLE `manufacturer` DISABLE KEYS */;
INSERT INTO `manufacturer` VALUES (1,'BELAZ'),(2,'Komatsu'),(3,'Caterpillar');
/*!40000 ALTER TABLE `manufacturer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manufacturer_country`
--

DROP TABLE IF EXISTS `manufacturer_country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manufacturer_country` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manufacturer_country`
--

LOCK TABLES `manufacturer_country` WRITE;
/*!40000 ALTER TABLE `manufacturer_country` DISABLE KEYS */;
INSERT INTO `manufacturer_country` VALUES (1,'Japan'),(2,'Belarus'),(3,'USA');
/*!40000 ALTER TABLE `manufacturer_country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `model`
--

DROP TABLE IF EXISTS `model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `model` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `series_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`series_id`),
  KEY `fk_model_series1_idx` (`series_id`),
  CONSTRAINT `fk_model_series1` FOREIGN KEY (`series_id`) REFERENCES `series` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `model`
--

LOCK TABLES `model` WRITE;
/*!40000 ALTER TABLE `model` DISABLE KEYS */;
INSERT INTO `model` VALUES (1,'7540A',1),(2,'7540B',1),(3,'7540C',1),(4,'7540E',1),(5,'7540K',1),(6,'7547',2),(7,'75473',2),(8,'75450',3),(9,'75453',3),(10,'7555В',4),(11,'7555D',4),(12,'7555E',4),(13,'7555F',4),(14,'75570',5),(15,'75571',5),(16,'75581',6),(17,'75583',6),(18,'7513',7),(19,'75131',7),(20,'75135',7),(21,'75137',7),(22,'75139',7),(23,'7513А',7),(24,'7513В',7),(25,'75170',8),(26,'75172',8),(27,'75173',8),(28,'75174',8),(29,'75180',9),(30,'75302',10),(31,'75306',10),(32,'75307',10),(33,'75309',10),(34,'75310',11),(35,'75311',11),(36,'75312',11),(37,'75315',11),(38,'75602',12),(39,'75603',12),(40,'75604',12),(41,'75710',13);
/*!40000 ALTER TABLE `model` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parking_brake`
--

DROP TABLE IF EXISTS `parking_brake`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parking_brake` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parking_brake`
--

LOCK TABLES `parking_brake` WRITE;
/*!40000 ALTER TABLE `parking_brake` DISABLE KEYS */;
INSERT INTO `parking_brake` VALUES (1,'shoe brake'),(2,'disk brake');
/*!40000 ALTER TABLE `parking_brake` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `photo`
--

DROP TABLE IF EXISTS `photo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `photo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `photo`
--

LOCK TABLES `photo` WRITE;
/*!40000 ALTER TABLE `photo` DISABLE KEYS */;
INSERT INTO `photo` VALUES (1,'001.jpg'),(2,'6.jpg'),(3,'7513.jpg'),(4,'7513a.jpg'),(5,'9846f3e390f5.jpg'),(6,'75131.jpg'),(7,'75131_2.jpg'),(8,'75131_3.jpg'),(9,'75131_czjan_shan_.jpg'),(10,'75132.jpg'),(11,'751311.jpg'),(12,'73131130kamatsu300012.jpg'),(13,'7513178231.jpg'),(14,'belaz_75131.jpg'),(15,'img_0658.jpg'),(16,'p1000945.jpg'),(17,'p1000950.jpg'),(18,'p1010825.jpg'),(19,'7540.jpg'),(20,'7540_1.jpg'),(21,'7540_2.jpg'),(22,'7540_3.jpg'),(23,'7540_3.jpg'),(24,'7540_4.jpg'),(25,'7540_11.jpg'),(26,'7540_21.jpg'),(27,'7540_31.jpg'),(28,'7540_41.jpg'),(29,'7540_51.jpg'),(30,'7545.jpg'),(31,'7545_1.jpg'),(32,'7545_3.jpg'),(33,'7545_4.jpg'),(34,'7545_8.jpg'),(35,'7545_77.jpg'),(36,'belaz_75450_at_belarus_expo.jpg'),(37,'7541_2.jpg'),(38,'7547.jpg'),(39,'7547_1.jpg'),(40,'7547_2.jpg'),(41,'7547_3.jpg'),(42,'belaz7547.jpg'),(43,'belaz75473.jpg'),(44,'ekg5a_belaz7547_kuzb.jpg'),(45,'img_0192.jpg'),(46,'img_0193.jpg'),(47,'7557_1.jpg'),(48,'75570.jpg'),(49,'75570_1.jpg'),(50,'75570_3.jpg'),(51,'75570_4.jpg'),(52,'75570_6.jpg'),(53,'755701.jpg'),(54,'22.jpg'),(55,'32.jpg'),(56,'41.jpg'),(57,'foto_1.jpg'),(58,'foto_2.jpg'),(59,'foto_3.jpg'),(60,'foto_4.jpg'),(61,'foto_5.jpg'),(62,'foto_6.jpg'),(63,'foto_7.jpg'),(64,'foto_8.jpg'),(65,'untitled_1.jpg'),(66,'75180_1.jpg'),(67,'75180_2.jpg'),(68,'75180_3.jpg'),(69,'75180_4.jpg'),(70,'75180_5.jpg'),(71,'75180_6.jpg'),(72,'75180_7.jpg');
/*!40000 ALTER TABLE `photo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rear_wheels`
--

DROP TABLE IF EXISTS `rear_wheels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rear_wheels` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rear_wheels`
--

LOCK TABLES `rear_wheels` WRITE;
/*!40000 ALTER TABLE `rear_wheels` DISABLE KEYS */;
INSERT INTO `rear_wheels` VALUES (1,'shoe brakes'),(2,'multiple-disk oil cooled brakes'),(3,'dry disc brakes ');
/*!40000 ALTER TABLE `rear_wheels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series`
--

DROP TABLE IF EXISTS `series`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `series` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series`
--

LOCK TABLES `series` WRITE;
/*!40000 ALTER TABLE `series` DISABLE KEYS */;
INSERT INTO `series` VALUES (1,'BELAZ-7540'),(2,'BELAZ-7547'),(3,'BELAZ-7545'),(4,'BELAZ-7555'),(5,'BELAZ-7557'),(6,'BELAZ-7558'),(7,'BELAZ-7513'),(8,'BELAZ-7517'),(9,'BELAZ-7518'),(10,'BELAZ-7530'),(11,'BELAZ-7531'),(12,'BELAZ-7560'),(13,'BELAZ-7571');
/*!40000 ALTER TABLE `series` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suspension`
--

DROP TABLE IF EXISTS `suspension`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suspension` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suspension`
--

LOCK TABLES `suspension` WRITE;
/*!40000 ALTER TABLE `suspension` DISABLE KEYS */;
INSERT INTO `suspension` VALUES (1,'пневмогидравлическая, зависимая для передней оси и ведущего моста– на штангах '),(2,'пневмогидравлическая, зависимая для передней оси и ведущего моста - продольные рычаги с центральным шарниром'),(3,'пневмогидравлическая, зависимая для передней оси и ведущего моста – продольные рычаги с центральными шарнирами и поперечными штангами '),(4,'зависимая для переднего и заднего моста со стабилизаторами попе-\r\nречной устойчивости. Продольные рычаги с центральным шарниром');
/*!40000 ALTER TABLE `suspension` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transmission`
--

DROP TABLE IF EXISTS `transmission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transmission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transmission`
--

LOCK TABLES `transmission` WRITE;
/*!40000 ALTER TABLE `transmission` DISABLE KEYS */;
INSERT INTO `transmission` VALUES (1,'5+2'),(2,'3+1'),(3,'6+1'),(4,'переменно-переменного тока '),(5,'переменно-постоянного тока');
/*!40000 ALTER TABLE `transmission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `truck_mining`
--

DROP TABLE IF EXISTS `truck_mining`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `truck_mining` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` varchar(45) NOT NULL,
  `manufacturer_id` int(11) NOT NULL,
  `manufacturer_country_id` int(11) NOT NULL,
  `year` varchar(10) NOT NULL,
  `machine_condition_id` int(11) NOT NULL,
  `machine_location_id` int(11) NOT NULL,
  `model_id` int(11) NOT NULL,
  `payload_capacity` int(11) NOT NULL,
  `engine_id` int(11) NOT NULL,
  `power` varchar(80) NOT NULL,
  `fuel_rate` varchar(45) NOT NULL,
  `transmission_id` int(11) NOT NULL,
  `torque` varchar(70) NOT NULL,
  `suspension_id` int(11) NOT NULL,
  `brake_type_id` int(11) NOT NULL,
  `front_wheels_id` int(11) NOT NULL,
  `rear_wheels_id` int(11) NOT NULL,
  `parking_brake_id` int(11) NOT NULL,
  `auxiliary_id` int(11) NOT NULL,
  `turning_radius` varchar(45) NOT NULL,
  `length` int(11) NOT NULL,
  `width` int(11) NOT NULL,
  `height` int(11) NOT NULL,
  `operational_weight` int(11) NOT NULL,
  `gross_weight` int(11) NOT NULL,
  `max_speed` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `application` text NOT NULL,
  `advantages` text NOT NULL,
  `complete_set` text NOT NULL,
  `sold` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`,`product_id`,`manufacturer_id`,`manufacturer_country_id`,`machine_condition_id`,`machine_location_id`,`model_id`,`engine_id`,`transmission_id`,`suspension_id`,`brake_type_id`,`front_wheels_id`,`rear_wheels_id`,`parking_brake_id`,`auxiliary_id`),
  UNIQUE KEY `width_UNIQUE` (`width`),
  KEY `fk_truck_mining_model1_idx` (`model_id`),
  KEY `fk_truck_mining_transmission1_idx` (`transmission_id`),
  KEY `fk_truck_mining_engine1_idx` (`engine_id`),
  KEY `fk_truck_mining_suspension1_idx` (`suspension_id`),
  KEY `fk_truck_mining_manufacturer1_idx` (`manufacturer_id`),
  KEY `fk_truck_mining_manufacturer_country1_idx` (`manufacturer_country_id`),
  KEY `fk_truck_mining_front_wheels1_idx` (`front_wheels_id`),
  KEY `fk_truck_mining_rear_wheels1_idx` (`rear_wheels_id`),
  KEY `fk_truck_mining_machine_location1_idx` (`machine_location_id`),
  KEY `fk_truck_mining_parking_brake1_idx` (`parking_brake_id`),
  KEY `fk_truck_mining_brake_type1_idx` (`brake_type_id`),
  KEY `fk_truck_mining_auxiliary1_idx` (`auxiliary_id`),
  KEY `fk_truck_mining_machine_condition1_idx` (`machine_condition_id`),
  CONSTRAINT `fk_truck_mining_auxiliary1` FOREIGN KEY (`auxiliary_id`) REFERENCES `auxiliary` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_brake_type1` FOREIGN KEY (`brake_type_id`) REFERENCES `brake_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_engine1` FOREIGN KEY (`engine_id`) REFERENCES `engine` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_front_wheels1` FOREIGN KEY (`front_wheels_id`) REFERENCES `front_wheels` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_machine_condition1` FOREIGN KEY (`machine_condition_id`) REFERENCES `machine_condition` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_machine_location1` FOREIGN KEY (`machine_location_id`) REFERENCES `machine_location` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_manufacturer1` FOREIGN KEY (`manufacturer_id`) REFERENCES `manufacturer` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_manufacturer_country1` FOREIGN KEY (`manufacturer_country_id`) REFERENCES `manufacturer_country` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_model1` FOREIGN KEY (`model_id`) REFERENCES `model` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_parking_brake1` FOREIGN KEY (`parking_brake_id`) REFERENCES `parking_brake` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_rear_wheels1` FOREIGN KEY (`rear_wheels_id`) REFERENCES `rear_wheels` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_suspension1` FOREIGN KEY (`suspension_id`) REFERENCES `suspension` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_transmission1` FOREIGN KEY (`transmission_id`) REFERENCES `transmission` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `truck_mining`
--

LOCK TABLES `truck_mining` WRITE;
/*!40000 ALTER TABLE `truck_mining` DISABLE KEYS */;
INSERT INTO `truck_mining` VALUES (1,'b1626-ru',1,2,'2010',1,4,18,136,11,'1194','209',4,'6830',3,2,3,3,2,3,'13',11500,6400,5900,109500,245500,64,5000000,'Mining dump trucks with payload capacity of 110-136 tonnes are designed for transportation of rocks in severe mining conditions of deep pits, at open-cast mining of mineral deposits on technological haul roads under various climatic operating conditions (ambient temperatures from -50 to +50 degrees Celsius).','ENGINE\r\n\r\n   Diesel engines with electronic control and switchable vane central cooling system\r\nIt provides a high power density, and thus the speed of the truck is on the rise, as well as high\r\nfuel efficiency.\r\n   To facilitate starting the engine at low temperatures dump trucks equipped prestarting\r\ncoolant heater and the motor fuel, which facilitates its starting and ensures stable\r\nwork in the Far North.','\"Standard EQUIPMENT:\r\n\r\nthe combined fire-extinguishing system with remote switching subsystem and on the rear axle;\r\nPre-Heater (excluding tropical picking trucks);\r\nCentralized lubrication system;\r\nKamnevytalkivateli;\r\nHeating and HVACR unit;\r\nThe monitoring system load and fuel;\r\ntelemetry monitoring system tire pressure;\r\nSignaling device closer to the high-voltage transmission lines;',0),(2,'b1226-ru',1,2,'2008',3,3,41,450,15,'2 x 1715','198',4,'2 x 9313',4,2,3,3,2,3,'19,8',20600,10500,8270,360000,810000,64,100000000,'Designed for transportation of loosened rocks on technological haul roads at open-pit mining sites under different climatic conditions. These trucks can be used in construction of large industrial structures and hydraulic facilities, in construction of highway systems as well as in technological departments of the enterprises of processing industry.','ENGINE\r\n\r\n   Diesel engines with electronic control and switchable vane central cooling system\r\nIt provides a high power density, and thus the speed of the truck is on the rise, as well as high\r\nfuel efficiency.\r\n   To facilitate starting the engine at low temperatures dump trucks equipped prestarting\r\ncoolant heater and the motor fuel, which facilitates its starting and ensures stable\r\nwork in the Far North.','\"Standard EQUIPMENT:\r\n\r\nthe combined fire-extinguishing system with remote switching subsystem and on the rear axle;\r\nPre-Heater (excluding tropical picking trucks);\r\nCentralized lubrication system;\r\nKamnevytalkivateli;\r\nHeating and HVACR unit;\r\nThe monitoring system load and fuel;\r\ntelemetry monitoring system tire pressure;\r\nSignaling device closer to the high-voltage transmission lines;',0),(3,'b1123-ru',1,2,'2003',1,2,14,90,9,'783','202',3,'4630',2,2,2,2,2,2,'11',10340,5750,5340,73000,163000,60,4900000,'Mining dump trucks with payload capacity of 154-160 tonnes are designed for transportation of rocks in severe mining conditions of deep pits, at open-cast mining of mineral deposits on technological haul roads under various climatic operating conditions (ambient temperatures from -50 to +50 degrees Celsius).','ENGINE\r\n\r\n   Diesel engines with electronic control and switchable vane central cooling system\r\nIt provides a high power density, and thus the speed of the truck is on the rise, as well as high\r\nfuel efficiency.\r\n   To facilitate starting the engine at low temperatures dump trucks equipped prestarting\r\ncoolant heater and the motor fuel, which facilitates its starting and ensures stable\r\nwork in the Far North.','\"Standard EQUIPMENT:\r\n\r\nthe combined fire-extinguishing system with remote switching subsystem and on the rear axle;\r\nPre-Heater (excluding tropical picking trucks);\r\nCentralized lubrication system;\r\nKamnevytalkivateli;\r\nHeating and HVACR unit;\r\nThe monitoring system load and fuel;\r\ntelemetry monitoring system tire pressure;\r\nSignaling device closer to the high-voltage transmission lines;',0),(4,'b0123-ru',1,2,'2001',1,4,7,45,7,'448','219',1,'2273',1,1,1,1,1,1,'10,2',8390,4110,4390,33100,78100,50,4500000,'Mining dump trucks with payload capacity of 45 tonnes are designed for transportation of rocks in severe mining conditions of deep pits, at open-cast mining of mineral deposits on technological haul roads under various climatic operating conditions (ambient temperatures from -50 to +50 degrees Celsius).','ENGINE\r\n\r\n   Diesel engines with electronic control and switchable vane central cooling system\r\nIt provides a high power density, and thus the speed of the truck is on the rise, as well as high\r\nfuel efficiency.\r\n   To facilitate starting the engine at low temperatures dump trucks equipped prestarting\r\ncoolant heater and the motor fuel, which facilitates its starting and ensures stable\r\nwork in the Far North.','\"Standard EQUIPMENT:\r\n\r\nthe combined fire-extinguishing system with remote switching subsystem and on the rear axle;\r\nPre-Heater (excluding tropical picking trucks);\r\nCentralized lubrication system;\r\nKamnevytalkivateli;\r\nHeating and HVACR unit;\r\nThe monitoring system load and fuel;\r\ntelemetry monitoring system tire pressure;\r\nSignaling device closer to the high-voltage transmission lines;',0),(5,'b0221-ru',1,2,'2000',3,1,8,45,7,'448','223',1,'2279',2,2,2,2,2,2,'9',8560,4240,4475,35000,80000,55,4800000,'Mining dump trucks with payload capacity of 45 tonnes are designed for transportation of rocks in severe mining conditions of deep pits, at open-cast mining of mineral deposits on technological haul roads under various climatic operating conditions (ambient temperatures from -50 to +50 degrees Celsius).','ENGINE\r\n\r\n   Diesel engines with electronic control and switchable vane central cooling system\r\nIt provides a high power density, and thus the speed of the truck is on the rise, as well as high\r\nfuel efficiency.\r\n   To facilitate starting the engine at low temperatures dump trucks equipped prestarting\r\ncoolant heater and the motor fuel, which facilitates its starting and ensures stable\r\nwork in the Far North.','\"Standard EQUIPMENT:\r\n\r\nthe combined fire-extinguishing system with remote switching subsystem and on the rear axle;\r\nPre-Heater (excluding tropical picking trucks);\r\nCentralized lubrication system;\r\nKamnevytalkivateli;\r\nHeating and HVACR unit;\r\nThe monitoring system load and fuel;\r\ntelemetry monitoring system tire pressure;\r\nSignaling device closer to the high-voltage transmission lines;',0),(6,'b1233-ru',1,2,'2005',2,4,1,30,1,'309','228',1,'1491',1,1,1,1,1,1,'8,7',7110,3860,3930,22600,52600,50,4400000,'Mining dump trucks with payload capacity of 30 tonnes are designed for transportation of rocks in severe mining conditions of deep pits, at open-cast mining of mineral deposits on technological haul roads under various climatic operating conditions (ambient temperatures from -50 to +50 degrees Celsius).','ENGINE\r\n\r\n   Diesel engines with electronic control and switchable vane central cooling system\r\nIt provides a high power density, and thus the speed of the truck is on the rise, as well as high\r\nfuel efficiency.\r\n   To facilitate starting the engine at low temperatures dump trucks equipped prestarting\r\ncoolant heater and the motor fuel, which facilitates its starting and ensures stable\r\nwork in the Far North.','\"Standard EQUIPMENT:\r\n\r\nthe combined fire-extinguishing system with remote switching subsystem and on the rear axle;\r\nPre-Heater (excluding tropical picking trucks);\r\nCentralized lubrication system;\r\nKamnevytalkivateli;\r\nHeating and HVACR unit;\r\nThe monitoring system load and fuel;\r\ntelemetry monitoring system tire pressure;\r\nSignaling device closer to the high-voltage transmission lines;',0),(8,'b1526-ru',1,2,'2001',1,2,29,180,16,'1491','199',4,'7865',3,2,3,2,2,2,'14',12600,6950,6320,145200,325200,60,5000000,'Mining dump trucks with payload capacity of 180 tonnes are designed for transportation of rocks in severe mining conditions of deep pits, at open-cast mining of mineral deposits on technological haul roads under various climatic operating conditions (ambient temperatures from -50 to +50 degrees Celsius).','ENGINE\r\n\r\n   Diesel engines with electronic control and switchable vane central cooling system\r\nIt provides a high power density, and thus the speed of the truck is on the rise, as well as high\r\nfuel efficiency.\r\n   To facilitate starting the engine at low temperatures dump trucks equipped prestarting\r\ncoolant heater and the motor fuel, which facilitates its starting and ensures stable\r\nwork in the Far North.','\"Standard EQUIPMENT:\r\n\r\nthe combined fire-extinguishing system with remote switching subsystem and on the rear axle;\r\nPre-Heater (excluding tropical picking trucks);\r\nCentralized lubrication system;\r\nKamnevytalkivateli;\r\nHeating and HVACR unit;\r\nThe monitoring system load and fuel;\r\ntelemetry monitoring system tire pressure;\r\nSignaling device closer to the high-voltage transmission lines;',0);
/*!40000 ALTER TABLE `truck_mining` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `truck_mining_has_photo`
--

DROP TABLE IF EXISTS `truck_mining_has_photo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `truck_mining_has_photo` (
  `truck_mining_id` int(11) NOT NULL,
  `photo_id` int(11) NOT NULL,
  PRIMARY KEY (`truck_mining_id`,`photo_id`),
  KEY `fk_truck_mining_has_photo_photo1_idx` (`photo_id`),
  KEY `fk_truck_mining_has_photo_truck_mining1_idx` (`truck_mining_id`),
  CONSTRAINT `fk_truck_mining_has_photo_photo1` FOREIGN KEY (`photo_id`) REFERENCES `photo` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_has_photo_truck_mining1` FOREIGN KEY (`truck_mining_id`) REFERENCES `truck_mining` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `truck_mining_has_photo`
--

LOCK TABLES `truck_mining_has_photo` WRITE;
/*!40000 ALTER TABLE `truck_mining_has_photo` DISABLE KEYS */;
INSERT INTO `truck_mining_has_photo` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9),(1,10),(1,11),(1,12),(1,13),(1,14),(1,15),(1,16),(1,17),(6,19),(6,20),(6,21),(6,22),(6,23),(6,24),(6,25),(6,26),(6,27),(6,28),(6,29),(5,30),(5,31),(5,32),(5,33),(5,34),(5,35),(4,38),(4,39),(4,40),(4,41),(4,42),(4,43),(4,44),(4,45),(4,46),(3,47),(3,48),(3,49),(3,50),(3,51),(3,52),(2,54),(2,55),(2,56),(2,57),(2,58),(2,59),(2,60),(2,61),(2,62),(2,63),(2,64),(2,65),(8,66),(8,67),(8,68),(8,69),(8,70),(8,71);
/*!40000 ALTER TABLE `truck_mining_has_photo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `truck_mining_has_video`
--

DROP TABLE IF EXISTS `truck_mining_has_video`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `truck_mining_has_video` (
  `truck_mining_id` int(11) NOT NULL,
  `video_id` int(11) NOT NULL,
  PRIMARY KEY (`truck_mining_id`,`video_id`),
  KEY `fk_truck_mining_has_video_video1_idx` (`video_id`),
  KEY `fk_truck_mining_has_video_truck_mining1_idx` (`truck_mining_id`),
  CONSTRAINT `fk_truck_mining_has_video_truck_mining1` FOREIGN KEY (`truck_mining_id`) REFERENCES `truck_mining` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_has_video_video1` FOREIGN KEY (`video_id`) REFERENCES `video` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `truck_mining_has_video`
--

LOCK TABLES `truck_mining_has_video` WRITE;
/*!40000 ALTER TABLE `truck_mining_has_video` DISABLE KEYS */;
/*!40000 ALTER TABLE `truck_mining_has_video` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `video`
--

DROP TABLE IF EXISTS `video`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `video` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `video`
--

LOCK TABLES `video` WRITE;
/*!40000 ALTER TABLE `video` DISABLE KEYS */;
/*!40000 ALTER TABLE `video` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-22 14:54:49
