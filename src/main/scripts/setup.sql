create database discregistry;

use discregistry;

CREATE TABLE Artist (
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE Song (
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	artistId INT NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE TopList (
	id INT NOT NULL AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
	shortTitle VARCHAR(10) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE StatisticsRecord (
	id INT NOT NULL AUTO_INCREMENT,
	topListId INT NOT NULL,
	place INT NOT NULL,
	month INT NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE Disc (
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE Disc_Song_Join (
	discId INT NOT NULL,
	songId INT NOT NULL,
	PRIMARY KEY (discId, songId)
);

CREATE TABLE Song_StatisticsRecord_Join (
	songId INT NOT NULL,
	statisticsRecordId INT NOT NULL,
	PRIMARY KEY (songId, statisticsRecordId)
);
