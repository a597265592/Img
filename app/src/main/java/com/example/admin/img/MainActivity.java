package com.example.admin.img;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private ArrayList<Integer> sort(Integer... integers){
        ArrayList<Integer> mArrayList =new ArrayList<>();
        Collections.addAll(mArrayList, integers);
        Collections.sort(mArrayList, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)){
                    return 0;
                }
                return o1>o2?1:-1;
            }
        });
        return mArrayList;
    }

    private void showDialog(Context context){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("message");
    }
}
