package bid.woou.singletasktest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by cc on 2016/10/14.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        setContentView(layout);
        TextView tv = new TextView(this);
        tv.setText("Activity为：" + this.toString()
        + "\n" + ",Task ID为：" + this.getTaskId());
        Button button = new Button(this);
        button.setText("启动SingleTaskTest");
        layout.addView(tv);
        layout.addView(button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this
                ,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
