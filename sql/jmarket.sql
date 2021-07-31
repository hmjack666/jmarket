/*
 Navicat Premium Data Transfer

 Source Server         : mysql8
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : jmarket

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 31/07/2021 20:16:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity`  (
  `commid` int(64) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `commname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品名称',
  `commtype` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品类别',
  `orimoney` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '参考价',
  `thinkmoney` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '亿家价',
  `common` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '常用选项：限时促销、无等',
  `commcount` bigint(20) NOT NULL COMMENT '商品库存',
  `commdesc` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品介绍',
  `commdigit` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '计数单位选项：例如一斤、一米',
  `commnumber` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '商品编号',
  `image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '商品图片',
  `commaddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '店铺地址',
  `createtime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品发布时间',
  `updatetime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品更新时间',
  `commstatus` int(10) NULL DEFAULT NULL COMMENT '商品状态',
  `businessid` int(20) NULL DEFAULT NULL COMMENT '商家id',
  `commtel` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '商家电话',
  `readnumber` int(10) NULL DEFAULT NULL COMMENT '商品浏览量',
  `businessname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '商家名称',
  PRIMARY KEY (`commid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES (1, '绝味鸭舌', '零食', '20', '15', '限时抢购', 88, '绝味鸭舌', '/斤', NULL, 'http://localhost:8080/jmarket/ls06.jpg', '湖北民族大学南门三号店', '2021-07-30 20:29:58', '2021-07-30 20:29:58', NULL, 1, '123456', NULL, '良品铺子');
INSERT INTO `commodity` VALUES (2, '绝味螺蛳粉', '零食', '30', '25', '限时抢购', 90, '绝味螺蛳粉', '/件', NULL, 'http://localhost:8080/jmarket/ls01.jpg', '湖北民族大学南门三号店', '2021-07-30 21:38:41', '2021-07-30 21:38:41', NULL, 1, '123456', NULL, '良品铺子');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像',
  `sex` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '性别',
  `address` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '地址',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '状态',
  `createtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '注册时间',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '类别',
  `tel` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '电话号码',
  `email` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '邮箱',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '姓名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES (1, '良品铺子', '123456', NULL, '男', '湖北民族大学南门三号店', NULL, '2021-07-30 20:28:10', NULL, '1', '123456', 'QQ1234', '小良');
INSERT INTO `member` VALUES (2, '黑马Jack', '123456', NULL, '男', '湖北民族大学信工楼', NULL, '2021-07-31 19:56:56', NULL, '0', '18888844777', '477455422@qq.com', '杰杰子');

-- ----------------------------
-- Table structure for notices
-- ----------------------------
DROP TABLE IF EXISTS `notices`;
CREATE TABLE `notices`  (
  `id` int(64) NOT NULL AUTO_INCREMENT COMMENT '消息id',
  `userid` int(64) NULL DEFAULT NULL COMMENT '接收消息的用户id',
  `message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '消息内容',
  `ntype` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '消息类别',
  `createtime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '发送消息时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of notices
-- ----------------------------
INSERT INTO `notices` VALUES (1, 1, '用户：黑马Jack 电话号码：18888844777 购买了您的商品：绝味鸭舌 商品类别：零食 商品id：1 购买数量：1 支付金额：15 库存还剩：99 用户收获地址为：湖北民族大学信工楼 请尽快发货，良好的信誉是客户源的来源!', '购买通知', '2021-07-30 20:30:51');
INSERT INTO `notices` VALUES (2, 1, '用户：黑马Jack 电话号码：18888844777 购买了您的商品：绝味螺蛳粉 商品类别：零食 商品id：2 购买数量：10 支付金额：250 库存还剩：90 用户收获地址为：湖北民族大学信工楼 请尽快发货，良好的信誉是客户源的来源!', '购买通知', '2021-07-30 22:19:56');
INSERT INTO `notices` VALUES (3, 1, '用户：黑马Jack 电话号码：18888844777 购买了您的商品：绝味鸭舌 商品类别：零食 商品id：1 购买数量：10 支付金额：150 库存还剩：89 用户收获地址为：湖北民族大学信工楼 请尽快发货，良好的信誉是客户源的来源!', '购买通知', '2021-07-30 22:27:00');
INSERT INTO `notices` VALUES (4, 1, '用户：黑马Jack 电话号码：18888844777 购买了您的商品：绝味鸭舌 商品类别：零食 商品id：1 购买数量：1 支付金额：15 库存还剩：88 用户收获地址为：湖北民族大学信工楼 请尽快发货，良好的信誉是客户源的来源!', '购买通知', '2021-07-31 10:58:04');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` int(64) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `commid` int(64) NOT NULL COMMENT '商品id',
  `commname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品名称',
  `commdesc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '商品描述',
  `soldtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '购买时间',
  `cmuserid` int(20) NOT NULL COMMENT '购买用户id',
  `businessname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商家名字',
  `address` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '店铺地址',
  `buycount` int(20) NOT NULL COMMENT '购买数量',
  `price` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '订单价格',
  `status` tinyint(1) NOT NULL COMMENT '商品状态：已购买订单，购物车订单',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, 1, '绝味鸭舌', NULL, '2021-07-30 20:30:51', 2, '良品铺子', '湖北民族大学南门三号店', 1, '15', 1);
INSERT INTO `order` VALUES (2, 2, '绝味螺蛳粉', NULL, '2021-07-30 22:19:56', 2, '良品铺子', '湖北民族大学南门三号店', 10, '250', 1);
INSERT INTO `order` VALUES (3, 1, '绝味鸭舌', NULL, '2021-07-30 22:27:00', 2, '良品铺子', '湖北民族大学南门三号店', 10, '150', 1);
INSERT INTO `order` VALUES (5, 1, '绝味鸭舌', NULL, '2021-07-31 10:58:04', 2, '良品铺子', '湖北民族大学南门三号店', 1, '15', 1);
INSERT INTO `order` VALUES (6, 2, '绝味螺蛳粉', NULL, '2021-07-31 10:58:19', 2, '良品铺子', '湖北民族大学南门三号店', 1, '25.0', 0);

SET FOREIGN_KEY_CHECKS = 1;
