package touch.touchdemo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by lanjl on 2016/9/4.
 */
public class cButton extends Button {

    public cButton(Context context) {
        super(context);
    }

    public cButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public cButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        System.out.println(" dispatchTouchEvent before:" + ViewTool.actionToString(event.getAction()));
        boolean result = super.dispatchTouchEvent(event);
        System.out.println(" dispatchTouchEvent after:" + ViewTool.actionToString(event.getAction()));
        return result;
    }


}
