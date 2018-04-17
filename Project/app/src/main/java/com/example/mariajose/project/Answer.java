package com.example.mariajose.project;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by MariaJose on 10-04-2018.
 */

@Entity
public class Answer {
    @PrimaryKey
    private int aid;

    @ColumnInfo(name = "text")
    private String answerText;

    public Answer() {
    }

    public int getAnswerId(){return aid;}
    public String getAnswerText() {return answerText;}
    public void setAnswerText(String answerText){this.answerText = answerText;}

}
