drop schema ims;
CREATE SCHEMA IF NOT EXISTS `ims`;
USE `ims` ;
CREATE TABLE IF NOT EXISTS `ims`.`Customers` (
    `id` INT(11) UNIQUE NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) NULL DEFAULT NULL,
    `surname` VARCHAR(40) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`Items` (
    `item_ID` int UNIQUE NOT NULL AUTO_INCREMENT,
    `item` varchar (30) NOT NULL,
    `quantity` int NOT NULL,
    `price` double(10,2),
    PRIMARY KEY (`item_ID`)
);

CREATE TABLE IF NOT EXISTS `ims`.`Orders`(
    `order_ID` int UNIQUE NOT NULL AUTO_INCREMENT,
    `customer_ID` int(11) NOT NULL,
    `date_placed` date NOT NULL, 
    `total` double NOT NULL,
    PRIMARY KEY (`order_ID`),
    CONSTRAINT `customer_ID` FOREIGN KEY (`customer_ID`) REFERENCES `ims`.`Customers`(`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`orderline`(
    `orderline_ID` int(11) UNIQUE NOT NULL AUTO_INCREMENT,
    `order_ID` int(11) NOT NULL, 
    `item_ID` int(11) NOT NULL, 
    `quantity_ordered` int(11) NOT NULL, 
    PRIMARY KEY (`orderline_ID`),
    CONSTRAINT `order_ID` FOREIGN KEY (`order_ID`) REFERENCES `ims`.`Orders`(`order_ID`), 
    CONSTRAINT `item_ID` FOREIGN KEY (`item_ID`) REFERENCES `ims`.`Items`(`item_ID`)
);