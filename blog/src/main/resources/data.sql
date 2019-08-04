insert into USERS (ID, NAME, PASSWORD, EMAIL, CREATED_AT) values (3,'Mike Charles', 'ewewxsadwczzBHJHJH', 'mike@charles.com', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'));
insert into USERS (ID, NAME, PASSWORD, EMAIL, CREATED_AT) values (2,'Gary Patrik', 'Bw3dwdwasaBHJHJH', 'gary@patrik.com', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'));
insert into USERS (ID, NAME, PASSWORD, EMAIL, CREATED_AT) values (1,'Johan Mathew', 'BJHBHJHJH', 'johan@mathew.com', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'));

insert into CATEGORIES (ID, NAME, CREATED_AT, CREATED_BY) values (1,'Java', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'),1);
insert into CATEGORIES (ID, NAME, CREATED_AT, CREATED_BY) values (2,'PHP', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'),2);
insert into CATEGORIES (ID, NAME, CREATED_AT, CREATED_BY) values (3,'MYSQL', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'),2);

insert into TAGS (ID, NAME, CREATED_AT, CREATED_BY) values (2,'Spring 5', PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'),2);
insert into TAGS (ID, NAME, CREATED_AT, CREATED_BY) values (1,'Spring Boot', PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'),3);
insert into TAGS (ID, NAME, CREATED_AT, CREATED_BY) values (3,'Clean code', PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'),1);

insert into BLOG (ID, TITLE, BODY, USER_ID, CATEGORY_ID, CREATED_AT) values (1001,'Test blog', 'Test blog body', 1, 2, PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'));
insert into BLOG (ID, TITLE, BODY, USER_ID, CATEGORY_ID, CREATED_AT) values (1002,'more blogs', 'more blog body', 1, 2, PARSEDATETIME ('04-08-19 11:34:24','dd-MM-yy hh:mm:ss'));

insert into BLOG_TAGS (BLOG_ID, TAG_ID) values (1001, 2);
insert into BLOG_TAGS (BLOG_ID, TAG_ID) values (1001, 3);
insert into BLOG_TAGS (BLOG_ID, TAG_ID) values (1002, 1);

insert into COMMENTS (ID, COMMENT, CREATED_BY, BLOG_ID, CREATED_AT) values (1, 'Very nice article', 1, 1001, PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'));
insert into COMMENTS (ID, COMMENT, CREATED_BY, BLOG_ID, CREATED_AT) values (2, 'Good job!', 2, 1001, PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'));