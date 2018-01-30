/*
    All code from Andorid cts, http://bigflake.com/mediacodec/
 */
package com.example.administrator.encodedecode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mQcifBtn;
    private Button mQvgaBtn;
    private Button m720Btn;
    private EncodeDecodeTest mEncDecTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQcifBtn = (Button)findViewById(R.id.b2b_qcif);
        mQvgaBtn = (Button)findViewById(R.id.b2b_qvga);
        m720Btn = (Button)findViewById(R.id.b2b_720p);

        mEncDecTest = new EncodeDecodeTest();

        mQcifBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mEncDecTest.testEncodeDecodeVideoFromBufferToBufferQCIF();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        mQvgaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mEncDecTest.testEncodeDecodeVideoFromBufferToBufferQVGA();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        m720Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d("MediaCodec", "buffer to buffer 720p");
                    mEncDecTest.testEncodeDecodeVideoFromBufferToBuffer720p();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
