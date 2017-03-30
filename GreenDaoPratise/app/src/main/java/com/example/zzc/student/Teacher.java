package com.example.zzc.student;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by zzc on 2017/3/13.
 */
@Entity
public class Teacher {
    @Id
    private Long id;
    @NotNull
    private String occupation;
    private Date date;
    private String name;
    private int age;
    @Generated(hash = 1363284414)
    public Teacher(Long id, @NotNull String occupation, Date date, String name,
            int age) {
        this.id = id;
        this.occupation = occupation;
        this.date = date;
        this.name = name;
        this.age = age;
    }
    @Generated(hash = 1630413260)
    public Teacher() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getOccupation() {
        return this.occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public Date getDate() {
        return this.date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
