package com.onzhou.module.upload;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author: andy
 * @date: 2018-06-19
 **/
public class UploadActivity extends AppCompatActivity {

    public static void intentStart(Context ctx) {
        Intent intent = new Intent(ctx, UploadActivity.class);
        ctx.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
    }
}
