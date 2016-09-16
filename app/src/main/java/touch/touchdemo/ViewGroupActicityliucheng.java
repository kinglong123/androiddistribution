package touch.touchdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by lanjl on 2016/8/28.
 */
public class ViewGroupActicityliucheng extends AppCompatActivity {

    View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewgroup_main_liucheng);
        mView  = findViewById(R.id.v1);


        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("mView   Click");
            }
        });
    }

}
