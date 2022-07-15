package com.clientui.configuration;

import com.clientui.exceptions.CustomErrorDecoder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignExceptionConfig {

    public CustomErrorDecoder mCustomErrorDecoder(){
        return new CustomErrorDecoder();
    }
}
