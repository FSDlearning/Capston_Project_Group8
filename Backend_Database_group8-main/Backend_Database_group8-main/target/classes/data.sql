create database `resteasy` ;
use `resteasy` ;
drop database resteasy;
------------------------------------------------------------------------------------
--
-- Table structure for table `Customer`
--
------------------------------------------------------------------------------------

create table Customer(`Email`	VARCHAR(50) NOT NULL,`First_Name`  VARCHAR(50)  NOT NULL,
`Last_Name`  VARCHAR(50) NOT NULL,`Password`  VARCHAR(50) NOT NULL,primary key (`Email`));
insert into customer values('s@gmail.com','s','p','sp');
insert into customer values('p@gmail.com','s','p','a');
insert into customer values('c@gmail.com','s','p','b');

select * from Customer ;
drop table Customer ;
------------------------------------------------------------------------------------
--
-- Table structure for table `Product`
--
------------------------------------------------------------------------------------


create table Product(`Product_Id` INT NOT NULL AUTO_INCREMENT,`Resturant_Name`  VARCHAR(50)  NOT NULL,
`Price`  INT NOT NULL,`Image_Url`  VARCHAR(50) ,`Product_Name` VARCHAR(50) NOT NULL,primary key (`Product_Id`));

insert into Product values(1,'AdiGas',70,'Burger.jpg','Burger');
insert into Product values(2,'AdiGas',90,'EggRoll.jpg','EggRoll');
insert into Product values(3,'AdiGas',130,'FishFry.jpg','FishFry');
insert into Product values(4,'AdiGas',150,'GajarKaHalwa.jpg','GajarKaHalwa');
insert into Product values(5,'AdiGas',50,'IceCream.jpg','IceCream');
insert into Product values(6,'AdiGas',70,'Momos.jpg','Momos');
insert into Product values(7,'PunjabiRasoi',290,'ChickenBiryani.jpg','ChickenBiryani');
insert into Product values(8,'PunjabiRasoi',300,'ChickenPizza.jpg','ChickenPizza');
insert into Product values(9,'PunjabiRasoi',170,'ChawalKadhi.jpg','ChawalKadhi');
insert into Product values(10,'PunjabiRasoi',150,'Rasgulla.jpg','Rasgulla');
insert into Product values(11,'PunjabiRasoi',370,'ChickenCurry.jpg','ChickenCurry');
insert into Product values(12,'PunjabiRasoi',180,'ChawalRajma.jpg','ChawalRajma');
insert into Product values(13,'PunjabiRasoi',410,'ChickenLollipop.jpg','ChickenLollipop');
insert into Product values(14,'RotiGhar',75,'TandooriRoti.jpg','TandooriRoti');
insert into Product values(15,'RotiGhar',370,'ChickenCurry.jpg','ChickenCurry');
insert into Product values(16,'RotiGhar',50,'Naan.jpg','Naan');
insert into Product values(17,'RotiGhar',140,'EggCurry.jpg','EggCurry');
insert into Product values(18,'RotiGhar',40,'TawaRoti.jpg','TawaRoti');
insert into Product values(19,'RotiGhar',170,'PannerTikka.jpg','PannerTikka');
insert into Product values(20,'Udupi',270,'Pizza.jpg','Pizza');
insert into Product values(21,'Udupi',110,'MasalaDosa.jpg','MasalaDosa');
insert into Product values(22,'Udupi',160,'Gulabjamun.jpg','Gulabjamun');
insert into Product values(23,'Udupi',150,'EggBiryani.jpg','EggBiryani');
insert into Product values(24,'Udupi',70,'Momos.jpg','Momos');




drop table Product;
select * from Product ;

------------------------------------------------------------------------------------
--
-- Table structure for table `Address`
--
------------------------------------------------------------------------------------

create table Address(`Address_Id` INT NOT NULL AUTO_INCREMENT,`City` VARCHAR(50) NOT NULL,
`Country` VARCHAR(50) NOT NULL,`State` VARCHAR(50) NOT NULL,`Street` VARCHAR(50) NOT NULL,`Zip_Code` VARCHAR(10) NOT NULL,
primary key (`Address_Id`));

drop table Address;
select * from Address ;

insert into Address values(2,'Dbg','India','Bihar','Tower Chowk','846001');
------------------------------------------------------------------------------------
--
-- Table structure for table `Order_Customer`
--
------------------------------------------------------------------------------------
create table Order_Customer(`Order_Customer_Id`INT NOT NULL AUTO_INCREMENT,`First_Name`  VARCHAR(50)  NOT NULL,
`Last_Name`  VARCHAR(50) NOT NULL,`Email` varchar(50) NOT NULL,primary key (`Order_Customer_Id`));

insert into Order_Customer values(1,'A','B','A@gmail.com');

select * from Order_Customer ;
drop table Order_Customer;
------------------------------------------------------------------------------------
--
-- Table structure for table `Orders`
--
------------------------------------------------------------------------------------
create table Orders(`Order_Id` INT NOT NULL AUTO_INCREMENT, `Total_Quantity`  INT,`Total_Price`  DOUBLE, `Address_Id` INT,
`Order_Customer_Id` INT ,primary key (`Order_Id`),FOREIGN KEY (`Address_Id`) REFERENCES Address(`Address_Id`),
FOREIGN KEY (`Order_Customer_Id`) REFERENCES Order_Customer(`Order_Customer_Id`)); 

insert into Orders values(1,1,234.00,2,1);

select * from Orders ;
drop table Orders;
------------------------------------------------------------------------------------
--
-- Table structure for table `Order_Item`
--
------------------------------------------------------------------------------------

create table Order_Item(`Order_Item_Id` INT NOT NULL AUTO_INCREMENT,`Order_Id` INT NOT NULL,`Product_Id` INT NOT NULL,`Quantity` INT NOT NULL,
FOREIGN KEY (`Order_Id`) REFERENCES Orders(`Order_Id`),FOREIGN KEY (`Product_Id`) REFERENCES Product(`Product_Id`),primary key (`Order_Item_Id`));

insert into Order_Item values(1,1,1,3);

select * from Order_Item ;   
drop table Order_Item; 





 