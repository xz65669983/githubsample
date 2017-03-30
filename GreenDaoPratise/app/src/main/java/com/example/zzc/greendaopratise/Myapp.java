package com.example.zzc.greendaopratise;

import android.app.Application;

import com.example.zzc.student.DaoMaster;
import com.example.zzc.student.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by zzc on 2017/3/13.
 */

public class Myapp extends Application {
    /** A flag to show how easily you can switch from standard SQLite to the encrypted SQLCipher. */
    public static final boolean ENCRYPTED = true;

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "notes-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
