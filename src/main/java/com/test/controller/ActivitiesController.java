package com.test.controller;

import com.test.dto.ActivitiesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;

@Controller
public class ActivitiesController {

    @Autowired
    ServletContext servletContext;

    @GetMapping("/admin/create_activities")
    public String create_activities(Model model){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
        return "admin/create_activities";
    }

    @RequestMapping(value = "/admin/create_activities/insert_activities.do", method = RequestMethod.POST)
    public String insert_activities(Model model,
                                    ActivitiesDto aDto/*,
                                    @RequestParam("poster") MultipartFile file*/){
        try{

            System.out.println("Start insert_activities");
            System.out.println(aDto.getName());
            System.out.println(aDto.getCategory());
            System.out.println(aDto.getTarget());
            System.out.println(aDto.getDate());
            System.out.println(aDto.getLink());
            System.out.println(aDto.getBenefits());
            System.out.println(aDto.getHost());

            String webappRoot = servletContext.getRealPath("/");
            String relativeFolder =  "resources" + File.separator + "activities_poster" + File.separator;
            String filename = webappRoot + relativeFolder + (aDto.getPoster()).getOriginalFilename();
            FileCopyUtils.copy((aDto.getPoster()).getBytes(), new File(filename));

            System.out.println(filename);
            System.out.println("End insert_activities");

        }catch (Exception e){
            e.printStackTrace();
        }
        return "admin/create_activities";
    }
}