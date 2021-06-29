package com.example;

import com.example.models.MethodResponse;
import com.example.utils.ResponseConverter;
import com.example.utils.ResponseConverterV2;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class XmlConverterTest {


    XmlMapper xmlMapper;


    @BeforeEach
    public void setUp(){
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        xmlMapper = new XmlMapper(module);
    }

//    @SneakyThrows
//    @Test
//    public void testFailResponse(){
//        MethodResponse methodResponse = xmlMapper.readValue(DiamondResponses.FAIL_RESPONSE, MethodResponse.class);
//        System.out.println(methodResponse);
//        ResponseConverter.responseMap(methodResponse);
//    }
//
//    @SneakyThrows
//    @Test
//    public void testResponse102(){
//        MethodResponse methodResponse = xmlMapper.readValue(DiamondResponses.RESPONSE_102, MethodResponse.class);
//        System.out.println(methodResponse);
//        ResponseConverter.responseMap(methodResponse);
//    }
//
    @SneakyThrows
    @Test
    public void testSuccess(){

        MethodResponse methodResponse = xmlMapper.readValue(DiamondResponses.SUCCESS_RESPONSE, MethodResponse.class);
        System.out.println(methodResponse);

        ResponseConverterV2.responseMap(methodResponse);
    }

}
