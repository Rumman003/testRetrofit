package com.ankur.retrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private List<ListItem> listItems;
    private Context context;

    public MyListAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int postion) {
        ListItem listItem = listItems.get(postion);
        holder.textViewSerial.setText(listItem.getSerial());
        holder.textViewPromoCode.setText(listItem.getPromoCode());
        holder.textViewDescription.setText(listItem.getDescription());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewSerial;
        public TextView textViewPromoCode;
        public TextView textViewDescription;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewSerial = itemView.findViewById(R.id.serial);
            textViewPromoCode = itemView.findViewById(R.id.promoCode);
            textViewDescription = itemView.findViewById(R.id.description);
        }
    }
}
