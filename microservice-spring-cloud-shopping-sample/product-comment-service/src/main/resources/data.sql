-- 导入商品3的评论列表
insert into tb_product_comment (pk_uuid, product_id, author_id, content, create_time,update_time) values(1, 3, 1, '非常不错的商品', CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
insert into tb_product_comment (pk_uuid, product_id, author_id, content, create_time,update_time) values(2, 3, 3, '非常不错的商品+1', CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
insert into tb_product_comment (pk_uuid, product_id, author_id, content, create_time,update_time) values(3, 3, 4, '哈哈，谁用谁知道', CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
