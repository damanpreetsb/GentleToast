package com.singh.daman.gentletoast;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.singh.daman.gentletoast.lib.R;

/**
 * Created by Daman on 10/14/2017.
 */

public class GentleToast {
    public static final int DONE = 0;
    public static final int WARNING = 1;
    public static final int ERROR = 2;
    public static final int SAVED = 3;
    public static final int CONNECTED = 4;
    public static final int UPDATE = 5;
    public int color = R.color.black;
    private TextView text;
    private Context context;
    private Toast toast;
    private View layout;

    public static GentleToast with(Context context){
        GentleToast gentleToast = new GentleToast();
        gentleToast.setContext(context);
        return gentleToast;
    }

    private void setContext(Context context){
        this.context = context;
        toast = new Toast(context);
    }

    public GentleToast shortToast(String strMsg, int toastType) {
        showToast(toastType, strMsg);
        toast.setDuration(Toast.LENGTH_SHORT);
        return this;
    }

    public GentleToast longToast(String strMsg, int toastType) {
        showToast(toastType, strMsg);
        toast.setDuration(Toast.LENGTH_LONG);
        return this;
    }

    public GentleToast setTextColor(int color) {
        this.color = color;
        return this;
    }

    public Toast show(){
        text.setTextColor(ContextCompat.getColor(context, color));
        toast.setView(layout);
        toast.show();
        return toast;
    }

    private void showToast(int toastType, String strMsg) {
        switch (toastType) {
            case 0: {
                layout = LayoutInflater.from(context).inflate(R.layout.done_toast, null, false);
                text = (TextView) layout.findViewById(R.id.done_message);
                text.setText(strMsg);
                break;
            }
           /* case 1:{
                View layout=LayoutInflater.from(context).inflate(R.layout.warning_layout,null,false);
                TextView textView= (TextView) layout.findViewById(R.id.warning_message);
                textView.setText(strMsg);
                toast.setView(layout);
                break;
            }
            case 2:{
                View layout=LayoutInflater.from(context).inflate(R.layout.error_layout,null,false);
                TextView textView= (TextView) layout.findViewById(R.id.error_message);
                textView.setText(strMsg);
                toast.setView(layout);
                break;
            }
            case 3:{
                View layout=LayoutInflater.from(context).inflate(R.layout.saved_layout,null,false);
                TextView textView= (TextView) layout.findViewById(R.id.saved_message);
                textView.setText(strMsg);
                toast.setView(layout);
                break;
            }
            case 4:{
                View layout=LayoutInflater.from(context).inflate(R.layout.connected_layout,null,false);
                TextView textView= (TextView) layout.findViewById(R.id.connected_message);
                textView.setText(strMsg);
                toast.setView(layout);
                break;
            }
            case 5:{
                View layout=LayoutInflater.from(context).inflate(R.layout.updating_layout,null,false);
                TextView textView= (TextView) layout.findViewById(R.id.updating_message);
                textView.setText(strMsg);
                toast.setView(layout);
                break;
            }*/
        }
    }
}
