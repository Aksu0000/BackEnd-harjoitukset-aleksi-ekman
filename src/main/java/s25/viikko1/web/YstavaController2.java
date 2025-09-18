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

public class YstavaController2 {

    public static List<Ystava> ystavat = new ArrayList<>();

        static {
            ystavat.add(new Ystava("Tupu", "Ankka"));
            ystavat.add(new Ystava("Hupu", "Ankka"));
            ystavat.add(new Ystava("Lupu", "Ankka"));
        }
    
     @GetMapping("/kaikkiystavat")
    public String showYstavat(Model model) {
        model.addAttribute("ystavat", ystavat);
        model.addAttribute("ystava", new Ystava());
        return "addallfriends";
    }

	@PostMapping("/kaikkiystavat")
	public String ystavaSubmit(@ModelAttribute Ystava ystava, Model model) {
        ystavat.add(ystava);
		model.addAttribute("ystavat", ystavat);
        model.addAttribute("ystava", new Ystava());
		return "addallfriends";  // allfriends.html
	}
}
