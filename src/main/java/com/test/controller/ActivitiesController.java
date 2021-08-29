package com.test.controller;

import com.test.dto.ActivitiesDto;
import com.test.dto.ActivitiesDto_DB;
import com.test.service.activities.ActivitiesService;
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
import java.util.ArrayList;

@Controller
public class ActivitiesController {

    @Autowired
    ActivitiesService activitiesService;

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

    @RequestMapping(value = "/admin/delete_activities.do", method = RequestMethod.GET)
    public String delete(@RequestParam(value = "number") String number){
        try{
            System.out.println("number: " + number);
            activitiesService.deleteActivities(number);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/admin";
    }

    @RequestMapping(value = "/admin/create_activities/insert_activities.do", method = RequestMethod.POST)
    public String insert_activities(Model model,
                                    ActivitiesDto aDto){
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
            String relativeFolder =  "resources" + File.separator + "activities_poster" + File.separator + (aDto.getPoster()).getOriginalFilename();
            String filename = webappRoot + relativeFolder;
            FileCopyUtils.copy((aDto.getPoster()).getBytes(), new File(filename));

            activitiesService.addActivities(aDto.getName(), aDto.getCategory(), aDto.getTarget(),
                    aDto.getDate(), aDto.getLink(), relativeFolder, aDto.getBenefits(), aDto.getHost());

            System.out.println(filename);
            System.out.println("End insert_activities");

        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/admin";
    }
}
