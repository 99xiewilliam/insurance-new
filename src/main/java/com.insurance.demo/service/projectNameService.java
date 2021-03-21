package com.insurance.demo.service;

import com.insurance.demo.pojo.projectName;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class projectNameService {
    private MongoTemplate mongoTemplate;

    public projectNameService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
    public List<projectName> getName() {

        List<projectName> pros = mongoTemplate.findAll(projectName.class);

        return pros;
    }
}
