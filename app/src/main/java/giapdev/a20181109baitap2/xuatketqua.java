package giapdev.a20181109baitap2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class xuatketqua extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noidung);
        Button bt2 = (Button)findViewById(R.id.xbt2);
        TextView tx2 = (TextView)findViewById(R.id.xtx2);
        String chuoi = getIntent().getExtras().getString("ten");
        tx2.setText(chuoi);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt2 = new Intent(xuatketqua.this,MainActivity.class);
                startActivity(intt2);
            }
        });
    }
}
