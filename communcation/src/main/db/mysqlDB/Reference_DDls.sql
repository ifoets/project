SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `template_engine` ;
CREATE SCHEMA IF NOT EXISTS `template_engine` DEFAULT CHARACTER SET utf8 ;

USE `template_engine` ;

-- -----------------------------------------------------
-- Table `template`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `template`;

CREATE TABLE IF NOT EXISTS `template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  `suppressed` bit(1) DEFAULT NULL,
  `multipart` bit(1) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `moc` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;


-- -----------------------------------------------------
-- Table `subtemplate`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `subtemplate`;

CREATE TABLE IF NOT EXISTS `subtemplate` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  `content` longblob,
  `deleted` bit(1) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `moc` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idSubtemplate_UNIQUE` (`id` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE=InnoDB;


-- -----------------------------------------------------
-- Table `system`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `system`;

CREATE TABLE IF NOT EXISTS `system` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `suppressed` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idSystem_UNIQUE` (`id` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `sub-category`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `sub_category`;

CREATE TABLE IF NOT EXISTS `sub_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `deleted` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idSub-category_UNIQUE` (`id` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `language`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `language`;

CREATE TABLE IF NOT EXISTS `language` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `deleted` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idLanguage_UNIQUE` (`id` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `moc`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `moc`;

CREATE TABLE IF NOT EXISTS `moc` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `deleted` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `brand`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `brand`;

CREATE TABLE IF NOT EXISTS `brand` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `deleted` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idBrand_UNIQUE` (`id` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `supc`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `supc`;

CREATE TABLE IF NOT EXISTS `supc` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `value` BIGINT(20) NOT NULL,
  `deleted` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idSUPC_UNIQUE` (`id` ASC),
  UNIQUE INDEX `value_UNIQUE` (`value` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `seller`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `seller`;

CREATE TABLE IF NOT EXISTS `seller` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `deleted` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idseller_UNIQUE` (`id` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `trigger_type`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `trigger_type`;

CREATE TABLE IF NOT EXISTS `trigger_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idTrigger_UNIQUE` (`id` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pincode`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `pincode`;

CREATE TABLE IF NOT EXISTS `pincode` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `value` BIGINT(20) NOT NULL,
  `deleted` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idpincode_UNIQUE` (`id` ASC),
  UNIQUE INDEX `value_UNIQUE` (`value` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `attribute`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `rule_attributes`;

CREATE TABLE `rule_attributes` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `attribute_type` varchar(100) NOT NULL,
  `deleted` bit(1) NOT NULL,
  `scope` int(11) NOT NULL,
  `trigger_type_id` bigint(20) NOT NULL,
  `system_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ATTRIBUTE_COMPOSITE` (`name`,`system_id`,`trigger_type_id`),
  KEY `fk_rule_attributes_1_idx` (`system_id`),
  KEY `fk_rule_attributes_2_idx` (`trigger_type_id`),
  CONSTRAINT `fk_rule_attributes_1` FOREIGN KEY (`system_id`) REFERENCES `system` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_rule_attributes_2` FOREIGN KEY (`trigger_type_id`) REFERENCES `trigger_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- -----------------------------------------------------
-- Table `subtemplate_system_map`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `subtemplate_system_map`;

CREATE TABLE IF NOT EXISTS `subtemplate_system_map` (
  `subtemplate_id` bigint(20) NOT NULL,
  `system_id` bigint(20) NOT NULL,
  PRIMARY KEY (`subtemplate_id`,`system_id`),
  KEY `FK_lhqnljwaecouxqmmjh2cbl7d0` (`system_id`),
  CONSTRAINT `FK_6cysrf2mmwtqeg45yoyjc7ycs` FOREIGN KEY (`subtemplate_id`) REFERENCES `subtemplate` (`id`),
  CONSTRAINT `FK_lhqnljwaecouxqmmjh2cbl7d0` FOREIGN KEY (`system_id`) REFERENCES `system` (`id`)
) ENGINE=InnoDB;

-- -----------------------------------------------------
-- Table `system_trigger_map`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `system_trigger_map`;

CREATE TABLE IF NOT EXISTS `system_trigger_map` (
  `system_id` bigint(20) NOT NULL,
  `trigger_type_id` bigint(20) NOT NULL,
  `suppressed` boolean NOT NULL DEFAULT false,
  PRIMARY KEY (`system_id`,`trigger_type_id`),
  CONSTRAINT `FK_9nuroraoc25ywokeg85dyo8h5` FOREIGN KEY (`system_id`) REFERENCES `system` (`id`)
) ENGINE=InnoDB;

-- -----------------------------------------------------
-- Table `template_subtemplate`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `template_subtemplate`;

CREATE TABLE `template_subtemplate` (
  `template_id` bigint(20) NOT NULL,
  `subtemplates_id` bigint(20) NOT NULL,
  CONSTRAINT `FK_876v8fbf9m4lnhfljwwbr8epk` FOREIGN KEY (`template_id`) REFERENCES `template` (`id`),
  CONSTRAINT `FK_udgyg7jnn851q6u7fs0778ha` FOREIGN KEY (`subtemplates_id`) REFERENCES `subtemplate` (`id`)
) ENGINE=InnoDB;

DELIMITER //
CREATE PROCEDURE CreateGlobalSystemAndTrigger()
 BEGIN
	 DECLARE gsystem_name VARCHAR(45) DEFAULT 'GLOBAL_SYSTEM';
	 DECLARE gtrigger_name VARCHAR(45) DEFAULT 'GLOBAL_TRIGGER';
	 DECLARE global_system_id INT DEFAULT 0;
	 DECLARE global_trigger_id INT DEFAULT 0;
 
	 INSERT INTO `template_engine`.`system`
	 (`name`,`suppressed`)
	 VALUES
	 (gsystem_name,0);

	 INSERT INTO `template_engine`.`trigger_type`
	 (`name`)
	 VALUES
	 (gtrigger_name);
	 
	 SELECT s.id INTO global_system_id
	 FROM `template_engine`.`system` s
	 WHERE s.name = gsystem_name;
 
	 SELECT t.id INTO global_trigger_id
	 FROM `template_engine`.`trigger_type` t
	 WHERE t.name = gtrigger_name;
 
	 INSERT into `template_engine`.`system_trigger_map`
	 VALUES (global_system_id, global_trigger_id, 0);
	 
 END //
DELIMITER ;

CALL CreateGlobalSystemAndTrigger();

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
