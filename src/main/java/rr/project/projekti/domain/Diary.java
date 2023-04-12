package rr.project.projekti.domain;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String activity;
    private String date;
    private String kcal;
    private String mood;

    /*@ManyToOne
    @JoinColumn(name = "userid")
    */

    public Diary() {
    }

    public Diary(String activity, String date, String kcal, String mood) {
        super();
        this.activity = activity;
        this.date = date;
        this.kcal = kcal;
        this.mood = mood;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }


        @Override
        public String toString() {
            return "Diary [activity=" + activity + ", date=" + date + ", id=" + id + ", kcal=" + kcal + ", mood=" + mood
                    + "]";
        }
    
}
