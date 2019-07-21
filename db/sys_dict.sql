DELETE FROM [dbo].[sys_dict] WHERE type='reset_password_apply_status';

INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'reset_password_apply_status0', N'0', N'待审核', N'reset_password_apply_status', N'', N'10', N'0', N'1', getdate(), N'1', getdate(), null, N'0');
INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'reset_password_apply_status1', N'1', N'已审核', N'reset_password_apply_status', N'', N'20', N'0', N'1', getdate(), N'1', getdate(), null, N'0');
INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'reset_password_apply_status2', N'2', N'退回', N'reset_password_apply_status', N'', N'30', N'0', N'1', getdate(), N'1', getdate(), null, N'0');


DELETE FROM [dbo].[sys_dict] WHERE type='corp_cert_type';

INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'corp_cert_type_1', N'1', N'勘察资质', N'corp_cert_type', N'', N'10', N'0', N'1', getdate(), N'1', getdate(), null, N'0');
INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'corp_cert_type_2', N'2', N'设计资质', N'corp_cert_type', N'', N'20', N'0', N'1', getdate(), N'1', getdate(), null, N'0');
INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'corp_cert_type_3', N'3', N'招标代理资格', N'corp_cert_type', N'', N'30', N'0', N'1', getdate(), N'1', getdate(), null, N'0');
INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'corp_cert_type_4', N'4', N'建筑业企业资质', N'corp_cert_type', N'', N'40', N'0', N'1', getdate(), N'1', getdate(), null, N'0');
INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'corp_cert_type_5', N'5', N'监理资质', N'corp_cert_type', N'', N'50', N'0', N'1', getdate(), N'1', getdate(), null, N'0');
INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'corp_cert_type_6', N'6', N'造价咨询资质', N'corp_cert_type', N'', N'60', N'0', N'1', getdate(), N'1', getdate(), null, N'0');
INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'corp_cert_type_20', N'20', N'安全生产许可证', N'corp_cert_type', N'', N'200', N'0', N'1', getdate(), N'1', getdate(), null, N'0');
INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'corp_cert_type_99', N'99', N'其他', N'corp_cert_type', N'', N'900', N'0', N'1', getdate(), N'1', getdate(), null, N'0');

