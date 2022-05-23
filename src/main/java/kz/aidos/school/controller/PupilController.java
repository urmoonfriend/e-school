package kz.aidos.school.controller;

import kz.aidos.school.mapper.PupilMapper;
import kz.aidos.school.model.Pupil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PupilController {
    private PupilMapper pupilMapper;

    public PupilController(PupilMapper pupilMapper) {
        this.pupilMapper = pupilMapper;
    }

    @GetMapping("/pupils")
    public String getAll(Model model){
        List<Pupil> pupils = pupilMapper.findAll();
        model.addAttribute("pupils", pupils);
        return "pupil-list";
    }

    @GetMapping("/pupil-create")
    public String createdPupilForm(Model model){
        model.addAttribute("pupil", new Pupil());
        return "pupil-create";
    }

    @PostMapping("/pupil-create")
    public String createPupil(@ModelAttribute("pupil") Pupil pupil){
        pupilMapper.save(pupil);
        return "redirect:/pupils";
    }

    @GetMapping("/pupil-delete/{id}")
    public String deletePupil(@PathVariable("id") Long id){
        pupilMapper.delete(id);
        return "redirect:/pupils";
    }
}
