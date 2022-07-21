-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: student_db
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `stdudent`
--

DROP TABLE IF EXISTS `stdudent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stdudent` (
  `std_id` varchar(255) NOT NULL,
  `std_name` varchar(255) DEFAULT NULL,
  `degree` varchar(255) DEFAULT NULL,
  `stream` varchar(255) DEFAULT NULL,
  `mark` double DEFAULT NULL,
  PRIMARY KEY (`std_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stdudent`
--

LOCK TABLES `stdudent` WRITE;
/*!40000 ALTER TABLE `stdudent` DISABLE KEYS */;
INSERT INTO `stdudent` VALUES ('12b0bf23 7481 481c 868c 27bf6a0daaac','Sunder','BE','Computer Science',98),('5290af40 285a 4581 9a69 15ae3846878b','Ram','BCA','Computer Science',64),('54968878 73ca 44af a813 d4688758c1d0','Dipak','Diploma','Ele',62.66),('72ad5ef8 03b0 4527 b94a fff34a96a34c','Shyam','Btech','Computer Science',98),('83aaa288 e094 418b 9a5f 92b88d29b618','Sangram','BA','Arts',62.66),('9b399deb 7eb6 48ad 85ef 5aad2adbe984','Sunder','BE','Computer Science',98),('hbcjdbj56347484','Doll','BA','Arts',65.99),('hbcjdbj563474840','Doll','BA','Arts',65.99);
/*!40000 ALTER TABLE `stdudent` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-21 18:20:05
