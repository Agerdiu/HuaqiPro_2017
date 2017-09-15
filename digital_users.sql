/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : digital

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-09-14 15:36:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
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
  `arrearage` double DEFAULT '0',
  `badActions` double DEFAULT '0',
  `layPayment` double DEFAULT '0',
  `privateLending` double DEFAULT '0',
  `evaluateResult` double DEFAULT '0',
  `paydebtAbilityScore` double DEFAULT '0',
  `paydebtAbilityLevel` varchar(3) DEFAULT '0',
  `paydebtPotentialScore` double DEFAULT '0',
  `paydebtPotentialLevel` varchar(3) DEFAULT '0',
  `paydebtSystemScore` double DEFAULT '0',
  `paydebtSystemLevel` varchar(3) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;