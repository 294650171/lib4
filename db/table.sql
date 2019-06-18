DROP TABLE [dbo].[treset_password_apply];
CREATE TABLE [dbo].[treset_password_apply] (
[id] varchar(64) NOT NULL ,
[entity_code] varchar(64) NULL ,
[entity_name] varchar(64) NULL ,
[attach] varchar(200) NULL ,
[mobile] varchar(64) NULL ,
[email] varchar(64) NULL ,
[apply_date] datetime NULL ,
[approve_date] datetime NULL ,
[approve_opinion] varchar(100) NULL,
[status] char(1) NULL,
[create_by] varchar(32) NULL ,
[update_by] varchar(32) NULL ,
[create_date] datetime NULL ,
[update_date] datetime NULL ,
[remarks] varchar(200) NULL ,
[del_flag] char(1) NULL 
);