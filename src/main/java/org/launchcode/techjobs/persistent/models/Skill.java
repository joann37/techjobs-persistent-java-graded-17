package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 1, max = 500)
    private String description;

    @ManyToMany(mappedBy="skills")
    @NotNull
    private List<Job> jobs=new ArrayList<>();

    public Skill() {
    }
    @Size(min = 1, max = 500)
    public Skill(String description) {
        super();
        this.description = description;

    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
