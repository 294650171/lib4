DELETE FROM [dbo].[sys_dict] WHERE type='reset_password_apply_status';

INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'reset_password_apply_status0', N'0', N'编辑', N'reset_password_apply_status', N'', N'10', N'0', N'1', getdate(), N'1', getdate(), null, N'0');
INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'reset_password_apply_status1', N'1', N'待审核', N'reset_password_apply_status', N'', N'20', N'0', N'1', getdate(), N'1', getdate(), null, N'0');
INSERT INTO [dbo].[sys_dict] ([id], [value], [label], [type], [description], [sort], [parent_id], [create_by], [create_date], [update_by], [update_date], [remarks], [del_flag]) VALUES (N'reset_password_apply_status2', N'2', N'已审核', N'reset_password_apply_status', N'', N'30', N'0', N'1', getdate(), N'1', getdate(), null, N'0');


