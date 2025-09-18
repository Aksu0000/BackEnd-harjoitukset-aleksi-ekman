package s25.viikko1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import s25.viikko1.domain.Ystava;

import java.util.List;
import java.util.ArrayList;

@Controller

public class YstavaController {

    public static List<Ystava> ystavat = new ArrayList<>();

        static {
            ystavat.add(new Ystava("Tupu", "Ankka"));
            ystavat.add(new Ystava("Hupu", "Ankka"));
            ystavat.add(new Ystava("Lupu", "Ankka"));
        }
    
     @GetMapping("/ystavat")
    public String showYstavat(Model model) {
        model.addAttribute("ystavat", ystavat);
        return "allfriends";
    }

    @GetMapping("/uusiystava")
	public String ystavaForm(Model model) {
		model.addAttribute("ystava", new Ystava());
		return "addfriends"; // addfriends.html
	}

	@PostMapping("/uusiystava")
	public String ystavaSubmit(@ModelAttribute Ystava ystava, Model model) {
        ystavat.add(ystava);
		model.addAttribute("ystavat", ystavat);
		return "allfriends";  // allfriends.html
	}
}
