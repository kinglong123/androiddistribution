package touch.touchdemo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by lanjl on 2016/9/4.
 */
public class cView extends View {

    public cView(Context context) {
        super(context);
    }

    public cView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public cView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        System.out.println(
                "cView dispatchTouchEvent before:" + ViewTool.actionToString(event.getAction()));
        boolean result = super.dispatchTouchEvent(event);
        System.out.println(
                "cView dispatchTouchEvent after:" + ViewTool.actionToString(event.getAction())+ "return:"
                        + result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        System.out.println("cView onTouchEvent before:" + ViewTool.actionToString(ev.getAction()));
        boolean result = super.onTouchEvent(ev);
        System.out.println(
                "cView onTouchEvent after:" + ViewTool.actionToString(ev.getAction()) + "return:"
                        + result);
        return result;

    }


}
