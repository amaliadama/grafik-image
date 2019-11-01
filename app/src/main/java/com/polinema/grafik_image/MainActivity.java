package com.polinema.grafik_image;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button tekan;
    private GLSurfaceView grafik1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tekan=(Button)findViewById(R.id.button1);
        grafik1 = new HelloESSurfaceView(this);
        setContentView(grafik1);
    }
}
