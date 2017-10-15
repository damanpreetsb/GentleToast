package com.singh.daman.gentletoast;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Daman on 10/14/2017.
 */

public class DoneToast extends View {
    private Point start = new Point();
    private boolean flag;
    private Point line2 = new Point();
    private Paint paint = new Paint();

    public DoneToast(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(6);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        start.x = 0;
        post(animator);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        start.x = 4;
        start.y = getHeight()/2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(4, getHeight()/2 , start.x, start.y, paint );
        if(flag)
            canvas.drawLine(start.x + 2, start.y, line2.x, line2.y, paint );
    }

    Runnable animator = new Runnable() {
        @Override
        public void run() {
            if(start.x < getWidth()/2 - getWidth()/5){
                start.x += 2;
                start.y += 2;
            } else if(line2.x <= getWidth() - 10){
                line2.x += 4;
                line2.y -= 3;
            }

            if(start.x == getWidth()/2 - getWidth()/5){
                flag = true;
                line2.x = start.x;
                line2.y = start.y;
                start.x += 2;
            }
            invalidate();
            postDelayed(this, 30);
        }
    };
}
