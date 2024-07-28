package com.freedman.mybucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListEntryAdapter extends RecyclerView.Adapter<BucketListEntryAdapter.BucketListEntryViewHolder> {

    public BucketListEntry[] entry;

    public BucketListEntryAdapter(BucketListEntry[] entry) {
        this.entry = entry;
    }

    @Override
    public int getItemCount() {
        return entry.length;
    }

    @NonNull
    @Override
    public BucketListEntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket_list_entry, parent, false);
        return new BucketListEntryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListEntryViewHolder holder, int position) {
        holder.bind(entry[position], position);
    }


    class BucketListEntryViewHolder extends RecyclerView.ViewHolder {

        ImageView Image;
        TextView heading;
        TextView description;
        RatingBar ratingBar;


        public BucketListEntryViewHolder(@NonNull View itemView) {
            super(itemView);

            Image = itemView.findViewById(R.id.image_view_item_place);
            heading = itemView.findViewById(R.id.text_view_item_place);
            description = itemView.findViewById(R.id.text_view_item_description);
            ratingBar = itemView.findViewById(R.id.rating_bar);
        }

        public void bind(BucketListEntry entry, int position) {

            String title = position + 1 + ". "+entry.heading;
            heading.setText(title);
            Image.setImageResource(entry.image);
            description.setText(entry.description);
            ratingBar.setRating(entry.ratingBar);

        }
    }
}
