package com.jincreation.tinnews;

import android.app.Application;

import androidx.room.Room;

import com.facebook.stetho.Stetho;
import com.jincreation.tinnews.database.TinNewsDatabase;

public class TinNewsApplication extends Application {

    private static TinNewsDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        db = Room.databaseBuilder(this, TinNewsDatabase.class, "tinnews_db").build();
    }

    public static TinNewsDatabase getDatabase() {
        return db;
    }
}
