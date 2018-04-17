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

    @ColumnInfo(name = "text")
    private String text;
}
