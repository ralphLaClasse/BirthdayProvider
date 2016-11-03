package fr.bdmob.iutlpirm.birthdayprovider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jmalki on 01/10/2016.
 */
public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "bdbirthday.db";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Method is called during creation of the database
    @Override
    public void onCreate(SQLiteDatabase database) {
        BirthdayTable.onCreate(database);
    }

    // Method is called during an upgrade of the database,
    // e.g. if you increase the database version
    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        BirthdayTable.onUpgrade(database, oldVersion, newVersion);
    }
}
