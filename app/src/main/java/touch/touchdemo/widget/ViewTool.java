package touch.touchdemo.widget;

/**
 * Created by lanjl on 2016/9/4.
 */
public class ViewTool {

    public static final int ACTION_UP               = 1;
    public static final int ACTION_DOWN             = 0;



    public static final int ACTION_MOVE             = 2;

    public static final int ACTION_CANCEL           = 3;

    public static final int ACTION_POINTER_DOWN     = 5;

    public static final int ACTION_OUTSIDE          = 4;


    public static final int ACTION_POINTER_UP       = 6;


    public static final int ACTION_HOVER_MOVE       = 7;


    public static final int ACTION_SCROLL           = 8;


    public static final int ACTION_HOVER_ENTER      = 9;


    public static final int ACTION_HOVER_EXIT       = 10;


    public static final int ACTION_BUTTON_PRESS   = 11;


    public static final int ACTION_BUTTON_RELEASE  = 12;

    public static String actionToString(int action) {
        switch (action) {
            case ACTION_DOWN:
                return "ACTION_DOWN";
            case ACTION_UP:
                return "ACTION_UP";
            case ACTION_CANCEL:
                return "ACTION_CANCEL";
            case ACTION_OUTSIDE:
                return "ACTION_OUTSIDE";
            case ACTION_MOVE:
                return "ACTION_MOVE";
            case ACTION_HOVER_MOVE:
                return "ACTION_HOVER_MOVE";
            case ACTION_SCROLL:
                return "ACTION_SCROLL";
            case ACTION_HOVER_ENTER:
                return "ACTION_HOVER_ENTER";
            case ACTION_HOVER_EXIT:
                return "ACTION_HOVER_EXIT";
            case ACTION_BUTTON_PRESS:
                return "ACTION_BUTTON_PRESS";
            case ACTION_BUTTON_RELEASE:
                return "ACTION_BUTTON_RELEASE";
        }
       return "" +action;
    }

}
