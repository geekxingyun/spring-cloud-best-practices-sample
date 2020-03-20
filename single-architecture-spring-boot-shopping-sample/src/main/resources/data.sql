-- 导入测试商品列表
insert into tb_product (pk_uuid, product_name, cover_image, price,create_time,update_time) values(1, '测试商品-001', '/products/cover/001.png', 100,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
insert into tb_product (pk_uuid, product_name, cover_image, price,create_time,update_time) values(2, '测试商品-002', '/products/cover/002.png', 200,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
insert into tb_product (pk_uuid, product_name, cover_image, price,create_time,update_time) values(3, '测试商品-003', '/products/cover/003.png', 300,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
insert into tb_product (pk_uuid, product_name, cover_image, price,create_time,update_time) values(4, '测试商品-004', '/products/cover/004.png', 400,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
insert into tb_product (pk_uuid, product_name, cover_image, price,create_time,update_time) values(5, '测试商品-005', '/products/cover/005.png', 500,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
-- 导入测试用户列表
insert into tb_customer (pk_uuid, NIKE_NAME, AVATAR,create_time,update_time) values(1, 'zhangSan', '/users/avatar/zhangsan.png',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
insert into tb_customer (pk_uuid, NIKE_NAME, AVATAR,create_time,update_time) values(2, 'lisi', '/users/avatar/lisi.png',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
insert into tb_customer (pk_uuid, NIKE_NAME, AVATAR,create_time,update_time) values(3, 'wangwu', '/users/avatar/wangwu.png',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
insert into tb_customer (pk_uuid, NIKE_NAME, AVATAR,create_time,update_time) values(4, 'yanxiaoliu', '/users/avatar/yanxiaoliu.png',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
-- 导入商品3的评论列表
insert into tb_product_comment (pk_uuid, product_id, author_id, content, create_time,update_time) values(1, 3, 1, '非常不错的商品', CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
insert into tb_product_comment (pk_uuid, product_id, author_id, content, create_time,update_time) values(2, 3, 3, '非常不错的商品+1', CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
insert into tb_product_comment (pk_uuid, product_id, author_id, content, create_time,update_time) values(3, 3, 4, '哈哈，谁用谁知道', CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
