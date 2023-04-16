package rr.project.projekti.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import rr.project.projekti.domain.Diary;
import rr.project.projekti.domain.DiaryRepository;


//Controlleri diaryentryjä varten

@Controller
public class DiaryController {

    @Autowired
    private DiaryRepository diaryRepository;

    //kirjautuminen
    @RequestMapping(value="/login")
    public String login() {
        return "login";
    }


    //toiminnallisuus jolla /diaryentries kohtaan navigoitaessa käyttäjä näkee kirjaamansa merkinnät
    @RequestMapping(value = "/diaryentries", method = RequestMethod.GET)
    public String getDiary(Model model) {
        model.addAttribute("entries", diaryRepository.findAll());
        return "diaryentries";
    }

    //toiminnallisuus jolla nappia painettaessa automaattisesti navigoidaan /add kohtaan jossa käyttäjä voi tehdä merkinnän
    @RequestMapping(value = "/add")
    public String addDiary(Model model){
        model.addAttribute("diary", new Diary());
        return "addentries";
    }

    //toiminnallisuus jolla "save" nappia painettaessa merkintä tallentuu tietokantaan ja käyttäjä navigoidaan takaisin /diaryentries kohtaan
    @PostMapping(value="/save")
    public String save(Diary diary){{
        //TODO: process POST request
        diaryRepository.save(diary);
        
        return "redirect:diaryentries";
    }
}
    //toiminnallisuus jolla käyttäjä voi muokata merkintää painamalla "edit" nappia, jolloin hänet automaattisesti navigoidaan /editdiary/{id} kohtaan

    @RequestMapping(value="/editdiary/{id}", method = RequestMethod.GET)
    public String editDiary(@PathVariable("id") Long diaryId, Model model) {
        model.addAttribute("diary", diaryRepository.findById(diaryId));
        return "editdiary";
    }


    //toiminnallisuus jolla luodaan "delete" nappula, jolla käyttäjä voi helposti poistaa merkinnän 
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteDiary(@PathVariable("id") Long diaryId, Model model) {
        diaryRepository.deleteById(diaryId);
        return "redirect:../diaryentries";
    
    }
}
