package base;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 用作配置的类
 */
@Configuration
@ImportResource("classpath:xml-config/mybatis.xml")
public class AppConfig {
}
