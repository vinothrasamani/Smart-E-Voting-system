package com.example.smart_e_voter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.UserInfo;

import java.util.ArrayList;

public class entry extends RecyclerView.Adapter<entry.MyViewholder> {
    Context context;
    ArrayList<store_dp> list;

    public entry(Context context, ArrayList<store_dp> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.entrydetails,parent,false);
        return new MyViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        store_dp user = list.get(position);
        holder.name.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder{

        TextView name;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nametext);
        }
    }
}
