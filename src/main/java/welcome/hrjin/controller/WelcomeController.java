package welcome.hrjin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by hrjin on 2020-07-06.
 */
@Controller
public class WelcomeController {

    @GetMapping(value = {"/welcome", "/"})
    public ModelAndView getWelcome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myName", "hrjin");

        SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd");
        SimpleDateFormat format2 = new SimpleDateFormat ( "HH:mm:ss");

        Calendar time = Calendar.getInstance();

        mv.addObject("date", format1.format(time.getTime()));
        mv.addObject("time", format2.format(time.getTime()));

        mv.setViewName("/welcome");
        return mv;
    }
}
