drop table if exists TB_PRODUCT;
drop table if exists TB_PRODUCT_COMMENT;
drop table if exists TB_USER;

-- 商品表
create table TB_PRODUCT
(
    ID                   int unsigned not null auto_increment comment '主键',
    NAME                 varchar(100) comment '商品名称',
    COVER_IMAGE          varchar(100) comment '商品封面图片',
    PRICE                int not null default 0 comment '商品价格(分)',
    primary key (ID)
);
-- 商品评论表
create table TB_PRODUCT_COMMENT
(
    ID                   int unsigned not null auto_increment comment '主键',
    PRODUCT_ID           int unsigned comment '所属商品',
    AUTHOR_ID            int unsigned comment '作者Id',
    CONTENT              varchar(200) comment '评论内容',
    CREATED              TIMESTAMP comment '创建时间',
    primary key (ID)
);
-- 用户表
create table TB_USER
(
    ID                   int unsigned not null auto_increment comment '主键',
    NIKE_NAME             varchar(50) comment '用户昵称',
    AVATAR               varchar(255) comment '用户头像',
    primary key (ID)
);