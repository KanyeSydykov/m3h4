package com.example.m3h4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
TextView textView;
TextView textView2;
TextView textView3;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        textView2 = itemView.findViewById(R.id.tv2);
        textView = itemView.findViewById(R.id.tv);
        textView3 = itemView.findViewById(R.id.tv3);

    }


    public void onBind (String text){
   textView3.setText(text);


    }

}
