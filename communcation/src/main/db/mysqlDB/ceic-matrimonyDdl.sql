/*SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
*/

CREATE DATABASE  IF NOT EXISTS `ceic_matrimony` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ceic_matrimony`;

/*1. country*/
DROP TABLE IF EXISTS `country`;

CREATE TABLE  `country` (
  `i_id` INT(3) UNSIGNED NOT NULL AUTO_INCREMENT,
  `i_country_code` INT(3) NOT NULL,
  `c_country_name` VARCHAR(45) NULL,
  PRIMARY KEY (`i_id`),
  UNIQUE INDEX `i_id_UNIQUE` (`i_id` ASC),
  UNIQUE INDEX `i_country_code_UNIQUE` (`i_country_code` ASC),
  UNIQUE INDEX `c_country_name_UNIQUE` (`c_country_name` ASC))
  ENGINE=InnoDB;

/*2. user_registration*/

DROP TABLE IF EXISTS `user_registration`;
CREATE TABLE  `user_registration` (
  `c_user_id` VARCHAR(10) NOT NULL,
  `c_mobile_no` VARCHAR(15) NOT NULL,
  `c_email_id` VARCHAR(45) NOT NULL,
  `c_user_for` VARCHAR(45) NOT NULL,
  `c_gender` VARCHAR(45) NOT NULL,
  `t_dob` timestamp NOT NULL,
  `c_mother_tongue` VARCHAR(45) NOT NULL,
  `c_cast_division` VARCHAR(45) NOT NULL,
  `c_living_country` VARCHAR(45) NOT NULL,
  `c_login_password` VARCHAR(45) NOT NULL,
  `t_created_date` timestamp NULL,
  `t_last_update_date`  timestamp NULL,
  `t_deleted_date`  timestamp NULL,
  PRIMARY KEY (`c_user_id`),
  UNIQUE INDEX `c_user_id_UNIQUE` (`c_user_id` ASC),
  UNIQUE INDEX `c_mobile_no_UNIQUE` (`c_mobile_no` ASC),
  UNIQUE INDEX `c_email_id_UNIQUE` (`c_email_id` ASC))
ENGINE=InnoDB;

/*3.user_login*/
DROP TABLE IF EXISTS `user_login`;
CREATE TABLE `user_login` (
  `c_user_id` VARCHAR(10) NOT NULL,
  `c_email_id` VARCHAR(45) NOT NULL,
  `c_mobile_no` VARCHAR(45) NOT NULL,
  `c_user_status` VARCHAR(10) NOT NULL,
  `c_login_status` BIT(1) NULL,
  `t_login_time` timestamp NULL,
  `t_logout_time` timestamp NULL,
  PRIMARY KEY (`c_user_id`),
  UNIQUE INDEX `c_user_id_UNIQUE` (`c_user_id` ASC),
  UNIQUE INDEX `c_email_id_UNIQUE` (`c_email_id` ASC),
  UNIQUE INDEX `c_mobile_no_UNIQUE` (`c_mobile_no` ASC))
ENGINE=InnoDB;

/*4.user_location*/
DROP TABLE IF EXISTS `user_location`;
CREATE TABLE `user_location` (
  `c_user_id` VARCHAR(10) NOT NULL,
  `c_city` VARCHAR(20) NULL,
  `c_state` VARCHAR(20) NULL,
  `c_country` VARCHAR(20) NULL,
  `c_citizenship` VARCHAR(20) NULL,
  PRIMARY KEY (`c_user_id`),
  UNIQUE INDEX `c_user_id_UNIQUE` (`c_user_id` ASC))
ENGINE=InnoDB;

/*5.user_profile*/
DROP TABLE IF EXISTS `user_profile`;
CREATE TABLE `user_profile` (
     `c_user_id` VARCHAR(10) NOT NULL,
	 `c_name` VARCHAR(45) NOT NULL,
	  `c_profile_for` VARCHAR(10) NOT NULL,
	  `i_age` INT(2) NOT NULL,
	  `c_height` VARCHAR(20) NOT NULL,
	  `c_religion` VARCHAR(10) NOT NULL,
	  `c_cast` VARCHAR(12) NOT NULL,
	  `c_subcast` VARCHAR(15) NULL,
	  `c_location` VARCHAR(20) NOT NULL,
	  `c_education` VARCHAR(25) NOT NULL,
	  `c_profession` VARCHAR(25) NOT NULL,
	  `c_annual_income` VARCHAR(10) NOT NULL,
	  `c_monthly_income` VARCHAR(10) NOT NULL,
	  `c_description` VARCHAR(500) NOT NULL,
	  `t_created_date` timestamp NOT NULL,
	  `t_last_update_date` timestamp NOT NULL,

  PRIMARY KEY (`c_user_id`),
  UNIQUE INDEX `c_user_id_UNIQUE` (`c_user_id` ASC))
ENGINE=InnoDB;

/*5.user_basic_detail*/
DROP TABLE IF EXISTS `user_basic_details`;
CREATE TABLE `user_basic_detail` (
  `c_user_id` VARCHAR(10) NOT NULL,
  `c_profile_for` VARCHAR(45) NOT NULL,
  `c_name` VARCHAR(45) NOT NULL,
  `c_body_type_complexion` VARCHAR(45) NULL,
  `i_age` INT(2) NOT NULL,
  `c_physical_status` VARCHAR(45) NULL,
  `c_height` VARCHAR(45) NOT NULL,
  `i_weight` INT(3) NULL,
  `c_mother_tongue` VARCHAR(15) NULL,
  `c_marital_status` VARCHAR(15) NULL,
  `c_eating_habits` VARCHAR(15) NULL,
  `c_drinking_habits` VARCHAR(15) NULL,
  `c_smoking_habits` VARCHAR(15) NULL,
  `c_unknown1` VARCHAR(15) NULL,
  `c_unknown2` VARCHAR(15) NULL,
  `c_unknown3` VARCHAR(15) NULL,
  PRIMARY KEY (`c_user_id`),
  UNIQUE INDEX `c_user_id_UNIQUE` (`c_user_id` ASC))
ENGINE=InnoDB;

/*religion_information*/
DROP TABLE IF EXISTS `religion_information`;
CREATE TABLE `religion_information` (
  `c_user_id` VARCHAR(10) NOT NULL,
  `c_religion` VARCHAR(15) NULL,
  `c_cast_subcaste` VARCHAR(15) NULL,
  `c_gothrams` VARCHAR(15) NULL,
  `c_star_rassi` VARCHAR(15) NULL,
  `c_dosh` VARCHAR(15) NULL,
  `c_unknown1` VARCHAR(15) NULL,
  `c_unknown2` VARCHAR(15) NULL,
  PRIMARY KEY (`c_user_id`),
  UNIQUE INDEX `c_user_id_UNIQUE` (`c_user_id` ASC))
ENGINE=InnoDB;

/*7.professional_information*/
DROP TABLE IF EXISTS `professional_information`;
CREATE TABLE `professional_information` (
  `c_user_id` VARCHAR(10) NOT NULL,
  `c_education` VARCHAR(45) NULL,
  `c_college_institution` VARCHAR(45) NULL,
  `c_education_detail` VARCHAR(100) NULL,
  `c_occupation` VARCHAR(45) NULL,
  `c_occupation_detail` VARCHAR(100) NULL,
  `c_employee_in` VARCHAR(45) NULL,
  `c_annual_income` VARCHAR(45) NULL,
  `c_monthly_income` VARCHAR(45) NULL,
  `c_unknown` VARCHAR(45) NULL,
  PRIMARY KEY (`c_user_id`),
  UNIQUE INDEX `c_user_id_UNIQUE` (`c_user_id` ASC))
ENGINE=InnoDB;

/*8.occupation*/
DROP TABLE IF EXISTS `occupation`;
CREATE TABLE `occupation` (
  `i_id` INT(2) UNSIGNED NOT NULL AUTO_INCREMENT,
  `c_occupation` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`i_id`),
  UNIQUE INDEX `i_id_UNIQUE` (`i_id` ASC),
  UNIQUE INDEX `c_occupation_UNIQUE` (`c_occupation` ASC))
ENGINE=InnoDB;

/*9.employee*/
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `i_id` INT(2) UNSIGNED NOT NULL AUTO_INCREMENT,
  `c_employee` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`i_id`),
  UNIQUE INDEX `i_id_UNIQUE` (`i_id` ASC),
  UNIQUE INDEX `c_employee_UNIQUE` (`c_employee` ASC))
ENGINE=InnoDB;

/*10.income*/
DROP TABLE IF EXISTS `income`;

CREATE TABLE `income` (
  `i_id` INT(2) UNSIGNED NOT NULL AUTO_INCREMENT,
  `c_yearly` VARCHAR(10) NOT NULL,
  `c_monthly` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`i_id`),
  UNIQUE INDEX `i_id_UNIQUE` (`i_id` ASC))
ENGINE=InnoDB;

/*11.family_details*/
DROP TABLE IF EXISTS `family_details`;
CREATE TABLE `family_details` (
  `c_user_id` VARCHAR(10) NOT NULL,
  `c_father_status` VARCHAR(45) NULL,
  `c_family_value` VARCHAR(45) NULL,
  `c_mother_status` VARCHAR(45) NULL,
  `c_family_type` VARCHAR(20) NULL,
  `i_no_of_brothers` INT(2) NULL,
  `c_family_status` VARCHAR(20) NULL,
  `i_no_of_sisters` INT(2) NULL,
  `c_about_family` VARCHAR(5000) NULL,
  `c_unknown` VARCHAR(45) NULL,
  PRIMARY KEY (`c_user_id`),
  UNIQUE INDEX `c_user_id_UNIQUE` (`c_user_id` ASC))
ENGINE=InnoDB;

/*12.partner_preference*/
DROP TABLE IF EXISTS `partner_preference`;
CREATE TABLE `partner_preference` (
  `c_user_id` VARCHAR(10) NOT NULL,
  `i_age_from` INT(2) NULL,
  `i_age_to` INT(2) NULL,
  `c_marital_status` VARCHAR(15) NULL,
  `c_physical_status` VARCHAR(15) NULL,
  `c_eating_habits` VARCHAR(15) NULL,
  `c_smoking_habits` VARCHAR(15) NULL,
  `c_drinking_habits` VARCHAR(15) NULL,
  `c_mother_tongue` VARCHAR(15) NULL,
  `c_caste` VARCHAR(30) NULL,
  `c_star` VARCHAR(45) NULL,
  `b_manglik` BIT(1) NULL,
  `c_unknown` VARCHAR(30) NULL,
  PRIMARY KEY (`c_user_id`),
  UNIQUE INDEX `c_user_id_UNIQUE` (`c_user_id` ASC))
ENGINE=InnoDB;

/*12.professional_preferences*/
DROP TABLE IF EXISTS `professional_preferences`;
CREATE TABLE `professional_preferences` (
  `c_user_id` VARCHAR(10) NOT NULL,
  `c_education` VARCHAR(45) NULL,
  `c_occupation` VARCHAR(45) NULL,
  `c_annual_income` VARCHAR(45) NULL,
  `c_unknown` VARCHAR(45) NULL,
  PRIMARY KEY (`c_user_id`),
  UNIQUE INDEX `c_user_id_UNIQUE` (`c_user_id` ASC))
ENGINE=InnoDB;


/*13.users_relation*/
DROP TABLE IF EXISTS `users_relation`;
CREATE TABLE `users_relation` (
	  `c_from_user_id` VARCHAR(10) NOT NULL,
	  `c_to_user_id` VARCHAR(10) NOT NULL,
	  `b_viewed_profile` BIT(1) NULL,
	  `t_viewed_profile_time` timestamp NULL,
	  `b_like` BIT(1) NULL,
	  `t_like_time` timestamp NULL,
	  `b_send_request` BIT(1) NULL,
	  `t_send_request_time` timestamp NULL,
	  `b_accept_request` BIT(1) NULL,
	  `t_accept_request_time` timestamp NULL,
	  `b_viewed_mobile_no` BIT(1) NULL,
	  `t_view_mobile_time` timestamp NULL,
	  `b_viewed_email` BIT(1) NULL,
	  `t_view_email_time` timestamp NULL,
	  `b_send_mail` BIT(1) NULL,
	  `t_send_email_time` timestamp NULL,
	  `b_block` BIT(1) NULL,
	  `c_mail_content` VARCHAR(1000) NULL,
	  `b_request_picks` BIT(1) NULL,
	  `t_request_picks_time` timestamp NULL,
	  `b_respond_picks` BIT(1) NULL,
	  `t_respond_picks_time` timestamp NULL,
	  `b_request_file` BIT(1) NULL,
	  `t_request_file_time` timestamp NULL,
	  `b_respond_file` BIT(1) NULL,
	  `t_respond_file_time` timestamp NULL,
	  `b_request_hadoop` BIT(1) NULL,
	  `t_request_hadoop_time` timestamp NULL,
	  `b_respond_hadoop` BIT(1) NULL,
	  `t_respond_hadoop_time` timestamp NULL,
  PRIMARY KEY (`c_from_user_id`,`c_to_user_id`),
  UNIQUE INDEX `c_from_user_id_c_to_user_id_UNIQUE` (`c_from_user_id`,`c_to_user_id` ASC))
ENGINE=InnoDB;