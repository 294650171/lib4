USE [lib4]
GO
/****** Object:  Table [dbo].[quality_super_pub]    Script Date: 2018/7/12 15:37:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[quality_super_pub](
	[id] [varchar](64) NOT NULL,
	[project_name] [varchar](64) NULL,
	[construction_corp] [varchar](64) NULL,
	[supervisor_corp] [varchar](64) NULL,
	[project_manager] [varchar](64) NULL,
	[project_director] [varchar](64) NULL,
	[quality_super_dept] [varchar](64) NULL,
	[reg_date] datetime NULL,
	[start_date] datetime NULL,
	[finish_date] datetime NULL,
	[accept_date] datetime NULL,
	[url] [varchar](200) NULL,
	[create_by] [varchar](32) NULL,
	[update_by] [varchar](32) NULL,
	[create_date] datetime NULL,
	[update_date] datetime NULL,
	[del_flag] [char](1) NULL
	) 
	
GO
SET ANSI_PADDING OFF

