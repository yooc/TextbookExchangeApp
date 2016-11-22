package com.example.android.textbookexchange;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cyoo0706 on 10/30/16.
 */

public class ProductAdapter extends ArrayAdapter<Product>{
    public ProductAdapter(Activity context, ArrayList<Product> products){
        super(context, 0, products);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Product currentProduct = getItem(position);

        //Generate priceTextView
        TextView priceView = (TextView) listItemView.findViewById(R.id.priceTextView);
        priceView.setText("$"+Float.toString(currentProduct.getPrice()));

        //Generate nameTextView
        TextView nameView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameView.setText(currentProduct.getName());

        //Generate userIDTextView
        TextView userIDView = (TextView) listItemView.findViewById(R.id.userIDTextView);
        userIDView.setText(Integer.toString(currentProduct.getUserID()));

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentProduct.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentProduct.getPictureID());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
