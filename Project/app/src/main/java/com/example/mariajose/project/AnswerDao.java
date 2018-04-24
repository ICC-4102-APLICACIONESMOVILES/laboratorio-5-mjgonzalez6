package com.example.mariajose.project;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by MariaJose on 10-04-2018.
 */

@Dao
public interface AnswerDao {

    @Query("SELECT * FROM answer")
    List<Answer> getAll();

    @Insert
    void insertAll(Answer answers);

    @Delete
    void delete(Answer answer);

    @Query("SELECT * FROM repo WHERE qid=:qid")
    List<Answer> findAnswersForQuestions(final int qid);

}
