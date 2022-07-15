package com.clientui.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaulterrordecoder = new Default();

    @Override
    public Exception decode(String invoquer, Response reponse) {
        if(reponse.status() == 400){
            return new ProducetBadRequestException("Requête incorrecte");
        }
        return  defaulterrordecoder.decode(invoquer, reponse);
    }
}
