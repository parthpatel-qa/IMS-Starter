
INSERT INTO `ims`.`Customers` (`first_name`, `surname`) VALUES ('Jordan', 'Harrison');
INSERT INTO `ims`.`Items` (`name`, `quantity`, `price`) VALUES ('chair', '401', '4.99');
INSERT INTO `ims`.`Orders` (`customer_ID`, `date_placed`, `total`) VALUES ('1', '1996-04-04', '4.99');
INSERT INTO `ims`.`orderline` (`order_ID`, `item_ID`, `quantity_ordered`) VALUES ('1', '1', '1');

INSERT INTO `ims`.`Customers` (`first_name`, `surname`) VALUES ('Bruce', 'Wayne');
INSERT INTO `ims`.`Items` (`name`, `quantity`, `price`) VALUES ('suit', '1000', '500.00');
INSERT INTO `ims`.`Orders` (`customer_ID`, `date_placed`, `total`) VALUES ('2', '1997-04-04', '500.00');
INSERT INTO `ims`.`orderline` (`order_ID`, `item_ID`, `quantity_ordered`) VALUES ('2', '2', '1');

INSERT INTO `ims`.`Customers` (`first_name`, `surname`) VALUES ('Barry', 'Allen');
INSERT INTO `ims`.`Items` (`name`, `quantity`, `price`) VALUES ('toy car', '40', '9.99');
INSERT INTO `ims`.`Orders` (`customer_ID`, `date_placed`, `total`) VALUES ('3', '1998-04-04', '9.99');
INSERT INTO `ims`.`orderline` (`order_ID`, `item_ID`, `quantity_ordered`) VALUES ('3', '3', '1');


INSERT INTO `ims`.`Customers` (`first_name`, `surname`) VALUES ('Oliver', 'Queen');
INSERT INTO `ims`.`Items` (`name`, `quantity`, `price`) VALUES ('table', '560', '54.00');
INSERT INTO `ims`.`Orders` (`customer_ID`, `date_placed`, `total`) VALUES ('4', '1999-04-04', '54.00');
INSERT INTO `ims`.`orderline` (`order_ID`, `item_ID`, `quantity_ordered`) VALUES ('4', '4', '1');
