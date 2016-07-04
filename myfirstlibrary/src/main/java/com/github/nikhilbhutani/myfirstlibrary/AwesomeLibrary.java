package com.github.nikhilbhutani.myfirstlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Nikhil Bhutani on 7/4/2016.
 */
public class AwesomeLibrary {

    private static AwesomeLibrary instance = null;

    private AwesomeLibrary(){

    }

    public static AwesomeLibrary getInstance(){
        instance = new AwesomeLibrary();
        return instance;
    }

    public void makeMeAwesome(Context context, String data)
    {
        Toast.makeText(context, "Awesome "+data, Toast.LENGTH_SHORT).show();
    }
}
