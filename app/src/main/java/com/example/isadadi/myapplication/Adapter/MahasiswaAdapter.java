package com.example.isadadi.myapplication.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.isadadi.myapplication.MainActivity;
import com.example.isadadi.myapplication.Model.Mahasiswa;
import com.example.isadadi.myapplication.R;
import com.example.isadadi.myapplication.ViewHolder.MahasiswaViewHolder;

import java.util.List;

/**
 * Created by isadadi on 29/11/2017.
 */

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaViewHolder> {

    private List<Mahasiswa> listData;
    private Context context;
    public MahasiswaAdapter(Context context, List<Mahasiswa> listData) {
        this.listData = listData;
        this.context = context;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mahasiswa,parent, false);

        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        Mahasiswa mahasiswa = listData.get(position);
        holder.nama.setText(mahasiswa.getNama());
        holder.nim.setText(mahasiswa.getNim());
        Glide.with(context).load(mahasiswa.getFoto()).into(holder.foto);

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
