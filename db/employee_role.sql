-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.30 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 project.temployee_role 结构
CREATE TABLE IF NOT EXISTS `temployee_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `employee_id` varchar(30) NOT NULL COMMENT '员工代码',
  `role_id` varchar(30) NOT NULL COMMENT '角色代码',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
  `update_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `remarks` varchar(64) DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='员工角色对应表';

-- 正在导出表  project.temployee_role 的数据：~6 rows (大约)
DELETE FROM `temployee_role`;
/*!40000 ALTER TABLE `temployee_role` DISABLE KEYS */;
INSERT INTO `temployee_role` (`id`, `employee_id`, `role_id`, `create_by`, `create_date`, `update_by`, `update_date`, `remarks`, `del_flag`) VALUES
	(2, '01918', '8', NULL, NULL, NULL, NULL, NULL, '0'),
	(4, '00397', '4', NULL, NULL, NULL, NULL, NULL, '0'),
	(8, '00375', '4', NULL, NULL, NULL, NULL, NULL, '0'),
	(10, '02894', '9', NULL, NULL, NULL, NULL, NULL, '0'),
	(11, '03774', '4', NULL, NULL, NULL, NULL, NULL, '0'),
	(12, '03774', '8', NULL, NULL, NULL, NULL, NULL, '0');
/*!40000 ALTER TABLE `temployee_role` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
