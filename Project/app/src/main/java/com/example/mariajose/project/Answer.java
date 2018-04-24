package com.example.mariajose.project;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by MariaJose on 10-04-2018.
 */

@Entity(foreignKeys = @ForeignKey(entity = Question.class, parentColumns = "uid", childColumns = "aid", onDelete = CASCADE))
public abstract class Answer {
    @PrimaryKey
    private int aid;

    @ColumnInfo(name = "text")
    private String answerText;

    public Answer() {
    }

    public int getAid() {
        return aid;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }


}
