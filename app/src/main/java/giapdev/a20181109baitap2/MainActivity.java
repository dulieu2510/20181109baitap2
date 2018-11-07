package giapdev.a20181109baitap2;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    EditText tx1 ;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         bt1 = (Button) findViewById(R.id.xbt1);
         tx1 = (EditText) findViewById(R.id.xtx1);
         bt1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                Intent intt = new Intent(MainActivity.this,xuatketqua.class );
                intt.putExtra("ten",new String(tx1.getText().toString()));
                startActivity(intt);
             }
         });



    }


}
