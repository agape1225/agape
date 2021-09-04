package com.test.controller;

import com.test.dto.ActivitiesDto_DB;
import com.test.dto.AdminLoginDto;
import com.test.dto.TestDto;
import com.test.service.activities.ActivitiesService;
import com.test.service.adminLogin.AdminLoginService;
import com.test.service.test.TestService;
import com.test.util.firebase.FirebaseMessagingSnippets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class AdminController {

    @Autowired
    TestService testService;
    @Autowired
    AdminLoginService adminLoginService;
    @Autowired
    FirebaseMessagingSnippets firebaseMessagingSnippets;
    @Autowired
    ActivitiesService activitiesService;

    @GetMapping("/admin")
    public String admin_main(Model model){
        try{

            ArrayList<ActivitiesDto_DB> activities = activitiesService.getActivities();
            model.addAttribute("activities", activities);

        }catch (Exception e){
            e.printStackTrace();
        }
        return "admin/admin";
    }

    @GetMapping("/admin/login")
    public String admin_login(Model model){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
        return "admin/admin_login";
    }

    @RequestMapping(value = "/admin/login/check.do", method = RequestMethod.POST)
    public String admin_check_login(@RequestParam(value = "id") String id,
                                    @RequestParam(value = "pw") String pw,
                                    HttpSession session){
        try{

            System.out.println("admin login check start");
            ArrayList<AdminLoginDto> admin_info = adminLoginService.getLoginInfo();
            AdminLoginDto result = admin_info.get(0);

            if(result != null){
                System.out.println("input_id: " + id);
                System.out.println("input_pw: " + pw);

                System.out.println("admin_id: " + result.getAdmin_id());
                System.out.println("admin_pw: " + result.getAdmin_pw());

                if(id.equals(result.getAdmin_id()) && pw.equals(result.getAdmin_pw())){
                    session.setAttribute("adminLogin",result);
                    return "redirect:/admin";
                }
            }else{
                System.out.println("result is null");
            }



        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/admin/login";
    }
}
