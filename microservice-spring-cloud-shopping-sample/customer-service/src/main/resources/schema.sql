/*
 Navicat Premium Data Transfer

 Source Server         : localhost_mysql
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : spring_cloud_mysql8_test_db

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 20/03/2020 17:33:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_customer
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer` (
  `pk_uuid` bigint NOT NULL,
  `avatar` varchar(255) COLLATE utf8mb4_0900_bin DEFAULT NULL,
  `create_time` bigint DEFAULT NULL,
  `nike_name` varchar(255) COLLATE utf8mb4_0900_bin DEFAULT NULL,
  `update_time` bigint DEFAULT NULL,
  PRIMARY KEY (`pk_uuid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_bin;

-- ----------------------------
-- Table structure for tb_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_product`;
CREATE TABLE `tb_product` (
  `pk_uuid` bigint NOT NULL,
  `cover_image` varchar(255) COLLATE utf8mb4_0900_bin DEFAULT NULL,
  `create_time` bigint DEFAULT NULL,
  `price` double DEFAULT NULL,
  `product_name` varchar(255) COLLATE utf8mb4_0900_bin DEFAULT NULL,
  `update_time` bigint DEFAULT NULL,
  PRIMARY KEY (`pk_uuid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_bin;

-- ----------------------------
-- Table structure for tb_product_comment
-- ----------------------------
DROP TABLE IF EXISTS `tb_product_comment`;
CREATE TABLE `tb_product_comment` (
  `pk_uuid` bigint NOT NULL,
  `author_id` bigint DEFAULT NULL,
  `content` varchar(255) COLLATE utf8mb4_0900_bin DEFAULT NULL,
  `create_time` bigint DEFAULT NULL,
  `product_id` bigint DEFAULT NULL,
  `update_time` bigint DEFAULT NULL,
  PRIMARY KEY (`pk_uuid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_bin;

SET FOREIGN_KEY_CHECKS = 1;