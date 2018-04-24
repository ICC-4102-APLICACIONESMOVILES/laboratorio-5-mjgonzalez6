package com.example.mariajose.project;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by MariaJose on 10-04-2018.
 */

@Database(entities = {Answer.class, Question.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AnswerDao answerDao();
    public abstract QuestionDao questionDao();
}