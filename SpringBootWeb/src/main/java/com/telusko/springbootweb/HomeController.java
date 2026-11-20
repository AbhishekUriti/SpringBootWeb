package com.telusko.springbootweb;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

        @ModelAttribute("course")
        public String courseName(){
            return "Java";
        }


        @RequestMapping("/")
        public String home(){
            System.out.println("Home Method called");
            return "index";
        }

//        @RequestMapping("add")
//        public String add(@RequestParam("num1") int num, int num2, HttpServletRequest req, HttpSession session, Model model){
//
////          int num1= Integer.parseInt(req.getParameter("num1"));
////          int num2= Integer.parseInt(req.getParameter("num2"));
//
//          int result=num+num2;
//            System.out.println(result);
////            session.setAttribute("result",result);
//            model.addAttribute("result",result);
//            return "result";
//        }
//    @RequestMapping("add")
//    public ModelAndView add(int num1, int num2, ModelAndView mv){
//        int result=num1+num2;
//        mv.addObject("result",result);
//        mv.setViewName("result");
//        return mv;
//    }

    @RequestMapping("addAlien")
    public String  addAlien(@ModelAttribute("alien1") Alien alien){
//        Alien alien=new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);

        return "result";
    }

}
