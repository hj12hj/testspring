package Config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

//配置类
@ComponentScan(basePackages = "pojo")
@Import(subconfig.class)
@PropertySource("name.properties")
public class spconfig {

}