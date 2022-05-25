package com.tuantran.recycleview_bai1_buoi4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
    }

    public void InitView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ryclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<DataNhom> arrayList = new ArrayList<>();
        arrayList.add(new DataNhom(R.drawable.rectangle, "Mua Bán Có Tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Đóng"));
        arrayList.add(new DataNhom(R.drawable.rectangle1, "Mua Bán Có Tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Kín"));
        arrayList.add(new DataNhom(R.drawable.rectangle2, "Mua Bán Có Tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Mở"));
        arrayList.add(new DataNhom(R.drawable.rectangle3, "Mua Bán Có Tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Mở"));
        arrayList.add(new DataNhom(R.drawable.rectangle4, "Mua Bán Có Tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Kín"));
        arrayList.add(new DataNhom(R.drawable.rectangle5, "Mua Bán Có Tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Mở"));
        arrayList.add(new DataNhom(R.drawable.rectangle6, "Mua Bán Có Tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Mở"));
        arrayList.add(new DataNhom(R.drawable.rectangle7, "Mua Bán Có Tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Kín"));

        for(int i = 0; i< arrayList.size();i++){
            if(arrayList.get(i).getTrangThai().equals("Nhóm Đóng")){

            }
        }


        NhomAdapter nhomAdapter = new NhomAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(nhomAdapter);
    }
}