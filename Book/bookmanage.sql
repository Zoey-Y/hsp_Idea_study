/*
 Navicat Premium Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : 127.0.0.1:3306
 Source Schema         : bookmanage

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 11/12/2022 13:40:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `b_id` bigint(0) NOT NULL AUTO_INCREMENT,
  `b_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '图书名称',
  `b_author` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '作者',
  `b_time` datetime(0) NOT NULL COMMENT '借阅时间',
  `b_type` int(0) NOT NULL COMMENT '图书分类:1.计算机/软件,2.小说/文稿,3.杂项',
  PRIMARY KEY (`b_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '书籍表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, 'java编程', '詹姆斯', '2022-10-10 16:00:00', 1);
INSERT INTO `book` VALUES (3, 'python编程', '詹姆斯', '2022-10-10 00:00:00', 1);
INSERT INTO `book` VALUES (4, '随意', '小霖霖', '2022-12-07 00:00:00', 2);
INSERT INTO `book` VALUES (7, '改啥名', '改名小次郎', '2022-12-01 16:00:00', 3);
INSERT INTO `book` VALUES (8, 'BoBo', '柯南美少女', '2022-12-01 16:00:00', 2);
INSERT INTO `book` VALUES (9, '进击的矮子', '间谍小家家', '2022-12-07 16:00:00', 1);
INSERT INTO `book` VALUES (10, '海贼王', '小霖', '2021-03-03 16:00:00', 1);
INSERT INTO `book` VALUES (11, '啊婆小樱', '巨人战士', '2020-03-05 16:00:00', 1);
INSERT INTO `book` VALUES (16, 'asdf', 'sdfg', '2022-12-07 16:00:00', 1);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '姓名',
  `pwd` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'user', '1234');
INSERT INTO `users` VALUES (2, '6德华', '1432');
INSERT INTO `users` VALUES (3, '', '');
INSERT INTO `users` VALUES (4, '海霸王', '6666');
INSERT INTO `users` VALUES (5, '美少女海王', '1234');

SET FOREIGN_KEY_CHECKS = 1;
