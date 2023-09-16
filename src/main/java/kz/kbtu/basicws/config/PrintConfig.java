package kz.kbtu.basicws.config;

import kz.kbtu.basicws.model.ColorPrinter;
import kz.kbtu.basicws.model.IPrintable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrintConfig {
    @Bean
    public IPrintable iprintable(){
        return new ColorPrinter();
    }
}
