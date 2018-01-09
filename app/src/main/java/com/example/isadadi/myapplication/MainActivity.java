package com.example.isadadi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.isadadi.myapplication.Adapter.MahasiswaAdapter;
import com.example.isadadi.myapplication.Model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   private List<Mahasiswa> listMahaiswa = new ArrayList<>();
   private MahasiswaAdapter mahasiswaAdapter;
   private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recycleView);

        mahasiswaAdapter = new MahasiswaAdapter(getApplicationContext(), listMahaiswa);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mahasiswaAdapter);
        Isi_Data();
    }

    public void Isi_Data(){
        listMahaiswa.add(new Mahasiswa("141402039","isa dadi","https://static.myfigurecollection.net/pics/figure/big/436617.jpg"));
        listMahaiswa.add(new Mahasiswa("141402040", "isa dadi","https://static.myfigurecollection.net/pics/figure/big/536439.jpg"));
        listMahaiswa.add(new Mahasiswa("141402041", "isa dadi", "https://avatarfiles.alphacoders.com/559/55989.png"));
        listMahaiswa.add(new Mahasiswa("141402042", "isa dadi", "https://avatarfiles.alphacoders.com/559/55989.png"));
        listMahaiswa.add(new Mahasiswa("141402043", "isa dadi", "https://avatarfiles.alphacoders.com/559/55989.png"));
        mahasiswaAdapter.notifyDataSetChanged();
    }
}
