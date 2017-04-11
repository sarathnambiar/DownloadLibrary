package com.smit.reference.downloaderlibrary.activity;

import android.content.Intent;
import android.os.Bundle;

import com.smit.reference.downloaderlibrary.R;
import com.smit.reference.downloaderlibrary.service.DownloadService;
import com.thebrownarrow.permissionhelper.ActivityManagePermission;
import com.thebrownarrow.permissionhelper.PermissionResult;
import com.thebrownarrow.permissionhelper.PermissionUtils;

import java.util.ArrayList;

public class MainActivity extends ActivityManagePermission {

    public static ArrayList imagesPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imagesPath = new ArrayList();

        imagesPath.add("http://api.androidhive.info/progressdialog/hive.jpg");
        imagesPath.add("http://api.androidhive.info/progressdialog/hive.jpg");
        imagesPath.add("http://api.androidhive.info/progressdialog/hive.jpg");

        long time = System.currentTimeMillis();

        Intent i = new Intent(MainActivity.this, DownloadService.class);
        i.putExtra("downloadUrl", imagesPath);
        i.putExtra("name", "image");
        MainActivity.this.startService(i);

        //Intent i1 = new Intent(MainActivity.this, DownloadService.class);
        //i1.putExtra("downloadUrl", "http://www.gstatic.com/webp/gallery/1.jpg");
        //i1.putExtra("name", "bb");
        //MainActivity.this.startService(i1);

        askCompactPermissions(new String[]{PermissionUtils.Manifest_READ_EXTERNAL_STORAGE, PermissionUtils.Manifest_WRITE_EXTERNAL_STORAGE}, new PermissionResult() {
            @Override
            public void permissionGranted() {
                //permission granted
                //replace with your action
            }

            @Override
            public void permissionDenied() {
                //permission denied
                //replace with your action
            }

            @Override
            public void permissionForeverDenied() {
                // user has check 'never ask again'
                // you need to open setting manually
                openSettingsApp(MainActivity.this);
            }
        });

    }
}
