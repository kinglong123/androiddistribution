package touch.touchdemo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by lanjl on 2016/9/4.
 */
public class LinearLayoutN1 extends LinearLayout {

    public LinearLayoutN1(Context context) {
        super(context);
    }

    public LinearLayoutN1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        System.out.println("LinearLayoutN1 dispatchTouchEvent before:" + ViewTool.actionToString(event.getAction()));
        boolean result = super.dispatchTouchEvent(event);
        System.out.println("LinearLayoutN1  dispatchTouchEvent after:" + ViewTool.actionToString(event.getAction()) + "return:"+result);
        return result;
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        System.out.println("LinearLayoutN1 onInterceptTouchEvent before:" + ViewTool.actionToString(ev.getAction()));
        boolean result = super.onInterceptTouchEvent(ev);
        System.out.println("LinearLayoutN1 onInterceptTouchEvent after:" + ViewTool.actionToString(ev.getAction())+ "return:"+result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        System.out.println("LinearLayoutN1 onTouchEvent before:" + ViewTool.actionToString(ev.getAction()));
        boolean result = super.onTouchEvent(ev);
        System.out.println("LinearLayoutN1 onTouchEvent after:" + ViewTool.actionToString(ev.getAction())+ "return:"+result);
        return result;

    }
}
