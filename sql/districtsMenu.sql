-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('地区菜单', '3', '1', '/mapper.biz/districts', 'C', '0', 'mapper.biz:districts:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '地区菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('地区查询', @parentId, '1',  '#',  'F', '0', 'mapper.biz:districts:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('地区新增', @parentId, '2',  '#',  'F', '0', 'mapper.biz:districts:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('地区修改', @parentId, '3',  '#',  'F', '0', 'mapper.biz:districts:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('地区删除', @parentId, '4',  '#',  'F', '0', 'mapper.biz:districts:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
