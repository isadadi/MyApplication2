package com.example.isadadi.myapplication.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.isadadi.myapplication.Model.Mahasiswa;
import com.example.isadadi.myapplication.R;

import java.util.List;

/**
 * Created by isadadi on 29/11/2017.
 */

public class MahasiswaViewHolder extends RecyclerView.ViewHolder {

    public TextView nim,nama;
    public ImageView foto;
    public MahasiswaViewHolder(View itemView) {

        super(itemView);
        nim = (TextView)itemView.findViewById(R.id.textViewNIM);
        nama = (TextView)itemView.findViewById(R.id.textViewNama);
        foto = (ImageView)itemView.findViewById(R.id.imageViewFoto);
    }
}
