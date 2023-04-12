package rr.project.projekti.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import rr.project.projekti.domain.Diary;
import rr.project.projekti.domain.DiaryRepository;




@Controller
public class DiaryController {

    @Autowired
    private DiaryRepository diaryRepository;


        //Display all diary entries
    @RequestMapping(value = "/diaryentries", method = RequestMethod.GET)
    public String getDiary(Model model) {
        model.addAttribute("entries", diaryRepository.findAll());
        return "diaryentries";
    }

    //Add a new diary entry
    @RequestMapping(value = "/add")
    public String addDiary(Model model){
        model.addAttribute("diary", new Diary());
        return "addentries";
    }

    //save a new diary entry
    @PostMapping(value="/save")
    public String save(Diary diary){{
        //TODO: process POST request
        diaryRepository.save(diary);
        
        return "redirect:diaryentries";
    }
}
    //Edit a diary entry

    @RequestMapping(value="/editdiary/{id}", method = RequestMethod.GET)
    public String editDiary(@PathVariable("id") Long diaryId, Model model) {
        model.addAttribute("diary", diaryRepository.findById(diaryId));
        return "editdiary";
    }


    //Delete a diary entry
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteDiary(@PathVariable("id") Long diaryId, Model model) {
        diaryRepository.deleteById(diaryId);
        return "redirect:../diaryentries";
    
    }
}
