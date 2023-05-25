package app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // @Configuration означает, что данный класс является конфигурацией
@ComponentScan(basePackages = "app") //С помощью аннотации @ComponentScan мы показываем, какой пакет нужно сканировать на наличие бинов и разных аннотаций
public class AppConfig {
}
