package com.smit.reference.downloaderlibrary.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import com.smit.reference.downloaderlibrary.R;

public class DownloadStatusActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_status);

        iv = (ImageView) findViewById(R.id.iv_download);

        //String filePath = Environment.getExternalStorageDirectory() + "/vvveksperten" + File.separator + "bb.jpg";
        //Bitmap bmp = BitmapFactory.decodeFile(filePath);
        //iv.setImageBitmap(bmp);

    }
}
