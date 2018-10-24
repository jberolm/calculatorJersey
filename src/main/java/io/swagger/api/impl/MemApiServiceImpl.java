package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;



import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-10-24T19:54:08.502Z[GMT]")

public class MemApiServiceImpl extends MemApiService {
    
    @Override
    public Response storeData( @NotNull Integer value, SecurityContext securityContext) throws NotFoundException {
        System.out.println("Storing the value:" + value);
        return Response.ok().entity(true).build();
    }
    
}

