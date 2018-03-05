DROP TABLE lc_members;
CREATE TABLE lc_members(
	id				NUMBER,
	name			VARCHAR2(15)	CONSTRAINT lc_members_NN_name NOT NULL,
	telephone		CHAR(13)		CONSTRAINT lc_members_NN_tel NOT NULL,
	registeredDate	DATE			DEFAULT SYSDATE,
	registeredPlace	VARCHAR2(100)	CONSTRAINT lc_members_NN_regplace NOT NULL,
	issuedDate		DATE			DEFAULT SYSDATE,
	hasTmoney		CHAR(1)			DEFAULT 'N',
	hasAutopay		CHAR(1)			DEFAULT 'N',
	etcInfo			VARCHAR2(300),
	CONSTRAINT lc_members_PK	PRIMARY KEY(id),
	CONSTRAINT lc_members_UK	UNIQUE(telephone)
);

DROP SEQUENCE lc_members_SEQ;
CREATE SEQUENCE lc_members_SEQ;

DROP TABLE lc_utilrates;
CREATE TABLE lc_utilrates(
	id			NUMBER,
	memberId	NUMBER,
	year		NUMBER,
	month		NUMBER,
	isUsed		CHAR(1)	DEFAULT 'N',
	CONSTRAINT lc_utilrates_PK		PRIMARY KEY(id),
	CONSTRAINT lc_utilrates_FK		FOREIGN KEY(memberId)
									REFERENCES lc_members(id) ON DELETE CASCADE,
	CONSTRAINT lc_utilrate_month	CHECK (month BETWEEN 1 AND 12)
);

