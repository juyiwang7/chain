-- ----------------------------
--  Table structure for `welfare_project`
-- ----------------------------
DROP TABLE IF EXISTS `welfare_project`;
CREATE TABLE `welfare_project` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `name` varchar(32) NOT NULL DEFAULT '' COMMENT '项目名称',
  `type` varchar(1024) DEFAULT NULL COMMENT '项目分类',
  `location` varchar(1024) DEFAULT NULL COMMENT '地点',
  `period` datetime DEFAULT NULL COMMENT '时间',
  `manager` varchar(32) NOT NULL DEFAULT '' COMMENT '项目负责人',
  `phone` varchar(32) NOT NULL DEFAULT '' COMMENT '电话号码',
  `description` text NOT NULL COMMENT '项目介绍',
  `status` int(4) NOT NULL DEFAULT '0' COMMENT '项目状态',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '更新时间',
  `operator` varchar(32) DEFAULT '' COMMENT '操作人',
  `is_delete` tinyint(1) DEFAULT '0' COMMENT '逻辑删除标记',

  `pt_id` bigint(20) NOT NULL COMMENT '项目目标外键ID',

  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='项目';