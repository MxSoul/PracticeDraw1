package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.DensityUtil;
import com.hencoder.hencoderpracticedraw1.R;

public class Practice3DrawRectView extends View {

    private Paint paint = new Paint();
    private Integer length = DensityUtil.dip2px(getContext(),130);

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(R.color.black));
        canvas.drawRect( (getWidth()-length)/2,(getHeight()-length)/2,(getWidth()+length)/2,(getHeight()+length)/2,paint);
//        练习内容：使用 canvas.drawRect() 方法画矩形
    }
}
