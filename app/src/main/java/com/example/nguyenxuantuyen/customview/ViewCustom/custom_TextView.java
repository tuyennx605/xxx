package com.example.nguyenxuantuyen.customview.ViewCustom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by nguyenxuantuyen on 1/25/18.
 */

public class custom_TextView extends TextView{
    public custom_TextView(Context context) {
        super(context);
    }

    public custom_TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public custom_TextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Rect rect;      //hinh chu nhat
    int dai = 100, rong = 100;

    public void sizexx(int i, int j)
    {
        dai = i;
        rong = j;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        rect = new Rect(0, 10, 500, 800);  //le trai cachs trai 10, le tren cach tren 10, le phai cach trai 500...

        Paint but = new Paint();
        but.setStrokeWidth(4);
        but.setColor(Color.BLUE);

        canvas.drawRect(rect, but); //ve
    }

}
