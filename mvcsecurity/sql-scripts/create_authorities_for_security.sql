--USE CourseDB
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [authorities](
	[username] [varchar](50) NOT NULL,
	[authority] [varchar](50) NOT NULL
) ON [PRIMARY]
GO
ALTER TABLE [authorities] ADD CONSTRAINT authorities_idx_1 UNIQUE (username,authority)
GO
ALTER TABLE [authorities] ADD CONSTRAINT authorities_ibfk_1 FOREIGN KEY (username) REFERENCES [users] (username)
GO
