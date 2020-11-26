drop schema ims;
CREATE SCHEMA IF NOT EXISTS `ims`;
USE `ims` ;
CREATE TABLE IF NOT EXISTS `ims`.`Customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) NULL DEFAULT NULL,
    `surname` VARCHAR(40) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`Items` (
    `item_ID` int primary key NOT NULL AUTO_INCREMENT,
    `item varchar` (30) NOT NULL,
    `quantity` int NOT NULL,
    `price` double(10,2)
);

CREATE TABLE IF NOT EXISTS `ims`.`Orders`(
    `order_ID` int primary key NOT NULL AUTO_INCREMENT,
    `customer_ID` int(11) NOT NULL,
    `date_placed` date NOT NULL, 
    `total` double NOT NULL,
    FOREIGN KEY (`customer_id`) REFERENCES Customers(`customer_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`orderline`(
    `order_ID` int(11) NOT NULL, 
    `item_ID` int(11) NOT NULL, 
    `quantity_ordered` int(11) NOT NULL, 
    FOREIGN KEY (`order_ID`) REFERENCES Orders(`order_ID), FOREIGN KEY (item_ID) REFERENCES Items(`item_ID`));