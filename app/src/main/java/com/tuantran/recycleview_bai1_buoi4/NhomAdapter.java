package com.tuantran.recycleview_bai1_buoi4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NhomAdapter extends RecyclerView.Adapter<NhomAdapter.ViewHolder>{

    ArrayList<DataNhom> dataNhoms;
    Context context;

    public NhomAdapter(ArrayList<DataNhom> dataNhoms, Context context) {
        this.dataNhoms = dataNhoms;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View  itemView = layoutInflater.inflate(R.layout.item_row,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTen.setText(dataNhoms.get(position).getTen());
        holder.txtSLFan.setText(dataNhoms.get(position).getSoLuongThanhVien());
        holder.txtSlBaiViet.setText(dataNhoms.get(position).getSoLuongBaiViet());
        holder.txtTrangthai.setText(dataNhoms.get(position).getTrangThai());
        holder.imgHinh.setImageResource(dataNhoms.get(position).getHinhAnh());
    }

    @Override
    public int getItemCount() {
        return dataNhoms.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTen;
        TextView txtSLFan;
        TextView txtSlBaiViet;
        TextView txtTrangthai;
        ImageView imgHinh;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTen= (TextView) itemView.findViewById(R.id.txtTen);
            txtSLFan= (TextView) itemView.findViewById(R.id.txtSlFan);
            txtSlBaiViet= (TextView) itemView.findViewById(R.id.txtSlBaiViet);
            txtTrangthai= (TextView) itemView.findViewById(R.id.txtTrangThai);
            imgHinh = (ImageView) itemView.findViewById(R.id.imgHinh);
        }
    }
}
