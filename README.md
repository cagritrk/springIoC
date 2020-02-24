# Using Constuctor Injection

In this branch i use Constructor Injection (Setter Injection)

### Context File
```xml
<bean id="database" class="dao.OracleSqlApplicationDao"/>


<bean id="service" class="service.ApplicationManager">
  <property name="database" ref="database"></property>
</bean>
```

### App.java

```java
//Read appContext file
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
//Get database bean from context.
IApplicationService app = context.getBean("service", IApplicationService.class);

app.create();
```

### ApplicationManager.java

```java
private IApplicationDao database;

public void setDatabase(IApplicationDao database) {
  this.database = database;
}

@Override
public void create() {
  System.out.println("New App creating...");
  database.add();	
}
```
