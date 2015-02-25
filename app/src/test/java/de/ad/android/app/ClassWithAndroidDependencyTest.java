package de.ad.android.app;

import android.app.Activity;
import android.content.Context;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClassWithAndroidDependencyTest {

    @Test
    public void testGetActivityTitle() throws Exception {
        Activity activity = mock(Activity.class);
        when(activity.getTitle()).thenReturn("title");

        String title = ClassWithAndroidDependency.getActivityTitle(activity);

        assertTrue("title".equals(title));
    }

    @Test
    public void testShowToast() throws Exception {
        Context context = mock(Context.class);

        ClassWithAndroidDependency.showToast(context, "toast");


    }
}
