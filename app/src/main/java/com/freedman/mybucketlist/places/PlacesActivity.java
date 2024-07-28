package com.freedman.mybucketlist.places;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.freedman.mybucketlist.BucketListEntry;
import com.freedman.mybucketlist.BucketListEntryAdapter;
import com.freedman.mybucketlist.R;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_places);

        RecyclerView placesList = findViewById(R.id.recycler_view_places);

        BucketListEntry[] places = {
                new BucketListEntry("Italy", "description" ,R.drawable.menace, 5),
                new BucketListEntry("Rome","description", R.drawable.rome,3),
                new BucketListEntry("Sao Paolo", "description", R.drawable.sao_paolo,5),
                new BucketListEntry("PeePee POO POO", "description",R.drawable.menace,3.5f)
        };

        BucketListEntryAdapter placesAdapter = new BucketListEntryAdapter(places);

        placesList.setAdapter(placesAdapter);


    }
}