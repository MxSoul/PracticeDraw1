package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.DensityUtil;

public class Practice8DrawArcView extends View {

    private Paint paint = new Paint();
    private RectF rectF = new RectF();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        int width = DensityUtil.dip2px(getContext(),130);
        int height = DensityUtil.dip2px(getContext(),80);
        int screenWidth = getWidth();
        int screenHeight = getHeight();
        rectF.set((screenWidth-width)/2,(screenHeight-height)/2,(screenWidth+width)/2,(screenHeight+height)/2);
        canvas.drawArc(rectF,20,140,false,paint);
        canvas.drawArc(rectF,-110,100,true,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1);
        canvas.drawArc(rectF,180,60,false,paint);
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
    }
}
