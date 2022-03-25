package com.example.calculmental.database;

import android.content.ContentValues;
import android.database.Cursor;

import com.example.calculmental.entities.Calcul;

public class CalculDao extends BaseDao<Calcul> {
    public CalculDao(DataBaseHelper helper) {
        super(helper);
    }
    static String cleBestEasy = "bestEasy";
    static String cleBestMedium = "bestMedium";
    static String cleBestHard = "bestHard";

    @Override
    protected String getTableName() {
        return "bestScore";
    }

    @Override
    protected void putValues(ContentValues values, Calcul entity) {
        values.put(cleBestEasy, entity.getBestEasy());
        values.put(cleBestMedium, entity.getBestMedium());
        values.put(cleBestHard, entity.getBestHard());

    }

    @Override
    protected Calcul getEntity(Cursor cursor) {
        Calcul calcul = new Calcul();
        cursor.moveToFirst();
        Integer indexPremierElement = cursor.getColumnIndex(cleBestEasy);
        Integer indexDeuxiemeElement = cursor.getColumnIndex(cleBestMedium);
        Integer indexResultat = cursor.getColumnIndex(cleBestHard);
        calcul.setBestEasy(cursor.getInt(indexPremierElement));
        calcul.setBestMedium(cursor.getInt(indexDeuxiemeElement));
        calcul.setBestHard(cursor.getInt(indexResultat));
        return calcul;
    }
}
