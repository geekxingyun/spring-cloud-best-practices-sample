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

SET FOREIGN_KEY_CHECKS = 1;