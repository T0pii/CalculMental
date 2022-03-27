package com.example.calculmental.database;

import android.content.Context;

public class ComputeBaseHelper extends  DataBaseHelper {

    public ComputeBaseHelper(Context context){ super(context,"MentalCounting",1); }

    @Override
    protected String getCreationSql() {
        return "CREATE TABLE IF NOT EXISTS bestScore("
                + "id" + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + CalculDao.cleBest + " INTEGER NOT NULL, "
                + ")";
    }

    @Override
    protected String getDeleteSql() {
        return null;
    }
}
