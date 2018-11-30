/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 10.1.34-MariaDB : Database - bdaac
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bdaac` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bdaac`;

/*Table structure for table `agriculteur` */

DROP TABLE IF EXISTS `agriculteur`;

CREATE TABLE `agriculteur` (
  `idAgriculteur` int(5) NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `domaine` varchar(30) DEFAULT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  `village` varchar(30) DEFAULT NULL,
  `experience` int(3) DEFAULT NULL,
  PRIMARY KEY (`idAgriculteur`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `agriculteur` */

insert  into `agriculteur`(`idAgriculteur`,`nom`,`prenom`,`domaine`,`telephone`,`village`,`experience`) values (1,'KOUEKAM','Alain','Pisciculture','+237696246282','Ntui',10),(2,'MOPELT','Steve','Apiculture','+237696247854','Sa\'a',5),(3,'KOUEKAM','Alain','Pisciculture','+237696246282','Ntui',10),(4,'MOPELT','Steve','Apiculture','+237696247854','Sa\'a',5),(5,'Nana Melong','Romuald','Elevage','691469472','Bafoussam',10),(6,'Kuete','Brandol','Agriculture','691469475','Balatchi',1),(7,'Taboua','Francklin','Elevage','674584125','Bafoussam',2),(8,'Kenne','Celestine','Elevage','676269992','Balatchi',10);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
