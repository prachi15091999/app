package com.example.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>{
    List<Model> itemlist1;
    public ItemAdapter(List<Model> itemList) {
        this.itemlist1=itemList;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemimage.setImageResource(itemlist1.get(position).getImage());
        holder.itemtext.setText(itemlist1.get(position).getName());
    }





    @Override
    public int getItemCount() {
        return itemlist1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemimage;
        TextView itemtext;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemimage=(ImageView) itemView.findViewById(R.id.imgitem);
            itemtext=(TextView) itemView.findViewById(R.id.imgtext);

        }

    }
}
