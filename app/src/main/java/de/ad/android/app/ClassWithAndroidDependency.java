package de.ad.android.app;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class ClassWithAndroidDependency {
    public static String getActivityTitle(Activity activity) {
        return activity.getTitle().toString();
    }

    public static void showToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG);
    }
}
