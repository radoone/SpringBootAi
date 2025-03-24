package ibm.com.demo.springbootai.controller;

import ibm.com.demo.springbootai.model.Bubble;
import ibm.com.demo.springbootai.repository.BubbleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bubbles")
public class BubbleController {

    @Autowired
    private BubbleRepository bubbleRepository;

    @GetMapping
    public String listBubbles(Model model) {
        model.addAttribute("bubbles", bubbleRepository.findAll());
        model.addAttribute("newBubble", new Bubble());
        return "bubbles";
    }

    @PostMapping
    public String addBubble(@ModelAttribute Bubble bubble) {
        bubbleRepository.save(bubble);
        return "redirect:/bubbles";
    }

    @GetMapping("/{id}")
    public String showBubble(@PathVariable Long id, Model model) {
        model.addAttribute("bubble", bubbleRepository.findById(id).orElseThrow());
        return "bubble-detail";
    }
} 