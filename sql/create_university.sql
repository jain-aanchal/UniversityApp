DROP TABLE IF EXISTS  university ;

CREATE TABLE IF NOT EXISTS `university` (
`id` INT NOT NULL ,
`name` VARCHAR( 128 )  COLLATE utf8_unicode_ci NOT NULL ,
`address1` VARCHAR( 64 ) NOT NULL ,
`address2` VARCHAR( 64 ) NULL DEFAULT NULL ,
`addressNum` INT NULL ,
`state` VARCHAR( 64 ) NOT NULL ,
`city` VARCHAR( 64 ) NOT NULL ,
`country` VARCHAR( 64 ) NOT NULL ,
`zipcode` VARCHAR( 20 ) NOT NULL ,
PRIMARY KEY ( `id` ) ,
UNIQUE (`name`)
) ENGINE = INNODB DEFAULT CHARSET=utf8 COMMENT = 'University Data Table';