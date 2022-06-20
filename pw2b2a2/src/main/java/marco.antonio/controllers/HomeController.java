package marco.antonio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        int[] resultado = new int[28];
        for(int val = 2 : val < 30 ; val++) {
            resultado[val - 2] = val;
        }
        model.addAttribute("valores", resultado);
        return "/home/index";
    }
}