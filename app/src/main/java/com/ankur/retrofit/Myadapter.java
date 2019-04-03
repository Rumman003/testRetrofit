package com.ankur.retrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Myadapter extends RecyclerView.Adapter<Myadapter.myViewHolder> {

    String [] cardsArrayNmae,detailsOfCards,nothingOfCared;
    List<detailsOfPromo> detailsOfPromos;
    Context context;

//    public Myadapter(Context context,String[] cardsArrayNmae, String[] detailsOfCards, String[] nothingOfCared) {
//        this.cardsArrayNmae = cardsArrayNmae;
//        this.detailsOfCards = detailsOfCards;
//        this.nothingOfCared = nothingOfCared;
//        this.context = context;
//    }

    public Myadapter(List<detailsOfPromo> detailsOfPromoss){
        this.detailsOfPromos = detailsOfPromoss;
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_item,viewGroup,false);

        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {

//        myViewHolder.serialView.setText(cardsArrayNmae[i]);
//        myViewHolder.promoCodeView.setText(detailsOfCards[i]);
//        myViewHolder.promoCodeView.setText(nothingOfCared[i]);

        myViewHolder.serialView.setText(detailsOfPromos.get(i).getNo_of_coupon());
        myViewHolder.promoCodeView.setText(detailsOfPromos.get(i).getPromo_code());
        myViewHolder.descriptionView.setText(detailsOfPromos.get(i).getVehicle_type());

    }

    @Override
    public int getItemCount() {
        return cardsArrayNmae.length;
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        private TextView serialView,promoCodeView,descriptionView;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            serialView = itemView.findViewById(R.id.serial);
            promoCodeView = itemView.findViewById(R.id.promoCode);
            descriptionView = itemView.findViewById(R.id.description);
        }
    }
}
