package com.singh.daman.gentletoast;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.singh.daman.gentletoast.lib.R;

/**
 * Created by Daman on 10/14/2017.
 */

public class GentleToast {
    public static final int DONE = 1;
    private int textColor = R.color.white;
    private int backgroundColor = R.color.black;
    private int strokeWidth = 0;
    private int strokeColor = R.color.black;
    private int backgroundRadius = 20;
    private int image = R.mipmap.ic_launcher_round;
    private TextView text;
    private ImageView imageView;
    private Context context;
    private Toast toast;
    private View layout;
    private GradientDrawable drawable;

    public static GentleToast with(Context context){
        GentleToast gentleToast = new GentleToast();
        gentleToast.setContext(context);
        return gentleToast;
    }

    private void setContext(Context context){
        this.context = context;
        toast = new Toast(context);
    }

    public GentleToast shortToast(String strMsg) {
        showToast(0, strMsg);
        toast.setDuration(Toast.LENGTH_SHORT);
        return this;
    }

    public GentleToast longToast(String strMsg) {
        showToast(0, strMsg);
        toast.setDuration(Toast.LENGTH_LONG);
        return this;
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

    public GentleToast setTextColor(int textColor) {
        this.textColor = textColor;
        return this;
    }

    public GentleToast setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public GentleToast setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }

    public GentleToast setStrokeColor(int strokeColor) {
        this.strokeColor = strokeColor;
        return this;
    }

    public GentleToast setBackgroundRadius(int backgroundRadius) {
        this.backgroundRadius = backgroundRadius;
        return this;
    }

    public GentleToast setImage(int image) {
        this.image = image;
        imageView.setVisibility(View.VISIBLE);
        return this;
    }


    public Toast show(){
        drawable.setStroke(strokeWidth, ContextCompat.getColor(context, strokeColor));
        drawable.setColor(ContextCompat.getColor(context, backgroundColor));
        drawable.setCornerRadius(backgroundRadius);
        text.setTextColor(ContextCompat.getColor(context, textColor));
        imageView.setBackground(ContextCompat.getDrawable(context, image));
        toast.setView(layout);
        toast.show();
        return toast;
    }

    private void showToast(int toastType, String strMsg) {
        layout = LayoutInflater.from(context).inflate(R.layout.done_toast, null, false);
        LinearLayout linearLayout = (LinearLayout) layout.findViewById(R.id.base_layout);
        drawable = (GradientDrawable) linearLayout.getBackground();
        text = (TextView) layout.findViewById(R.id.done_message);
        imageView = (ImageView) layout.findViewById(R.id.image_view);
        text.setText(strMsg);
        switch (toastType) {
            case 1: {
                DoneToast doneToast = (DoneToast) layout.findViewById(R.id.successView);
                doneToast.setVisibility(View.VISIBLE);
                break;
            }
        }
    }
}
