### Context file

```xml
<context:component-scan base-package="dao"></context:component-scan>
```

### Sample of using annotation

```java
@Component("Oracle")
public class OracleSqlApplicationDao implements IApplicationDao {
...
```
