package com.ankur.retrofit.view;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;

import com.ankur.retrofit.ApiInterface;
import com.ankur.retrofit.ApiPromotions;
import com.ankur.retrofit.ListItem;
import com.ankur.retrofit.MyListAdapter;
import com.ankur.retrofit.Myadapter;
import com.ankur.retrofit.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //an's code
//     private RecyclerView recyclerView;
//     private RecyclerView.Adapter adapter;

     private List<ListItem> listItems;
    //



    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    Myadapter myadapter;
    String [] cardsArrayNmae,detailsOfCards, nothingOfCared;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //an's code
//         recyclerView = findViewById(R.id.recyclerId);
//         recyclerView.setHasFixedSize(true);
//         recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//         listItems = new ArrayList<>();
//         for(int i=0; i<=10; i++){
//             ListItem listItem = new ListItem(
//                     "serial"+i,
//                     "BGH",
//                     "blah blah"
//             );
//
//             listItems.add(listItem);
//         }
//
//         adapter = new MyListAdapter(listItems, this);
//         recyclerView.setAdapter(adapter);
         //








        recyclerView = findViewById(R.id.recyclerId);

//        cardsArrayNmae = getResources().getStringArray(R.array.nameOfCards);
//        detailsOfCards = getResources().getStringArray(R.array.detailsOfCards);
//        nothingOfCared = getResources().getStringArray(R.array.nothingOfCared);
//
//        myadapter = new Myadapter(MainActivity.this,cardsArrayNmae,detailsOfCards,nothingOfCared);



        apiInterface = ApiPromotions.getApiClient().create(ApiInterface.class);

        Call<List<>>

        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
