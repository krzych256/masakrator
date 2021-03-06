INSERT INTO [USER] (USERNAME, PASSWORD, EMAIL, ENABLED, LASTPASSWORDRESETDATE, PREMIUM, ALLPOINTS) VALUES ('admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin@admin.com', 1, '01-01-2016', 100, 100);
INSERT INTO [USER] (USERNAME, PASSWORD, EMAIL, ENABLED, LASTPASSWORDRESETDATE, PREMIUM, ALLPOINTS) VALUES ('user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'enabled@user.com', 1, '01-01-2016', 100, 100);

INSERT INTO AUTHORITY (NAME) VALUES ('ROLE_USER');
INSERT INTO AUTHORITY (NAME) VALUES ('ROLE_ADMIN');

INSERT INTO USERAUTHORITY (USER_ID, AUTHORITY_ID) VALUES (1, 1);
INSERT INTO USERAUTHORITY (USER_ID, AUTHORITY_ID) VALUES (1, 2);
INSERT INTO USERAUTHORITY (USER_ID, AUTHORITY_ID) VALUES (2, 1);

INSERT INTO TOWN (NAME, POINTS, POINTX, POINTY, IRON, WOOD, CLAY, MANA) VALUES ('MIASTO1', 100, 1, 1, 1000, 1000, 1000, 1000);
INSERT INTO TOWN (NAME, POINTS, POINTX, POINTY, IRON, WOOD, CLAY, MANA) VALUES ('MIASTO2', 100, 2, 2, 1000, 1000, 1000, 1000);

INSERT INTO USERTOWN (USER_ID, TOWN_ID) VALUES (2, 1);
INSERT INTO USERTOWN (USER_ID, TOWN_ID) VALUES (2, 2);

INSERT INTO BUILDING (NAME, DESCRIPTION) VALUES ('RATUSZ', 'Ratusz jest sercem miasta.');
INSERT INTO BUILDING (NAME, DESCRIPTION) VALUES ('KOSZARY', 'W koszarach rekrutujemy wojsko.'); 
INSERT INTO BUILDING (NAME, DESCRIPTION) VALUES ('MUR', 'Mur chroni nas przed najezdzcami.');

INSERT INTO TOWNBUILDING (TOWN_ID, BUILDING_ID, [LEVEL]) VALUES (1, 1, 1);
INSERT INTO TOWNBUILDING (TOWN_ID, BUILDING_ID, [LEVEL]) VALUES (1, 2, 1);
INSERT INTO TOWNBUILDING (TOWN_ID, BUILDING_ID, [LEVEL]) VALUES (1, 3, 1);

INSERT INTO TOWNBUILDING (TOWN_ID, BUILDING_ID, [LEVEL]) VALUES (2, 1, 1);
INSERT INTO TOWNBUILDING (TOWN_ID, BUILDING_ID, [LEVEL]) VALUES (2, 2, 1);
INSERT INTO TOWNBUILDING (TOWN_ID, BUILDING_ID, [LEVEL]) VALUES (2, 3, 1);

INSERT INTO SOLDIERTYPE (NAME, DESCRIPTION, STRENGHT, DEFENCE, HP, SPEED) VALUES ('Miecznik', 'Miecznicy mają miecze.', 100, 100, 100, 20);
INSERT INTO SOLDIERTYPE (NAME, DESCRIPTION, STRENGHT, DEFENCE, HP, SPEED) VALUES ('Łucznik', 'Łuczniki mają łuki.', 200, 50, 80, 30);
INSERT INTO SOLDIERTYPE (NAME, DESCRIPTION, STRENGHT, DEFENCE, HP, SPEED) VALUES ('Rycerz', 'Rycerze mają konia', 300, 200, 200, 50);

INSERT INTO TOWNSOLDIERTYPE (TOWN_ID, SOLDIERTYPE_ID, QUANTITY) VALUES (1, 1, 100);
INSERT INTO TOWNSOLDIERTYPE (TOWN_ID, SOLDIERTYPE_ID, QUANTITY) VALUES (1, 2, 100);
INSERT INTO TOWNSOLDIERTYPE (TOWN_ID, SOLDIERTYPE_ID, QUANTITY) VALUES (1, 3, 100);

INSERT INTO TOWNSOLDIERTYPE (TOWN_ID, SOLDIERTYPE_ID, QUANTITY) VALUES (2, 1, 100);
INSERT INTO TOWNSOLDIERTYPE (TOWN_ID, SOLDIERTYPE_ID, QUANTITY) VALUES (2, 2, 100);
INSERT INTO TOWNSOLDIERTYPE (TOWN_ID, SOLDIERTYPE_ID, QUANTITY) VALUES (2, 3, 100);

SELECT * FROM [USER]
SELECT * FROM AUTHORITY
SELECT * FROM USERAUTHORITY
SELECT * FROM TOWN
SELECT * FROM USERTOWN
SELECT * FROM BUILDING
SELECT * FROM TOWNBUILDING
SELECT * FROM TOWNSOLDIERTYPE
SELECT * FROM SOLDIERTYPE