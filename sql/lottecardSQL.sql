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
INSERT INTO lc_members
	(id, name, telephone, registeredDate, registeredPlace, hasTmoney)
VALUES 
	(lc_members_SEQ.nextval, '고길동', '010-1111-1111', '2018/02/02', '롯데백화점', 'Y');
INSERT INTO lc_members
	(id, name, telephone, registeredDate, registeredPlace, hasTmoney)
VALUES 
	(lc_members_SEQ.nextval, '희동이', '010-2222-2222', '2018/02/10', '송파 이마트', 'N');
INSERT INTO lc_members
	(id, name, telephone, registeredDate, registeredPlace, hasTmoney)
VALUES 
	(lc_members_SEQ.nextval, '마이콜', '010-1234-5678', '2018/03/01', '잠실 롯데마트', 'Y');
INSERT INTO lc_members
	(id, name, telephone, registeredDate, registeredPlace, hasTmoney)
VALUES 
	(lc_members_SEQ.nextval, '홍길동', '010-8888-8888', '2018/03/01', '잠실 롯데마트', 'Y');
INSERT INTO lc_members
	(id, name, telephone, registeredDate, registeredPlace, hasTmoney)
VALUES 
	(lc_members_SEQ.nextval, '김철수', '010-9000-9001', '2018/03/07', '문정동 가든파이브', 'N');
INSERT INTO lc_members
	(id, name, telephone, registeredDate, registeredPlace, hasTmoney)
VALUES 
	(lc_members_SEQ.nextval, '김영희', '010-8309-1211', '2018/03/10', '서초구청', 'Y');
INSERT INTO lc_members
	(id, name, telephone, registeredDate, registeredPlace, hasTmoney)
VALUES 
	(lc_members_SEQ.nextval, '허균', '010-1210-1444', '2018/03/10', '서초구청', 'N');
INSERT INTO lc_members
	(id, name, telephone, registeredDate, registeredPlace, hasTmoney)
VALUES 
	(lc_members_SEQ.nextval, '임숙주', '010-8118-4089', '2018/03/10', '서초구청', 'Y');
