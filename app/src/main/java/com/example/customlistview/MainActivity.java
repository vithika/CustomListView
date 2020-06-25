package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list_products;
    ArrayList<Product> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_products= findViewById(R.id.list_products);

         list=new ArrayList<Product>();

        Product product1=new Product("Dell latitude 3500",
                "The world's most secure,most manageable and most reliable business-class laptops",
                "Screen",
                14500.99,
                true);
        Product product2= new Product("Acer Aspire 2",
                "Revolutionary convertible computers that feature powerful innovation and forward -thinking laptops",
                     "Laptop",
                13000.45,
                false);
        Product product3= new Product("Sandisk 16 GB Cruzer",
                "Low-cost no nonsense way of storing and transporting files",
                "Memory",
                299.99,
                false);
        Product product4= new Product("Verbatim 1TB",
                "Verbatim is portable hard drive product offerings exceptionally reliable and fashionably thinking",
                "HDD",
                1039.33,
                true
                );
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);

        ProductAdapter adapter =new ProductAdapter(this,list);
        list_products.setAdapter(adapter);

    }
}
