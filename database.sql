ALTER TABLE `sprint2`.`product` 
CHANGE COLUMN `description` `description` LONGTEXT NULL DEFAULT NULL;

INSERT INTO `sprint2`.`category` (`id`, `name`) VALUES ('1', 'Apple');
INSERT INTO `sprint2`.`category` (`id`, `name`) VALUES ('2', 'Samsung');
INSERT INTO `sprint2`.`category` (`id`, `name`) VALUES ('3', 'Xiaomi');
INSERT INTO `sprint2`.`category` (`id`, `name`) VALUES ('4', 'Oppo');

INSERT INTO `sprint2`.`color` (`id`, `name`) VALUES ('1', 'Đen');
INSERT INTO `sprint2`.`color` (`id`, `name`) VALUES ('2', 'Đỏ');
INSERT INTO `sprint2`.`color` (`id`, `name`) VALUES ('3', 'Xanh lam');
INSERT INTO `sprint2`.`color` (`id`, `name`) VALUES ('4', 'Trắng');
INSERT INTO `sprint2`.`color` (`id`, `name`) VALUES ('5', 'Vàng');
INSERT INTO `sprint2`.`color` (`id`, `name`) VALUES ('6', 'Xanh đen');
INSERT INTO `sprint2`.`color` (`id`, `name`) VALUES ('7', 'Tím');
INSERT INTO `sprint2`.`color` (`id`, `name`) VALUES ('8', 'Cam');

INSERT INTO `sprint2`.`storage_capacity` (`id`, `name`) VALUES ('1', '64GB');
INSERT INTO `sprint2`.`storage_capacity` (`id`, `name`) VALUES ('2', '128GB');
INSERT INTO `sprint2`.`storage_capacity` (`id`, `name`) VALUES ('3', '256GB');
INSERT INTO `sprint2`.`storage_capacity` (`id`, `name`) VALUES ('4', '512GB');
INSERT INTO `sprint2`.`storage_capacity` (`id`, `name`) VALUES ('5', '1TB');

INSERT INTO `sprint2`.`user_type` (`id`, `name`) VALUES ('1', 'Kim cương');
INSERT INTO `sprint2`.`user_type` (`id`, `name`) VALUES ('2', 'Bạch kim');
INSERT INTO `sprint2`.`user_type` (`id`, `name`) VALUES ('3', 'Vàng');
INSERT INTO `sprint2`.`user_type` (`id`, `name`) VALUES ('4', 'Bạc');

INSERT INTO `sprint2`.`account` (`id`) VALUES ('1');
INSERT INTO `sprint2`.`account` (`id`) VALUES ('2');
INSERT INTO `sprint2`.`account` (`id`) VALUES ('3');
INSERT INTO `sprint2`.`account` (`id`) VALUES ('4');
INSERT INTO `sprint2`.`account` (`id`) VALUES ('5');
INSERT INTO `sprint2`.`account` (`id`) VALUES ('6');
INSERT INTO `sprint2`.`account` (`id`) VALUES ('7');
INSERT INTO `sprint2`.`account` (`id`) VALUES ('8');
INSERT INTO `sprint2`.`account` (`id`) VALUES ('9');

INSERT INTO `sprint2`.`role` (`id`, `name`) VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `sprint2`.`role` (`id`, `name`) VALUES ('2', 'ROLE_MEMBER');

INSERT INTO `sprint2`.`account_role` (`id`, `account_id`, `role_id`) VALUES ('1', '1', '1');
INSERT INTO `sprint2`.`account_role` (`id`, `account_id`, `role_id`) VALUES ('2', '2', '1');
INSERT INTO `sprint2`.`account_role` (`id`, `account_id`, `role_id`) VALUES ('3', '3', '2');
INSERT INTO `sprint2`.`account_role` (`id`, `account_id`, `role_id`) VALUES ('4', '4', '2');
INSERT INTO `sprint2`.`account_role` (`id`, `account_id`, `role_id`) VALUES ('5', '5', '2');
INSERT INTO `sprint2`.`account_role` (`id`, `account_id`, `role_id`) VALUES ('6', '6', '2');
INSERT INTO `sprint2`.`account_role` (`id`, `account_id`, `role_id`) VALUES ('7', '7', '2');
INSERT INTO `sprint2`.`account_role` (`id`, `account_id`, `role_id`) VALUES ('8', '8', '2');
INSERT INTO `sprint2`.`account_role` (`id`, `account_id`, `role_id`) VALUES ('9', '9', '2');

INSERT INTO `sprint2`.`address` (`id`, `city`, `country`, `detail_address`, `district`, `town`) VALUES ('1', 'Đà Nẵng', 'Việt Nam', '14 Hoà Khương', 'Cẩm Lệ', 'Thạch Thang');
INSERT INTO `sprint2`.`address` (`id`, `city`, `country`, `detail_address`, `district`, `town`) VALUES ('2', 'Quảng Nam', 'Việt Nam', '14 Hoà Khương', 'Tam Kỳ', 'Thạch Thang');
INSERT INTO `sprint2`.`address` (`id`, `city`, `country`, `detail_address`, `district`, `town`) VALUES ('3', 'Huế', 'Việt Nam', '14 Hoà Khương', 'Quảng Đông', 'Thạch Thang');
INSERT INTO `sprint2`.`address` (`id`, `city`, `country`, `detail_address`, `district`, `town`) VALUES ('4', 'Hà Tĩnh', 'Việt Nam', '14 Hoà Khương', 'Thạch Thang', 'Thạch Thang');
INSERT INTO `sprint2`.`address` (`id`, `city`, `country`, `detail_address`, `district`, `town`) VALUES ('5', 'Quảng Bình', 'Việt Nam', '14 Hoà Khương', 'Thăng Bình', 'Thạch Thang');
INSERT INTO `sprint2`.`address` (`id`, `city`, `country`, `detail_address`, `district`, `town`) VALUES ('6', 'Đà Nẵng', 'Việt Nam', '14 Hoà Khương', 'Liên Chiểu', 'Thạch Thang');
INSERT INTO `sprint2`.`address` (`id`, `city`, `country`, `detail_address`, `district`, `town`) VALUES ('7', 'Quảng Ngãi', 'Việt Nam', '14 Hoà Khương', 'Nông Sơn', 'Thạch Thang');
INSERT INTO `sprint2`.`address` (`id`, `city`, `country`, `detail_address`, `district`, `town`) VALUES ('8', 'Hà Nội', 'Việt Nam', '14 Hoà Khương', 'Đống Đa', 'Thạch Thang');
INSERT INTO `sprint2`.`address` (`id`, `city`, `country`, `detail_address`, `district`, `town`) VALUES ('9', 'Đà Nẵng', 'Việt Nam', '14 Hoà Khương', 'Thanh Khê', 'Thạch Thang');



INSERT INTO `sprint2`.`user` (`id`, `birth_day`, `delete_status`, `email`, `first_name`, `id_card`, `last_name`, `phone`, `point_dedication`, `account_id`, `address_id`, `user_type_id`) VALUES ('1', '1995-12-12', '1', 'vanhungns@gmail.com', 'Nguyễn Văn', '123456789', 'Hùng', '0901234567', '0', '1', '1', '4');
INSERT INTO `sprint2`.`user` (`id`, `birth_day`, `delete_status`, `email`, `first_name`, `id_card`, `last_name`, `phone`, `point_dedication`, `account_id`, `address_id`, `user_type_id`) VALUES ('2', '1995-12-12', '1', 'duyquang@gmail.com', 'Nguyễn Duy', '123456789', 'Quang', '0909999999', '0', '2', '2', '4');
INSERT INTO `sprint2`.`user` (`id`, `birth_day`, `delete_status`, `email`, `first_name`, `id_card`, `last_name`, `phone`, `point_dedication`, `account_id`, `address_id`, `user_type_id`) VALUES ('3', '1995-12-12', '1', 'theson@gmail.com', 'Phạm Thế', '123456789', 'Sơn', '0908888888', '0', '3', '3', '4');
INSERT INTO `sprint2`.`user` (`id`, `birth_day`, `delete_status`, `email`, `first_name`, `id_card`, `last_name`, `phone`, `point_dedication`, `account_id`, `address_id`, `user_type_id`) VALUES ('4', '1995-12-12', '1', 'thanhhai@gmail.com', 'Nguyễn Thanh', '123456789', 'Hải', '0907777777', '0', '4', '4', '4');
INSERT INTO `sprint2`.`user` (`id`, `birth_day`, `delete_status`, `email`, `first_name`, `id_card`, `last_name`, `phone`, `point_dedication`, `account_id`, `address_id`, `user_type_id`) VALUES ('5', '1995-12-12', '1', 'minhtien@gmail.com', 'Bùi Minh', '123456789', 'Tiến', '0906666666', '0', '5', '5', '4');
INSERT INTO `sprint2`.`user` (`id`, `birth_day`, `delete_status`, `email`, `first_name`, `id_card`, `last_name`, `phone`, `point_dedication`, `account_id`, `address_id`, `user_type_id`) VALUES ('6', '1995-12-12', '1', 'hoanggiang@gmail.com', 'Lê Bá Hoàng', '123456789', 'Giang', '0905555555', '0', '6', '6', '4');
INSERT INTO `sprint2`.`user` (`id`, `birth_day`, `delete_status`, `email`, `first_name`, `id_card`, `last_name`, `phone`, `point_dedication`, `account_id`, `address_id`, `user_type_id`) VALUES ('7', '1995-12-12', '1', 'catuyen@gmail.com', 'Nguyễn Cát', '123456789', 'Uyên', '0904444444', '0', '7', '7', '4');
INSERT INTO `sprint2`.`user` (`id`, `birth_day`, `delete_status`, `email`, `first_name`, `id_card`, `last_name`, `phone`, `point_dedication`, `account_id`, `address_id`, `user_type_id`) VALUES ('8', '1995-12-12', '1', 'minhchau@gmail.com', 'Phạm Minh', '123456789', 'Châu', '0903333333', '0', '8', '8', '4');
INSERT INTO `sprint2`.`user` (`id`, `birth_day`, `delete_status`, `email`, `first_name`, `id_card`, `last_name`, `phone`, `point_dedication`, `account_id`, `address_id`, `user_type_id`) VALUES ('9', '1995-12-12', '1', 'hoangduc@gmail.com', 'Đỗ Hoàng', '123456789', 'Đức', '0902222222', '0', '9', '9', '4');

INSERT INTO `sprint2`.`product` (`id`, `battery`, `chip`, `delete_status`, `description`, `front_camera`, `name`, `operating_system`, `ram`, `rear_camera`, `screen`, `sim_card`, `category_id`) VALUES ('1', '3110 mAh,18 W', 'Apple A13 Bionic 6 nhân', 1, 'Apple đã chính thức trình làng bộ 3 siêu phẩm iPhone 11, trong đó phiên bản iPhone 11 64GB có mức giá rẻ nhất nhưng vẫn được nâng cấp mạnh mẽ như iPhone Xr ra mắt trước đó.', '12 MP', 'Iphone 11', 'iOS 15', '4', '2 camera 12 MP','IPS LCD', '1 Nano SIM & 1 eSIM', '1');
INSERT INTO `sprint2`.`product` (`id`, `battery`, `chip`, `delete_status`, `description`, `front_camera`, `name`, `operating_system`, `ram`, `rear_camera`, `screen`, `sim_card`, `category_id`) VALUES ('2', '4323 mAh,20 W', 'Apple A16 Bionic 6 nhân', 1, 'Cuối cùng thì chiếc iPhone 14 Pro Max cũng đã chính thức lộ diện tại sự kiện ra mắt thường niên vào ngày 08/09 đến từ nhà Apple, kết thúc bao lời đồn đoán bằng một bộ thông số cực kỳ ấn tượng cùng vẻ ngoài đẹp mắt sang trọng. Từ ngày 14/10/2022 người dùng đã có thể mua sắm các sản phẩm iPhone 14 series với đầy đủ phiên bản tại Thế Giới Di Động.','12 MP','Iphone 14 ProMax','iOS 16','6','Chính 48 MP & Phụ 12 MP, 12 MP','OLED','1 Nano SIM & 1 eSIM','1');
INSERT INTO `sprint2`.`product` (`id`, `battery`, `chip`, `delete_status`, `description`, `front_camera`, `name`, `operating_system`, `ram`, `rear_camera`, `screen`, `sim_card`, `category_id`) VALUES ('3', '3240 mAh,20 W', 'Apple A15 Bionic 6 nhân', 1, 'Trong khi sức hút đến từ bộ 4 phiên bản iPhone 12 vẫn chưa nguội đi, thì hãng điện thoại Apple đã mang đến cho người dùng một siêu phẩm mới iPhone 13 với nhiều cải tiến thú vị sẽ mang lại những trải nghiệm hấp dẫn nhất cho người dùng.', '12 MP', 'Iphone 13', 'iOS 15', '4', '2 camera 12 MP', 'OLED','1 Nano SIM & 1 eSIM','1');
INSERT INTO `sprint2`.`product` (`id`, `battery`, `chip`, `delete_status`, `description`, `front_camera`, `name`, `operating_system`, `ram`, `rear_camera`, `screen`, `sim_card`, `category_id`) VALUES ('4', '5000 mAh,45 W', 'Snapdragon 8 Gen 1 8 nhân', 1, 'Galaxy S22 Ultra 5G chiếc smartphone cao cấp nhất trong bộ 3 Galaxy S22 series mà Samsung đã cho ra mắt. Tích hợp bút S Pen hoàn hảo trong thân máy, trang bị vi xử lý mạnh mẽ cho các tác vụ sử dụng vô cùng mượt mà và nổi bật hơn với cụm camera không viền độc đáo mang đậm dấu ấn riêng.','40 MP','Galaxy S22 Ultra 5G','Android 12','8','Chính 108 MP & Phụ 12 MP, 10 MP, 10 MP','Dynamic AMOLED 2X','2 Nano SIM hoặc 1 Nano SIM + 1 eSIM','2');
INSERT INTO `sprint2`.`product` (`id`, `battery`, `chip`, `delete_status`, `description`, `front_camera`, `name`, `operating_system`, `ram`, `rear_camera`, `screen`, `sim_card`, `category_id`) VALUES ('5', '3700 mAh,25 W', 'Snapdragon 8+ Gen 1 8 nhân', 1, 'Samsung Galaxy Z Flip4 128GB đã chính thức ra mắt thị trường công nghệ, đánh dấu sự trở lại của Samsung trên con đường định hướng người dùng về sự tiện lợi trên những chiếc điện thoại gập. Với độ bền được gia tăng cùng kiểu thiết kế đẹp mắt giúp Flip4 trở thành một trong những tâm điểm sáng giá cho nửa cuối năm 2022.','10 MP','Samsung Galaxy Z Flip4','Android 12','8','2 camera 12 MP','Chính: Dynamic AMOLED 2X, Phụ: Super AMOLED','1 Nano SIM & 1 eSIM','2');
INSERT INTO `sprint2`.`product` (`id`, `battery`, `chip`, `delete_status`, `description`, `front_camera`, `name`, `operating_system`, `ram`, `rear_camera`, `screen`, `sim_card`, `category_id`) VALUES ('6', '5000 mAh,33 W', 'Snapdragon 680 8 nhân', 1, 'Điện thoại Redmi được mệnh danh là dòng sản phẩm quốc dân ngon - bổ  - rẻ của Xiaomi và Redmi Note 11 (4GB/64GB) cũng không phải ngoại lệ, máy sở hữu một hiệu năng ổn định, màn hình 90 Hz mượt mà, cụm camera AI đến 50 MP cùng một mức giá vô cùng tốt.', '13 MP', 'Xiaomi Redmi Note 11','Android 11','4','Chính 50 MP & Phụ 8 MP, 2 MP, 2 MP','AMOLED','2 Nano SIM','3');
INSERT INTO `sprint2`.`product` (`id`, `battery`, `chip`, `delete_status`, `description`, `front_camera`, `name`, `operating_system`, `ram`, `rear_camera`, `screen`, `sim_card`, `category_id`) VALUES ('7', '4500 mAh,80 W','MediaTek Dimensity 8100 Max 8 nhân', 1, 'OPPO Reno8 Pro 5G là chiếc điện thoại cao cấp được nhà OPPO ra mắt vào thời điểm 09/2022, máy hướng đến sự hoàn thiện cao cấp ở phần thiết kế cùng khả năng quay chụp chuyên nghiệp nhờ trang bị vi xử lý hình ảnh MariSilicon X chuyên dụng.', '32 MP', 'OPPO Reno8 Pro 5G', 'Android 12','12','Chính 50 MP & Phụ 8 MP, 2 MP','AMOLED','2 Nano SIM','4');
INSERT INTO `sprint2`.`product` (`id`, `battery`, `chip`, `delete_status`, `description`, `front_camera`, `name`, `operating_system`, `ram`, `rear_camera`, `screen`, `sim_card`, `category_id`) VALUES ('8', '5000 mAh,18 W', 'MediaTek Helio G35 8 nhân', 1, 'OPPO A55', '16 MP', 'OPPO cho ra mắt OPPO A55 4G chiếc smartphone giá rẻ tầm trung có thiết kế đẹp mắt, cấu hình khá ổn, cụm camera chất lượng và dung lượng pin ấn tượng, mang đến một lựa chọn trải nghiệm thú vị vừa túi tiền cho người tiêu dùng.', 'Android 11', '4', 'Chính 50 MP & Phụ 2 MP, 2 MP','IPS LCD','2 Nano SIM','4');
UPDATE `sprint2`.`product` SET `description` = 'OPPO cho ra mắt OPPO A55 4G chiếc smartphone giá rẻ tầm trung có thiết kế đẹp mắt, cấu hình khá ổn, cụm camera chất lượng và dung lượng pin ấn tượng, mang đến một lựa chọn trải nghiệm thú vị vừa túi tiền cho người tiêu dùng.', `name` = 'OPPO A55' WHERE (`id` = '8');


INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('1', 'https://cdn.tgdd.vn/Products/Images/42/153856/iphone-11-trang-1-2-org.jpg', '1');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('2', 'https://cdn.tgdd.vn/Products/Images/42/153856/iphone-11-den-1-1-1-org.jpg', '1');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('3', 'https://cdn.tgdd.vn/Products/Images/42/153856/iphone-11-do-1-1-1-org.jpg', '1');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('4', 'https://cdn.tgdd.vn/Products/Images/42/251192/iphone-14-pro-vang-1-2.jpg', '2');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('5', 'https://cdn.tgdd.vn/Products/Images/42/251192/iphone-14-pro-den-1-1.jpg', '2');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('6', 'https://cdn.tgdd.vn/Products/Images/42/251192/iphone-14-pro-bac-1-2.jpg', '2');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('7', 'https://cdn.tgdd.vn/Products/Images/42/223602/iphone-13-1-4.jpg', '3');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('8', 'https://cdn.tgdd.vn/Products/Images/42/223602/iphone-13-xanh-1.jpg', '3');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('9', 'https://cdn.tgdd.vn/Products/Images/42/223602/iphone-13-1-3.jpg', '3');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('10', 'https://cdn.tgdd.vn/Products/Images/42/235838/samsung-galaxy-s22-ultra-1-1.jpg', '4');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('11', 'https://cdn.tgdd.vn/Products/Images/42/235838/samsung-galaxy-s22-ultra-1-3.jpg', '4');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('12', 'https://cdn.tgdd.vn/Products/Images/42/235838/samsung-galaxy-s22-ultra-den-1.jpg', '4');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('13', 'https://cdn.tgdd.vn/Products/Images/42/258047/samsung-galaxy-flip4-glr-tim-1.jpg', '5');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('14', 'https://cdn.tgdd.vn/Products/Images/42/258047/samsung-galaxy-z-flip4-xanh-128gb-1.jpg', '5');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('15', 'https://cdn.tgdd.vn/Products/Images/42/258047/sam-sung-galaxy-zflip4-vang-hong-1.jpg', '5');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('16', 'https://cdn.tgdd.vn/Products/Images/42/269831/xiaomi-redmi-note-11-1-3.jpg', '6');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('17', 'https://cdn.tgdd.vn/Products/Images/42/269831/xiaomi-redmi-note-11-1-2.jpg', '6');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('18', 'https://cdn.tgdd.vn/Products/Images/42/269831/xiaomi-redmi-note-11-10.jpg', '6');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('19', 'https://cdn.tgdd.vn/Products/Images/42/260546/oppo-reno8-pro-xanh-1.jpg', '7');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('20', 'https://cdn.tgdd.vn/Products/Images/42/260546/oppo-reno8-pro-black-1.jpg', '7');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('21', 'https://cdn.tgdd.vn/Products/Images/42/260546/oppo-reno8-pro-black-5.jpg', '7');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('22', 'https://cdn.tgdd.vn/Products/Images/42/249944/oppo-a55-4g-1-5.jpg', '8');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('23', 'https://cdn.tgdd.vn/Products/Images/42/249944/oppo-a55-4g-1-2.jpg', '8');
INSERT INTO `sprint2`.`img_url_product` (`id`, `url`, `product_id`) VALUES ('24', 'https://cdn.tgdd.vn/Products/Images/42/249944/oppo-a55-4g-1-3.jpg', '8');

INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('1', '1', '15000000', '10', '1', '1', '1');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('2', '1', '16000000', '20', '2', '1', '2');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('3', '1', '17000000', '30', '3', '1', '3');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('4', '1', '18000000', '10', '4', '2', '4');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('5', '1', '19000000', '20', '5', '2', '5');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('6', '1', '15000000', '30', '6', '2', '1');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('7', '1', '10000000', '15', '7', '3', '2');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('8', '1', '11000000', '15', '8', '3', '3');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('9', '1', '12000000', '20', '1', '4', '4');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('10', '1', '13000000', '10', '2', '4', '5');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('11', '1', '15000000', '40', '3', '5', '1');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('12', '1', '10000000', '30', '4', '5', '2');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('13', '1', '20000000', '50', '5', '6', '3');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('14', '1', '21000000', '100', '6', '6', '4');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('15', '1', '22000000', '100', '7', '7', '5');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('16', '1', '15000000', '60', '8', '7', '1');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('17', '1', '18000000', '70', '1', '8', '2');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('18', '1', '19000000', '80', '2', '8', '3');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('19', '1', '17000000', '90', '3', '3', '4');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('20', '1', '14000000', '45', '4', '4', '5');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('21', '1', '16000000', '10', '2', '1', '1');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('22', '1', '16000000', '10', '3', '1', '1');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('23', '1', '17000000', '15', '4', '1', '1');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('24', '1', '17000000', '10', '1', '2', '1');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('25', '1', '17000000', '15', '2', '2', '1');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('26', '1', '18000000', '16', '3', '2', '2');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('27', '1', '18000000', '16', '1', '2', '2');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('28', '1', '18000000', '16', '3', '2', '2');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('29', '1', '18000000', '16', '3', '2', '3');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('30', '1', '15000000', '15', '1', '3', '2');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('31', '1', '16000000', '10', '2', '3', '2');
INSERT INTO `sprint2`.`product_detail` (`id`, `delete_status`, `price`, `quantity`, `color_id`, `product_id`, `storage_capacity_id`) VALUES ('32', '1', '17000000', '15', '3', '3', '2');



UPDATE `sprint2`.`account` SET `password` = '$2a$10$IdAlG2ya95rQ0OnsS.a83en7hJc7vo1pUgkXw95Za1F0ysJmz2qM6', `username` = 'hungnv', `enabled` = '1' WHERE (`id` = '1');
UPDATE `sprint2`.`account` SET `password` = '$2a$10$IdAlG2ya95rQ0OnsS.a83en7hJc7vo1pUgkXw95Za1F0ysJmz2qM6', `username` = 'ducdh', `enabled` = '1' WHERE (`id` = '2');
UPDATE `sprint2`.`account` SET `password` = '$2a$10$IdAlG2ya95rQ0OnsS.a83en7hJc7vo1pUgkXw95Za1F0ysJmz2qM6', `username` = 'sangdd', `enabled` = '1' WHERE (`id` = '3');
UPDATE `sprint2`.`account` SET `password` = '$2a$10$IdAlG2ya95rQ0OnsS.a83en7hJc7vo1pUgkXw95Za1F0ysJmz2qM6', `username` = 'truonglh', `enabled` = '1' WHERE (`id` = '4');
UPDATE `sprint2`.`account` SET `password` = '$2a$10$IdAlG2ya95rQ0OnsS.a83en7hJc7vo1pUgkXw95Za1F0ysJmz2qM6', `username` = 'sonpt', `enabled` = '1' WHERE (`id` = '5');
UPDATE `sprint2`.`account` SET `password` = '$2a$10$IdAlG2ya95rQ0OnsS.a83en7hJc7vo1pUgkXw95Za1F0ysJmz2qM6', `username` = 'uyennc', `enabled` = '1' WHERE (`id` = '6');
UPDATE `sprint2`.`account` SET `password` = '$2a$10$IdAlG2ya95rQ0OnsS.a83en7hJc7vo1pUgkXw95Za1F0ysJmz2qM6', `username` = 'gianglbh', `enabled` = '1' WHERE (`id` = '7');
UPDATE `sprint2`.`account` SET `password` = '$2a$10$IdAlG2ya95rQ0OnsS.a83en7hJc7vo1pUgkXw95Za1F0ysJmz2qM6', `username` = 'chauptm', `enabled` = '1' WHERE (`id` = '8');
UPDATE `sprint2`.`account` SET `password` = '$2a$10$IdAlG2ya95rQ0OnsS.a83en7hJc7vo1pUgkXw95Za1F0ysJmz2qM6', `username` = 'tienbm', `enabled` = '1' WHERE (`id` = '9');


UPDATE `sprint2`.`product` SET `release_date` = '2019-01-01' WHERE (`id` = '1');
UPDATE `sprint2`.`product` SET `release_date` = '2023-01-01' WHERE (`id` = '2');
UPDATE `sprint2`.`product` SET `release_date` = '2022-01-01' WHERE (`id` = '3');
UPDATE `sprint2`.`product` SET `release_date` = '2022-08-01' WHERE (`id` = '4');
UPDATE `sprint2`.`product` SET `release_date` = '2021-01-01' WHERE (`id` = '5');
UPDATE `sprint2`.`product` SET `release_date` = '2021-05-01' WHERE (`id` = '6');
UPDATE `sprint2`.`product` SET `release_date` = '2022-09-01' WHERE (`id` = '7');
UPDATE `sprint2`.`product` SET `release_date` = '2022-01-01' WHERE (`id` = '8');


INSERT INTO `sprint2`.`order_phone` (`id`, `delete_status`, `user_id`) VALUES ('1', '1', '1');
INSERT INTO `sprint2`.`order_phone` (`id`, `delete_status`, `user_id`) VALUES ('2', '1', '2');
INSERT INTO `sprint2`.`order_phone` (`id`, `delete_status`, `user_id`) VALUES ('3', '1', '3');


INSERT INTO `sprint2`.`order_detail` (`id`, `quantity`, `order_phone_id`, `product_detail_id`) VALUES ('1', '2', '1', '1');
INSERT INTO `sprint2`.`order_detail` (`id`, `quantity`, `order_phone_id`, `product_detail_id`) VALUES ('2', '2', '1', '2');
INSERT INTO `sprint2`.`order_detail` (`id`, `quantity`, `order_phone_id`, `product_detail_id`) VALUES ('3', '1', '2', '4');
INSERT INTO `sprint2`.`order_detail` (`id`, `quantity`, `order_phone_id`, `product_detail_id`) VALUES ('4', '1', '2', '5');
INSERT INTO `sprint2`.`order_detail` (`id`, `quantity`, `order_phone_id`, `product_detail_id`) VALUES ('5', '1', '3', '6');
INSERT INTO `sprint2`.`order_detail` (`id`, `quantity`, `order_phone_id`, `product_detail_id`) VALUES ('6', '1', '3', '7');

INSERT INTO `sprint2`.`payment` (`id`, `delete_status`, `payment_status`, `shipping_description`) VALUES ('1', 1, 0, 'Giao vào buổi sáng');
INSERT INTO `sprint2`.`payment` (`id`, `delete_status`, `payment_status`, `shipping_description`) VALUES ('2', 1,0, 'Giao vào buổi sáng');
INSERT INTO `sprint2`.`payment` (`id`, `delete_status`, `payment_status`, `shipping_description`) VALUES ('3', 1, 0, 'Giao vào buổi sáng');