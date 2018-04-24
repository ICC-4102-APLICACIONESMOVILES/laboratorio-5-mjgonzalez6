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
public interface QuestionDao {

    @Query("SELECT * FROM question")
    List<Question> getAll();

    @Insert
    void insertAll(Question questions);

    @Delete
    void delete(Question question);
}
