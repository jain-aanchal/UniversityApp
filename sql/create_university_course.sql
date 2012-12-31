DROP TABLE IF EXISTS  university_course ;

CREATE TABLE IF NOT EXISTS `university_course` (
`id` INT NOT NULL ,
`university_id` INT NOT NULL ,
`course_id` INT NOT NULL ,
`fee` INT NOT NULL,
`currency` VARCHAR( 128 ) NOT NULL DEFAULT 'US_DOLLAR',
PRIMARY KEY ( `id` ) ,
FOREIGN KEY (university_id) REFERENCES university(id),
FOREIGN KEY (course_id) REFERENCES course(id)
) ENGINE = INNODB DEFAULT CHARSET=utf8 COMMENT = 'University Course Data Table';