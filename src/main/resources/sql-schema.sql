drop schema ims_project;
CREATE SCHEMA IF NOT EXISTS `ims_project`;
USE `ims_project` ;
CREATE TABLE IF NOT EXISTS `ims_project`.`Customers` (
    `customer_ID` INT(11) NOT NULL AUTO_INCREMENT,
    `customer_name` VARCHAR(40) NULL DEFAULT NULL,
    `email` VARCHAR(40) NULL DEFAULT NULL,
    `password` VARCHAR(40) NULL DEFAULT NULL,
    PRIMARY KEY (`customer_ID`)
);

CREATE TABLE IF NOT EXISTS `ims_project`.`Items` (
    `item_ID` int primary key NOT NULL AUTO_INCREMENT,
    `item varchar` (30) NOT NULL,
    `quantity` int NOT NULL,
    `price` double(10,2)
);

CREATE TABLE IF NOT EXISTS `ims_project`.`Orders`(
    `order_ID` int primary key NOT NULL AUTO_INCREMENT,
    `customer_ID` int(11) NOT NULL,
    `date_placed` date NOT NULL, 
    FOREIGN KEY (`customer_id`) REFERENCES Customers(`customer_id`)
);

CREATE TABLE IF NOT EXISTS `ims_project`.`orderline`(
    `order_ID` int(11) NOT NULL, 
    `item_ID` int(11) NOT NULL, 
    `quantity_ordered` int(11) NOT NULL, 
    FOREIGN KEY (`order_ID`) REFERENCES Orders(`order_ID), FOREIGN KEY (item_ID) REFERENCES Items(`item_ID`));