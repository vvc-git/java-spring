package com.vvc.first_spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// // Anotação para definir a classe como uma fonte de configurações de beans
@Configuration
public class HelloConfiguration {

    // Anotação para o Spring saber que esse método retorna um bean gerenciado pelo Spring.
    // Isso permite que a classe SDKAWS, que não é gerenciada automaticamente pelo Spring, seja instanciada e injetada onde for necessário.

    //    @Bean
    //    public SDKAWS sdkAWS() {
    //        return new SDKAWS();
    //    }
    //
}
