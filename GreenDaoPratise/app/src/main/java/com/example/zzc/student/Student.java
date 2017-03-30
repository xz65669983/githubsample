package com.example.zzc.student;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;

import java.util.Date;

/**
 * Created by zzc on 2017/3/12.
 */
@Entity(indexes = {
        @Index(value = "text, date DESC", unique = true)
})
public class Student {
    @Id
    private Long id;

    @NotNull
    private String text;
    private Date date;
    private String name;
    private int age;
@Generated(hash = 2013622307)
public Student(Long id, @NotNull String text, Date date, String name, int age) {
    this.id = id;
    this.text = text;
    this.date = date;
    this.name = name;
    this.age = age;
}
@Generated(hash = 1556870573)
public Student() {
}
public Long getId() {
    return this.id;
}
public void setId(Long id) {
    this.id = id;
}
public String getText() {
    return this.text;
}
public void setText(String text) {
    this.text = text;
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

    @Override
    public String toString() {
        return new StringBuilder("").append(getId()+"\n")
                .append(getAge()+"\n").append(getText()+"\n")
                .append(getDate()+"\n").toString();
    }
}
