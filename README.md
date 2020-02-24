## Inversion of Control (IoC)

Spring Framework is built on the Inversion of Control principle. 
Dependency injection is the technique to implement IoC in applications.

### About this example

In this very sample project i try to use bean control from context file.
Let's say you have to use special databases on your project. 
And you want to use them only changing one string variable.
On the App.java file you just have to change variable value to use database bean.


##### About context file

```xml
<bean id="Oracle" class="dao.OracleSqlApplicationDao"/>

<bean id="MsSql" class="dao.MsSqlApplicationDao"/>

<bean id="MySql" class="dao.MySqlApplicationDao"/>
```

#### Main method

```java
String database = "MySql"; //Oracle, MySql or MsSql

//Read appContext file
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
//Get database bean from context.
ApplicationManager app = new ApplicationManager(context.getBean(database, IApplicationDao.class));

app.create();
```
