package com.example.m3h4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainAdapter  extends RecyclerView.Adapter<MainViewHolder> {




        ArrayList<String> dataList;
     public MainAdapter() {
      dataList = new ArrayList<>();
         for (int i = 0; i <=30 ; i++) {

             dataList.add(""  + i);
             
         }


        }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent , false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
     holder.onBind(dataList.get( position + 1 ));
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");



        f.getCalendar();
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}