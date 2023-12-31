CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE employee (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
   `post` varchar(45) DEFAULT NULL, 
   `salary` int   DEFAULT NULL,
   `Branch` varchar(45)  DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Yashashwi','Jaiswal','yashj@gmail.com', "SDE", 45000, "GGN"),
    (2,'Shubhan','Gill','sg77@gmail.com', "SAP", 55000, "GUJ"),
    (3,'Rinku','Singh','rkkkr@gmail.com', "Trainee", 30000, "GGN"),
    (4,'Avesh','Khan','ak55@gmail.com', "Consultant", 70000, "PUNE"),
    (5,'Shreyas','Iyer','iyer96@gmail.com', "SSE", 90000, "GGN");
	

