package se.cljungblad.springcoretraining.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

@Configuration
@PropertySource("application.properties")
public class SpringConfiguration {

    //This is needed to be able to inject properties that has another type than String, for example float
    //Note that it need to be static since spring needs the convertionService before the config class has been instanciated
    //It is now possible to convert comma separated strings to common generic collection types like float[] and LocalDate[]
    @Bean
    public static ConversionService conversionService() {
        return new DefaultFormattingConversionService();
    }
}

