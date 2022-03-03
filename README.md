# BigBank

Prot :8084

The MVC design pattern.

Spring security; 
multi-role access to a separate page after logging in.

users added with data.sql file;
email : admin@yahoo.com and password: 12 -> this user has MANAGER role.
email : n@yahoo.com and password: 12 -> this user has WORKER role.

Only the worker has access to the profile page.
Only the manager has access to the admin page.

profile: The user can calculate a customized loan and receive a response indicating whether or not the loan is valid.

admin: display the number of times the calculator method has been invoked.

DataBase: h2
obeserving data in this link;
/h2-console
