DROP DATABASE FoodShop;
CREATE DATABASE FoodShop;

USE FoodShop;

CREATE TABLE Customer(
	cid VARCHAR(10) NOT NULL,
	name VARCHAR(30),
	contct VARCHAR(12),
	address VARCHAR(30),
	CONSTRAINT PRIMARY KEY (cid)
);

CREATE TABLE Orders(
	id VARCHAR(6) NOT NULL,
	date DATE,
	customerId VARCHAR(10) NOT NULL,
	CONSTRAINT PRIMARY KEY (id),
	CONSTRAINT FOREIGN KEY(customerId) REFERENCES Customer(cid) on update cascade on delete cascade
);

CREATE TABLE Item(
	code VARCHAR(6) NOT NULL,
	description VARCHAR(50),
	unitPrice DECIMAL(8,2),
	qtyOnHand INT(5),
	CONSTRAINT PRIMARY KEY (code)
);

CREATE TABLE OrderDetail(
	orderId VARCHAR(6) NOT NULL,
	itemCode VARCHAR(6) NOT NULL,
	qty INT(11),
	unitPrice DECIMAL(8,2),
	CONSTRAINT PRIMARY KEY (orderId,itemCode),
	CONSTRAINT FOREIGN KEY (orderId) REFERENCES Orders(id) on update cascade on delete cascade,
	CONSTRAINT FOREIGN KEY (itemCode) REFERENCES Item(code)on update cascade on delete cascade
);

