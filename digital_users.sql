-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: digital
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` char(18) NOT NULL,
  `password` varchar(16) NOT NULL,
  `userName` varchar(15) DEFAULT NULL,
  `age` double DEFAULT '0',
  `gender` char(1) NOT NULL,
  `address` double DEFAULT '0',
  `email` varchar(20) NOT NULL,
  `tel` char(11) NOT NULL,
  `userType` varchar(20) DEFAULT NULL,
  `majorExpenditure` double DEFAULT '0',
  `renovatedHouse` double DEFAULT '0',
  `houseValue` double DEFAULT '0',
  `agriculturalEquip` double DEFAULT '0',
  `vehicleValue` double DEFAULT '0',
  `fixedAssets` double DEFAULT '0',
  `agriHypothecaryValue` double DEFAULT '0',
  `deposit` double DEFAULT '0',
  `aveIncome` double DEFAULT '0',
  `monthIncome` double DEFAULT '0',
  `monthRatal` double DEFAULT '0',
  `commerceHypothecaryValue` double DEFAULT '0',
  `liabilities` double DEFAULT '0',
  `villageCadres` double DEFAULT '0',
  `guarantee` double DEFAULT '0',
  `elderLive` double DEFAULT '0',
  `honor` double DEFAULT '0',
  `loanGuaratee` double DEFAULT '0',
  `informationLevel` double DEFAULT '0',
  `personalInsurance` double DEFAULT '0',
  `healthExamination` double DEFAULT '0',
  `interestRate` double DEFAULT '0',
  `residenceTime` double DEFAULT '0',
  `maritalStatus` double DEFAULT '0',
  `married` double DEFAULT '0',
  `divorced` double DEFAULT '0',
  `phoneNumReplace` double DEFAULT '0',
  `fallIll` double DEFAULT '0',
  `educationBackground` double DEFAULT '0',
  `mainStemDistance` double DEFAULT '0',
  `treatmentCosts` double DEFAULT '0',
  `raisingNumber` double DEFAULT '0',
  `childrenEdu` double DEFAULT '0',
  `manpowerRate` double DEFAULT '0',
  `modernAgriTech` double DEFAULT '0',
  `propertyInsurance` double DEFAULT '0',
  `disasterNumber` double DEFAULT '0',
  `damageRate` double DEFAULT '0',
  `loanUse` double DEFAULT '0',
  `newsAttention` double DEFAULT '0',
  `educationAttention` double DEFAULT '0',
  `onlineFrequency` double DEFAULT '0',
  `broadbandBandwidth` double DEFAULT '0',
  `phoneCharge` double DEFAULT '0',
  `weChat` double DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-03 21:51:22
