package touch.touchdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import touch.touchdemo.widget.ViewTool;

/**
 * Created by lanjl on 2016/8/28.
 */
public class ViewActicity extends AppCompatActivity {
    Button btn;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_main);
        btn = (Button) findViewById(R.id.bt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("TAG","onClick execute!");
            }
        });
        btn.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                // TODO Auto-generated method stub
                Log.v("TAG","onTouch execute,"+"action is "+ ViewTool.actionToString(event.getAction()));
                return false;
            }
        });



        imageView  = (ImageView) findViewById(R.id.iv);
        imageView.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                Log.v("TAG","onTouch execute,"+"action is "+ViewTool.actionToString(event.getAction()));
                return false;
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Log.v("TAG","onClick execute!");
            }
        });

    }
}
