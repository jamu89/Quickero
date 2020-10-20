package de.mchllngr.quickero;

import android.os.Build;

import androidx.appcompat.app.AppCompatDelegate;
import de.mchllngr.quickero.base.DebugApp;

/**
 * {@link App} for the {@link android.app.Application}
 */
public class App extends DebugApp {

    @Override
    public void onCreate() {
        super.onCreate();

        setDefaultNightMode();
    }

    private void setDefaultNightMode() {
        int nightMode;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
            nightMode = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
        else
            nightMode = AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY;
        AppCompatDelegate.setDefaultNightMode(nightMode);
    }
}
