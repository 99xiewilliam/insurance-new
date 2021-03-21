package com.insurance.demo.controller;

import com.insurance.demo.pojo.projectName;
import com.insurance.demo.service.projectNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ProjectName")
public class projectNameController {
    @Autowired
    private projectNameService projectNameService;

    @GetMapping("getProjectName")
    public List<projectName> getName() {
        List<projectName> pros;
        pros = projectNameService.getName();
        return pros;
    }

}
