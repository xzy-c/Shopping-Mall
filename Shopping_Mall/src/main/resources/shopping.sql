

insert into Big_Cate values (default ,'abc');

insert into Small_Cate values (default ,1 , 'bcd');

insert into Goods (goods_Id, Small_Cate_ID, goodsName, unitPrice, commentsNumber, picture, descr) VALUES
(1,1,'ccc',100.00,0,'www.baidu.com','this is a goods!');

insert into user (user_Id, user_Name, user_Password, user_Email, user_Tel, user_Birth, user_Creat, user_Pic, user_Real) VALUES
(default ,'test','123123','123@qq.com','123123',now(),now(),'www.baidu.com','realname');

insert into shopGoods_Form (shop_Id, goods_Id, stock, volume) VALUES (1,1,100,1000);