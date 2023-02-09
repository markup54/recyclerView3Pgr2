package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class ZakupyAdapter extends RecyclerView.Adapter<ZakupyAdapter.ProduktViewHolder> {

    private LayoutInflater inflater;
    private final LinkedList<String> produkty ;

    public ZakupyAdapter(Context context,LinkedList<String> produkty) {
        inflater = LayoutInflater.from(context);
        this.produkty = produkty;

    }

    @NonNull
    @Override
    public ProduktViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_product, parent,false);

        return new ProduktViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProduktViewHolder holder, int position) {
        holder.itemProductView.setText(produkty.get(position));
        //holder.itemProductView.setOnClickListener();
    }

    @Override
    public int getItemCount() {
        return produkty.size();
    }

    public class ProduktViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView  itemProductView;
        public final ZakupyAdapter zakupyAdapter;


        public ProduktViewHolder(@NonNull View itemView, ZakupyAdapter adapter) {
            super(itemView);
            itemProductView = itemView.findViewById(R.id.textView);
            zakupyAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int pos = getLayoutPosition();
            String prod = produkty.get(pos);
            Toast.makeText(inflater.getContext(), prod, Toast.LENGTH_SHORT).show();
        }
    }

}
