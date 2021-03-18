package com.markcwg.datatest;

import com.markcwg.datatest.entity.Duplicate;
import com.markcwg.datatest.utils.DuplicateFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootTest
class DataTestApplicationTests {

    @Autowired
    RestTemplate restTemplate;
    @Value("${sys.url}")
    private String url;

    @Test
    void testOne() {
        MultiValueMap<String,Object> request = new LinkedMultiValueMap<>();
        Duplicate data = DuplicateFactory.productOne();
        request.add("duplicate",data);

        String s = restTemplate.postForObject(url + "/data", request, String.class);
        System.out.println(s);
    }

    @Test
    void testBatch () {
        MultiValueMap<String,Object> request = new LinkedMultiValueMap<>();
        List<Duplicate> data = DuplicateFactory.productBatch();
        request.add("duplicates",data);

        String s = restTemplate.postForObject(url + "/batch", request, String.class);
        System.out.println(s);
    }

}
