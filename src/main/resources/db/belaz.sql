-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: belaz
-- ------------------------------------------------------
-- Server version	5.6.25-log

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
-- Table structure for table `brakes`
--

DROP TABLE IF EXISTS `brakes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `brakes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  `front_wheels` varchar(45) NOT NULL,
  `rear_wheels` varchar(45) NOT NULL,
  `parking_brake` varchar(45) NOT NULL,
  `auxiliary` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brakes`
--

LOCK TABLES `brakes` WRITE;
/*!40000 ALTER TABLE `brakes` DISABLE KEYS */;
INSERT INTO `brakes` VALUES (1,'с пневмоприводом','колодочные','колодочные','колодочный','гидродинамический тормоз-замедлитель'),(2,'с гидроприводом','сухие однодисковые','ММОТ','дисковый','ММОТ'),(3,'с гидроприводом','сухие однодисковые','MMOT','колодочный ','MMOT'),(4,'с гидроприводом','сухие дисковые','сухие дисковые ','дисковый','электродинамическое торможение тяговыми двигателями с принудительным воздушным охлаждением тормозных резисторов');
/*!40000 ALTER TABLE `brakes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engine`
--

DROP TABLE IF EXISTS `engine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
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
-- Table structure for table `model`
--

DROP TABLE IF EXISTS `model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `model` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
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
-- Table structure for table `series`
--

DROP TABLE IF EXISTS `series`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `series` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suspension`
--

LOCK TABLES `suspension` WRITE;
/*!40000 ALTER TABLE `suspension` DISABLE KEYS */;
INSERT INTO `suspension` VALUES (1,'пневмогидравлическая, зависимая для передней оси и ведущего моста– на штангах '),(2,'пневмогидравлическая, зависимая для передней оси и ведущего моста - продольные рычаги с центральным шарниром'),(3,'пневмогидравлическая, зависимая для передней оси и ведущего моста – продольные рычаги с центральными шарнирами и поперечными штангами ');
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
  `power` varchar(80) NOT NULL,
  `fuel_rate` int(11) NOT NULL,
  `torque` varchar(70) NOT NULL,
  `turning_radius` varchar(45) NOT NULL,
  `length` int(11) NOT NULL,
  `width` int(11) NOT NULL,
  `height` int(11) NOT NULL,
  `operational_weight` int(11) NOT NULL,
  `gross_weight` int(11) NOT NULL,
  `max_speed` int(11) NOT NULL,
  `model_id` int(11) NOT NULL,
  `transmission_id` int(11) NOT NULL,
  `engine_id` int(11) NOT NULL,
  `suspension_id` int(11) NOT NULL,
  `brake_id` int(11) NOT NULL,
  `application` text NOT NULL,
  `payload_capacity` int(11) NOT NULL,
  PRIMARY KEY (`id`,`model_id`,`transmission_id`,`engine_id`,`suspension_id`,`brake_id`),
  UNIQUE KEY `width_UNIQUE` (`width`),
  KEY `fk_truck_mining_model1_idx` (`model_id`),
  KEY `fk_truck_mining_transmission1_idx` (`transmission_id`),
  KEY `fk_truck_mining_engine1_idx` (`engine_id`),
  KEY `fk_truck_mining_suspension1_idx` (`suspension_id`),
  KEY `fk_truck_mining_brake1_idx` (`brake_id`),
  CONSTRAINT `fk_truck_mining_brake1` FOREIGN KEY (`brake_id`) REFERENCES `brakes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_engine1` FOREIGN KEY (`engine_id`) REFERENCES `engine` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_suspension1` FOREIGN KEY (`suspension_id`) REFERENCES `suspension` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_truck_mining_transmission1` FOREIGN KEY (`transmission_id`) REFERENCES `transmission` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `truck_mining`
--

LOCK TABLES `truck_mining` WRITE;
/*!40000 ALTER TABLE `truck_mining` DISABLE KEYS */;
INSERT INTO `truck_mining` VALUES (1,'309',228,'1491','8,7',7110,3860,3930,22600,52600,50,1,1,1,1,1,'Предназначены для транспортирования горной массы в разрыхленном состоянии по технологическим дорогам на открытых разработках полезных ископаемых с различными климатическими условиями. Могут использоваться на строительстве крупных промышленных и гидротехнических сооружений,при сооружении дорожно- магистральных комплексов, а также в технологических подразделениях предприятий перерабатывающей промышленности.',30),(2,'448',219,'2237','10,2',8390,4110,4390,33100,78100,50,7,1,6,1,1,'Предназначены для транспортирования горной массы в разрыхленном состоянии по технологическим дорогам на открытых разработках полезных ископаемых с различными климатическими условиями. Могут использоваться на строительстве крупных промышленных и гидротехнических сооружений,при сооружении дорожно- магистральных комплексов, а также в технологических подразделениях предприятий перерабатывающей промышленности.',45),(3,'448',223,'2779','9',8560,4240,4475,35000,80000,55,8,1,7,2,2,'Предназначены для транспортирования горной массы в разрыхленном состоянии пo технологическим дорогам на открытых разработках полезных ископаемых с различными климатическими условиями. Могут использоваться на строительстве крупных промышленных и гидротехнических сооружений, при сооружении дорожно-магистральных комплексов, а также в технологических подразделениях предприятий перерабатывающей промышленности. ',45),(4,'783',202,'4630 ','11',10340,5750,5340,73000,163000,60,14,3,9,2,2,'Предназначены для транспортирования горной массы в разрыхленном состоянии по технологическим дорогам на открытых разработках полезных ископаемых с различными климатическими условиями. Могут использоваться на строительстве крупных промышленных и гидротехнических сооружений, при сооружении дорожно- магистральных комплексов, а также в технологических подразделениях предприятий перерабатывающей промышленности. ',90),(5,'1194',209,'6836 ','13',11500,6400,5900,109500,245500,64,18,4,11,2,4,'Предназначены для транспортирования горной массы в разрыхленном состоянии по технологическим дорогам на открытых разработках полезных ископаемых с различными климатическими условиями. Могут использоваться на строительстве крупных промышленных и гидротехнических сооружений, при сооружении дорожно- магистральных комплексов, а также в технологических подразделениях предприятий перерабатывающей промышленности. ',136),(6,'2 x 1715',198,'2 х 9313 ','19,8',20600,10500,8270,360000,810000,64,41,4,15,3,4,'Предназначены для транспортирования горной массы в разрыхленном состоянии по технологическим дорогам на открытых разработках полезных ископаемых с различными климатическими условиями. Могут использоваться на строительстве крупных промышленных и гидротехнических сооружений, при сооружении дорожно- магистральных комплексов, а также в технологических подразделениях предприятий перерабатывающей промышленности. ',450);
/*!40000 ALTER TABLE `truck_mining` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-08 13:36:16
