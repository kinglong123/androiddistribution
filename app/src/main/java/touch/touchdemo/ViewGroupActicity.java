package touch.touchdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import touch.touchdemo.widget.CustomLayout;
import touch.touchdemo.widget.ViewTool;

/**
 * Created by lanjl on 2016/8/28.
 */
public class ViewGroupActicity extends AppCompatActivity {
    Button btn;
    Button btn2;
    private CustomLayout customLayout;
    TextView tv;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewgroup_main);
        btn = (Button) findViewById(R.id.btn1);
        btn2  = (Button) findViewById(R.id.btn2);

//        tv  = (TextView) findViewById(R.id.tv);

        customLayout=(CustomLayout)findViewById(R.id.customLayout);
        //customLayout.setClickable(true);
        customLayout.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                Log.v("TAG","customLayout onTouch:"+ ViewTool.actionToString(arg1.getAction()));
                return false;
            }

        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("TAG","onClick execute!");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Log.v("TAG","onClick execute!");
            }
        });

    }
}
