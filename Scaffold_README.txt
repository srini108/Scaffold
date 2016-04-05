
Pre-requistes
Technologies:  Java 1.7, Oracle 10g, Hibernate 5.1.0, Servlets, JSP, Tomcat server v7
CLASSPATH: JAVA_HOME, ANT_HOME (Make sure JAVA_HOME and JRE_HOME pointing to same versions)


Steps to build and  deploy

i.   Unzip SCAFFOLD-PROJECT.zip file. 
ii.  Execute sql\Scaffold_DB_Script.sql in oracle DB (This will create tables and Metadata)
iii. Replace following in conf\hibernate.cfg.xml file
	a.<<server_addr>> -> Database server 
	b.<<SID>> -> Sid name of DB
	c.<<username>> -> User Name of database
	d.<<password>> -> Password of database
iv. Run "ant". (This will create scaffold.war under dist folder)
v.  Copy scaffold.war in tomcat webapps folder and start the server


Run Application:

http://<<serverhost>>:port/scaffold/listProjController