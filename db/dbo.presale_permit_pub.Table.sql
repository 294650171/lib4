USE [lib4]
GO
/****** Object:  Table [dbo].[presale_permit_pub]    Script Date: 2018/7/12 15:37:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[presale_permit_pub](
	[id] [varchar](64) NOT NULL,
	[corp_name] [varchar](64) NULL,
	[commondity_hourse_name] [varchar](200) NULL,
	[commondity_hourse_address] [varchar](200) NULL,
	[commondity_hourse_type] [varchar](32) NULL,
	[area] [decimal](18,4) NULL,
	[area_str] [varchar](64) NULL,
	[license_no] [varchar](64) NULL,
	[attachment] [varchar](200) NULL,
	[publicity_date] datetime NULL,
	[url] [varchar](200) NULL,
	[create_by] [varchar](32) NULL,
	[update_by] [varchar](32) NULL,
	[create_date] datetime NULL,
	[update_date] datetime NULL,
	[del_flag] [char](1) NULL
	) 
	
GO
SET ANSI_PADDING OFF

