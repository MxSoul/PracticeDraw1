package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.DensityUtil;
import com.hencoder.hencoderpracticedraw1.R;

public class Practice2DrawCircleView extends View {

    private int circleRadius = 160;
    private int padding = 25;

    Paint paint = new Paint();
    
    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(R.color.black));
        canvas.drawCircle(getWidth()/2-circleRadius-padding,getHeight()/2-circleRadius-padding,circleRadius,paint);

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(DensityUtil.dip2px(getContext(),1));
        paint.setColor(getResources().getColor(R.color.black));
        canvas.drawCircle(getWidth()/2+circleRadius+padding,getHeight()/2-circleRadius-padding,circleRadius,paint);

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(R.color.blue));
        canvas.drawCircle(getWidth()/2-circleRadius-padding,getHeight()/2+circleRadius+padding,circleRadius,paint);

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(DensityUtil.dip2px(getContext(),20));
        paint.setColor(getResources().getColor(R.color.black));
        canvas.drawCircle(getWidth()/2+circleRadius+padding,getHeight()/2+circleRadius+padding,circleRadius,paint);
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
    }
}
