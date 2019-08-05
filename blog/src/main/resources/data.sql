insert into USERS (ID, NAME, PASSWORD, EMAIL, CREATED_AT) values (3,'Mike Charles', 'ewewxsadwczzBHJHJH', 'mike@charles.com', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'));
insert into USERS (ID, NAME, PASSWORD, EMAIL, CREATED_AT) values (2,'Gary Patrik', 'Bw3dwdwasaBHJHJH', 'gary@patrik.com', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'));
insert into USERS (ID, NAME, PASSWORD, EMAIL, CREATED_AT) values (1,'Johan Mathew', 'BJHBHJHJH', 'johan@mathew.com', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'));

insert into CATEGORIES (ID, NAME, CREATED_AT, CREATED_BY) values (1,'Tech News', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'),1);
insert into CATEGORIES (ID, NAME, CREATED_AT, CREATED_BY) values (2,'Social', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'),2);
insert into CATEGORIES (ID, NAME, CREATED_AT, CREATED_BY) values (3,'Gaming', PARSEDATETIME ('31-08-19 11:34:24','dd-MM-yy hh:mm:ss'),2);

insert into TAGS (ID, NAME, CREATED_AT, CREATED_BY) values (1,'Robot', PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'),3);
insert into TAGS (ID, NAME, CREATED_AT, CREATED_BY) values (2,'Blockchain', PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'),2);
insert into TAGS (ID, NAME, CREATED_AT, CREATED_BY) values (3,'Social Media', PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'),1);
insert into TAGS (ID, NAME, CREATED_AT, CREATED_BY) values (4,'PUBG', PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'),1);
insert into TAGS (ID, NAME, CREATED_AT, CREATED_BY) values (5,'Mobile', PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'),1);

insert into BLOG (ID, TITLE, BODY, USER_ID, CATEGORY_ID, CREATED_AT) values (1001,'IBM and other companies launch new blockchain network for supply management', 'International Business Machines Corp announced on Monday a new blockchain network aimed at improving manual and cumbersome supply chain management.', 1, 1, PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'));
insert into BLOG (ID, TITLE, BODY, USER_ID, CATEGORY_ID, CREATED_AT) values (1002,'Robots will help people with disabilities at the 2020 Tokyo Olympics', 'Japanese car giant Toyota will have a bunch of innovative robots at the Olympics that will help the attendees, especially those who are physically disabled', 1, 1, PARSEDATETIME ('04-08-19 11:34:24','dd-MM-yy hh:mm:ss'));
insert into BLOG (ID, TITLE, BODY, USER_ID, CATEGORY_ID, CREATED_AT) values (1003,'Facebook, Instagram went down in several parts of the world', 'Social media network Facebook went down for several users across the world. As soon as one tried to log in to Facebook, instead of the homepage, an error message appeared. The message read, “Sorry, something went wrong. We’re working on getting this fixed as soon as we can.”', 1, 2, PARSEDATETIME ('04-08-19 11:34:24','dd-MM-yy hh:mm:ss'));
insert into BLOG (ID, TITLE, BODY, USER_ID, CATEGORY_ID, CREATED_AT) values (1004,'PUBG Mobile Beta 0.14.0 update: Here’s how to download and play', 'Tencent Games has officially released the beta version 0.14.0 update of the PUBG Mobile. The update brings several new updates like new Zombie Infected mode, Daily mission improvements, UI changes, new items, cosmetics, and several bug fixes to the game. As the final release is yet to roll out, players can still download the beta package file for both Android as well as iOS platform and try out all the new features.', 1, 3, PARSEDATETIME ('04-08-19 11:34:24','dd-MM-yy hh:mm:ss'));

insert into BLOG_TAGS (BLOG_ID, TAG_ID) values (1001, 2);
insert into BLOG_TAGS (BLOG_ID, TAG_ID) values (1002, 1);
insert into BLOG_TAGS (BLOG_ID, TAG_ID) values (1003, 3);
insert into BLOG_TAGS (BLOG_ID, TAG_ID) values (1004, 4);
insert into BLOG_TAGS (BLOG_ID, TAG_ID) values (1004, 5);

insert into COMMENTS (ID, COMMENT, CREATED_BY, BLOG_ID, CREATED_AT) values (1, 'Very nice article', 1, 1001, PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'));
insert into COMMENTS (ID, COMMENT, CREATED_BY, BLOG_ID, CREATED_AT) values (2, 'Good job!', 2, 1001, PARSEDATETIME ('31-05-19 11:34:24','dd-MM-yy hh:mm:ss'));