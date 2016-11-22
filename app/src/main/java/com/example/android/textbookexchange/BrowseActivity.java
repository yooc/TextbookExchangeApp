package com.example.android.textbookexchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browse);

        //Generate ListView
        final ArrayList<Product> browsingList = new ArrayList<>();
        browsingList.add(new Product(10, "hello", 1, 1));
        browsingList.add(new Product(10, "hello2", 1, 2));
        browsingList.add(new Product(10, "item", 2, 3, R.drawable.placeholder));

        ProductAdapter adapter = new ProductAdapter(this, browsingList);
        ListView listView = (ListView) findViewById(R.id.productList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(BrowseActivity.this,PostActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}
