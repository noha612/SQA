-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: sqa_test
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `diem`
--

DROP TABLE IF EXISTS `diem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diem` (
  `iddiem` int NOT NULL AUTO_INCREMENT,
  `ma_hoc_phan` varchar(45) NOT NULL,
  `ma_sinh_vien` varchar(45) NOT NULL,
  `hoc_ky` varchar(45) NOT NULL,
  `pCC` int DEFAULT NULL,
  `pKT` int DEFAULT NULL,
  `pTH` int DEFAULT NULL,
  `pBT` int DEFAULT NULL,
  `pThi` int DEFAULT NULL,
  `CC` double DEFAULT NULL,
  `KT` double DEFAULT NULL,
  `TH` double DEFAULT NULL,
  `BT` double DEFAULT NULL,
  `Thi_L1` double DEFAULT NULL,
  `Thi_L2` double DEFAULT NULL,
  PRIMARY KEY (`iddiem`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diem`
--

LOCK TABLES `diem` WRITE;
/*!40000 ALTER TABLE `diem` DISABLE KEYS */;
INSERT INTO `diem` VALUES (9,'BAS1106','B16DCCN001','20161',20,30,0,0,50,10,5,0,0,2,NULL),(10,'BAS1203','B16DCCN001','20161',10,10,0,10,70,8,8,0,9,4,NULL),(11,'BAS1111','B16DCCN001','20161',30,20,0,0,50,7,4,0,0,2,4),(12,'INT1154','B16DCCN001','20161',10,10,10,0,70,7,7,8,0,7,NULL),(13,'BAS1201','B16DCCN001','20161',10,10,0,10,70,9,5,0,7,4,NULL),(15,'INT1155','B16DCCN001','20162',10,10,10,0,70,9,5,5,0,4,NULL),(16,'BAS1107','B16DCCN001','20162',20,30,0,0,50,8,1,0,0,6,NULL),(17,'BAS1112','B16DCCN001','20162',30,20,0,0,50,0,0,0,0,0,NULL),(18,'BAS1224','B16DCCN001','20162',10,10,20,0,60,9.5,5.5,8,0,5.5,NULL),(19,'BAS1204','B16DCCN001','20162',10,10,0,10,70,7,7,0,8,8,NULL),(20,'BAS1141','B16DCCN001','20162',0,0,0,0,100,0,0,0,0,0,NULL),(21,'BAS1226','B16DCCN001','20162',10,10,0,10,70,7,5,0,6,6.5,NULL),(22,'BAS1112','B16DCCN001','20163',30,20,0,0,50,9,5,0,0,7,NULL);
/*!40000 ALTER TABLE `diem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoc_phan`
--

DROP TABLE IF EXISTS `hoc_phan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoc_phan` (
  `idhoc_phan` int NOT NULL AUTO_INCREMENT,
  `ma_hoc_phan` varchar(45) NOT NULL,
  `ten_hoc_phan` varchar(255) NOT NULL,
  `so_tin_chi` int DEFAULT NULL,
  `mon_tich_luy` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idhoc_phan`),
  UNIQUE KEY `ma_hoc_phan_UNIQUE` (`ma_hoc_phan`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoc_phan`
--

LOCK TABLES `hoc_phan` WRITE;
/*!40000 ALTER TABLE `hoc_phan` DISABLE KEYS */;
INSERT INTO `hoc_phan` VALUES (9,'BAS1106','Giáo dục thể chất 1	',2,'Không'),(10,'BAS1203','Giải tích 1	',3,'Có'),(11,'BAS1111','Những nguyên lý cơ bản của Chủ nghĩa Mác Lênin 1',2,'Có'),(12,'INT1154','Tin học cơ sở 1',2,'Có'),(13,'BAS1201','Đại số	',3,'Có'),(14,'INT1155','Tin học cơ sở 2',2,'Có'),(15,'BAS1107','Giáo dục thể chất 2	',2,'Không'),(16,'BAS1112','Những nguyên lý cơ bản của Chủ nghĩa Mác Lênin 2',3,'Có'),(17,'BAS1224','Vật lý 1 và thí nghiệm	',4,'Có'),(18,'BAS1204','Giải tích 2	',3,'Có'),(19,'BAS1141','Tiếng anh A11	',3,'Có'),(20,'BAS1226','Xác suất thống kê	',2,'Có');
/*!40000 ALTER TABLE `hoc_phan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinh_vien`
--

DROP TABLE IF EXISTS `sinh_vien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinh_vien` (
  `idsinh_vien` int NOT NULL AUTO_INCREMENT,
  `ma_sinh_vien` varchar(45) NOT NULL,
  `mat_khau` varchar(235) NOT NULL,
  `ho_ten` varchar(255) NOT NULL,
  `lop` varchar(45) DEFAULT NULL,
  `khoa_hoc` varchar(45) DEFAULT NULL,
  `he_dao_tao` varchar(45) DEFAULT NULL,
  `khoa` varchar(45) DEFAULT NULL,
  `nganh` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idsinh_vien`),
  UNIQUE KEY `ma_sinh_vien_UNIQUE` (`ma_sinh_vien`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinh_vien`
--

LOCK TABLES `sinh_vien` WRITE;
/*!40000 ALTER TABLE `sinh_vien` DISABLE KEYS */;
INSERT INTO `sinh_vien` VALUES (1,'B16DCCN001','8f2a0628a900bfa3d2f073c008e8f1324759bed2c5ce625c8ba55d54523174a7','Ngô Bá Khá','D16CNPM3','2016 - 2021','Đại học chính quy','Công nghệ thông tin','Công nghệ phần mềm'),(2,'B16DCCN202','8f2a0628a900bfa3d2f073c008e8f1324759bed2c5ce625c8ba55d54523174a7','Ngô Bá Bảnh','D16CNPM3','2016 - 2021','Đại học chính quy','Công nghệ thông tin','Công nghệ phần mềm');
/*!40000 ALTER TABLE `sinh_vien` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-14 17:49:20
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: btlqa
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `diem`
--

DROP TABLE IF EXISTS `diem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diem` (
  `iddiem` int NOT NULL AUTO_INCREMENT,
  `ma_hoc_phan` varchar(45) NOT NULL,
  `ma_sinh_vien` varchar(45) NOT NULL,
  `hoc_ky` varchar(45) NOT NULL,
  `pCC` int DEFAULT NULL,
  `pKT` int DEFAULT NULL,
  `pTH` int DEFAULT NULL,
  `pBT` int DEFAULT NULL,
  `pThi` int DEFAULT NULL,
  `CC` double DEFAULT NULL,
  `KT` double DEFAULT NULL,
  `TH` double DEFAULT NULL,
  `BT` double DEFAULT NULL,
  `Thi_L1` double DEFAULT NULL,
  `Thi_L2` double DEFAULT NULL,
  PRIMARY KEY (`iddiem`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diem`
--

LOCK TABLES `diem` WRITE;
/*!40000 ALTER TABLE `diem` DISABLE KEYS */;
INSERT INTO `diem` VALUES (1,'INT1154','B16DCCN001','20161',10,10,10,0,70,10,8,8,NULL,7,NULL),(2,'BAS1111','B16DCCN001','20161',30,20,0,0,50,9,7.5,NULL,NULL,9,NULL);
/*!40000 ALTER TABLE `diem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoc_phan`
--

DROP TABLE IF EXISTS `hoc_phan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoc_phan` (
  `idhoc_phan` int NOT NULL AUTO_INCREMENT,
  `ma_hoc_phan` varchar(45) NOT NULL,
  `ten_hoc_phan` varchar(255) NOT NULL,
  `so_tin_chi` int DEFAULT NULL,
  `mon_tich_luy` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idhoc_phan`),
  UNIQUE KEY `ma_hoc_phan_UNIQUE` (`ma_hoc_phan`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoc_phan`
--

LOCK TABLES `hoc_phan` WRITE;
/*!40000 ALTER TABLE `hoc_phan` DISABLE KEYS */;
INSERT INTO `hoc_phan` VALUES (1,'INT1154','Tin học cơ sở 1',2,'Có'),(2,'BAS1111','Những nguyên lý cơ bản của Chủ nghĩa Mác Lênin 1',2,'Có');
/*!40000 ALTER TABLE `hoc_phan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinh_vien`
--

DROP TABLE IF EXISTS `sinh_vien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinh_vien` (
  `idsinh_vien` int NOT NULL AUTO_INCREMENT,
  `ma_sinh_vien` varchar(45) NOT NULL,
  `mat_khau` varchar(45) NOT NULL,
  `lop` varchar(45) DEFAULT NULL,
  `khoa_hoc` varchar(45) DEFAULT NULL,
  `he_dao_tao` varchar(45) DEFAULT NULL,
  `khoa` varchar(45) DEFAULT NULL,
  `nganh` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idsinh_vien`),
  UNIQUE KEY `ma_sinh_vien_UNIQUE` (`ma_sinh_vien`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinh_vien`
--

LOCK TABLES `sinh_vien` WRITE;
/*!40000 ALTER TABLE `sinh_vien` DISABLE KEYS */;
INSERT INTO `sinh_vien` VALUES (1,'B16DCCN001','010198','D16CNPM3','2016 - 2021','Đại học chính quy','Công nghệ thông tin','Công nghệ phần mềm');
/*!40000 ALTER TABLE `sinh_vien` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-14 17:49:21
