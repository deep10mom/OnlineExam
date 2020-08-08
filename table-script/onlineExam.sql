CREATE DATABASE `examportal` /*!40100 DEFAULT CHARACTER SET latin1 */;
DROP TABLE IF EXISTS `examportal`.`course_master`;
CREATE TABLE  `examportal`.`course_master` (
  `course` varchar(45) NOT NULL,
  `course_description` varchar(500) NOT NULL,
  `application_status` varchar(45) NOT NULL,
  PRIMARY KEY (`course`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
DROP TABLE IF EXISTS `examportal`.`login_master`;
CREATE TABLE  `examportal`.`login_master` (
  `userid` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
DROP TABLE IF EXISTS `examportal`.`question_master`;
CREATE TABLE  `examportal`.`question_master` (
  `course` varchar(45) NOT NULL,
  `question` varchar(500) NOT NULL,
  `opt1` varchar(500) NOT NULL,
  `opt2` varchar(500) NOT NULL,
  `opt3` varchar(500) NOT NULL,
  `opt4` varchar(500) NOT NULL,
  `answer` varchar(500) NOT NULL,
  PRIMARY KEY (`course`,`question`),
  CONSTRAINT `FK_question_master_1` FOREIGN KEY (`course`) REFERENCES `course_master` (`course`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
DROP TABLE IF EXISTS `examportal`.`re_attempt`;
CREATE TABLE  `examportal`.`re_attempt` (
  `userid` varchar(45) NOT NULL,
  `course` varchar(45) NOT NULL,
  `course_description` varchar(45) NOT NULL,
  PRIMARY KEY (`userid`,`course`),
  KEY `FK_re_attempt_2` (`course`),
  CONSTRAINT `FK_re_attempt_1` FOREIGN KEY (`userid`) REFERENCES `login_master` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_re_attempt_2` FOREIGN KEY (`course`) REFERENCES `course_master` (`course`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
DROP TABLE IF EXISTS `examportal`.`result`;
CREATE TABLE  `examportal`.`result` (
  `sl.no` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userid` varchar(45) NOT NULL,
  `course` varchar(45) NOT NULL,
  `date` datetime NOT NULL,
  `marks` int(10) unsigned NOT NULL,
  PRIMARY KEY (`sl.no`),
  KEY `FK_result_1` (`userid`),
  KEY `FK_result_2` (`course`),
  CONSTRAINT `FK_result_1` FOREIGN KEY (`userid`) REFERENCES `login_master` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_result_2` FOREIGN KEY (`course`) REFERENCES `course_master` (`course`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;
DROP TABLE IF EXISTS `examportal`.`user_course_mapping`;
CREATE TABLE  `examportal`.`user_course_mapping` (
  `userid` varchar(45) NOT NULL,
  `course` varchar(45) NOT NULL,
  `exam_status` varchar(45) NOT NULL,
  `approval_status` varchar(45) NOT NULL,
  PRIMARY KEY (`userid`,`course`),
  KEY `FK_user_course_mapping_2` (`course`),
  CONSTRAINT `FK_user_course_mapping_1` FOREIGN KEY (`userid`) REFERENCES `login_master` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_user_course_mapping_2` FOREIGN KEY (`course`) REFERENCES `course_master` (`course`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
DROP TABLE IF EXISTS `examportal`.`userinfo`;
CREATE TABLE  `examportal`.`userinfo` (
  `userid` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `age` int(3) unsigned NOT NULL,
  `address` varchar(500) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contact` varchar(45) NOT NULL,
  PRIMARY KEY (`userid`),
  CONSTRAINT `FK_userinfo_1` FOREIGN KEY (`userid`) REFERENCES `login_master` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

