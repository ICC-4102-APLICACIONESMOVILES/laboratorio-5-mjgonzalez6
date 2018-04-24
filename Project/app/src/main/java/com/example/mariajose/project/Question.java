package com.example.mariajose.project;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by MariaJose on 10-04-2018.
 */

@Entity
public class Question {
    @PrimaryKey
    private int qid;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "text")
    private String text;

    public int getQid() {
        return qid;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(String type) {
        this.type = type;
    }
}
