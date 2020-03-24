package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2020-03-24T13:09:54.672Z")

@RestSchema(schemaId = "projectl1o1")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectl1o1Impl {

    @Autowired
    private Projectl1o1Delegate userProjectl1o1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectl1o1Delegate.helloworld(name);
    }

}
