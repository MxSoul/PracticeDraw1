package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.DensityUtil;

public class Practice6DrawLineView extends View {

    private Paint paint = new Paint();

    public Practice6DrawLineView(Context context) {
        super(context);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int length = DensityUtil.dip2px(getContext(),140);
        double angle = Math.PI/6;//和水平线之间的夹角
        float xLength = Double.valueOf(length*Math.cos(angle)).floatValue();
        float yLength = Double.valueOf(length*Math.sin(angle)).floatValue();
        int screenWidth = getWidth();
        int screenHeight = getHeight();
        paint.setStrokeWidth(DensityUtil.dip2px(getContext(),3));
        paint.setAntiAlias(true);
        canvas.drawLine((screenWidth-xLength)/2,(screenHeight-yLength)/2,(screenWidth+xLength)/2,(screenHeight+yLength)/2,paint);
//        练习内容：使用 canvas.drawLine() 方法画直线
    }
}
