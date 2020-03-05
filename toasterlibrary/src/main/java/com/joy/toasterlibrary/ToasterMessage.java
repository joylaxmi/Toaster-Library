package com.joy.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void showToast(Context c,String msg)
    {
        Toast.makeText(c,msg,Toast.LENGTH_LONG).show();
    }
}
