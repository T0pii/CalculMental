package com.example.calculmental.database;

import android.content.ContentValues;
import android.database.Cursor;

import com.example.calculmental.entities.Calcul;

public class CalculDao extends BaseDao<Calcul> {
    public CalculDao(DataBaseHelper helper) {
        super(helper);
    }
    static String cleBest = "best";

    @Override
    protected String getTableName() {
        return "bestScore";
    }

    @Override
    protected void putValues(ContentValues values, Calcul entity) {
        values.put(cleBest, entity.getBest());
    }

    @Override
    protected Calcul getEntity(Cursor cursor) {
        Calcul calcul = new Calcul();
        cursor.moveToFirst();
        Integer indexPremierElement = cursor.getColumnIndex(cleBest);
        calcul.setBest(cursor.getInt(indexPremierElement));
        return calcul;
    }
}
