package com.example.recyclerview;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class ZakupyAdapter extends RecyclerView.Adapter<ZakupyAdapter.ProduktViewHolder> {

    private LayoutInflater inflater;
    private final LinkedList<Produkt> produkty ;

    public ZakupyAdapter(Context context,LinkedList<Produkt> produkty) {
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
        holder.itemProductView.setText(produkty.get(position).getNazwa());
        holder.itemProductView.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {
                        //TODO: nadmierne zaznaczanie
                        if(isChecked){
                            holder.itemProductView.setPaintFlags(
                                    holder.itemProductView.getPaintFlags() |
                                            Paint.STRIKE_THRU_TEXT_FLAG
                            );

                        }
                        else{
                            holder.itemProductView.setPaintFlags(
                                    holder.itemProductView.getPaintFlags() &
                                            ~Paint.STRIKE_THRU_TEXT_FLAG
                            );
                        }
                        produkty.get(position).setZaznaczone(isChecked);
                    }
                }
        );
    }

    @Override
    public int getItemCount() {
        return produkty.size();
    }

    public void usunZaznaczoneElementy(){
        produkty.removeIf(x->x.isZaznaczone());
        //TODO: zaktualizować wyświetlanie
        notifyDataSetChanged();
    }

    public class ProduktViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final CheckBox itemProductView;
        public final ZakupyAdapter zakupyAdapter;


        public ProduktViewHolder(@NonNull View itemView, ZakupyAdapter adapter) {
            super(itemView);
            itemProductView = itemView.findViewById(R.id.checkBox);
            zakupyAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int pos = getLayoutPosition();
            String prod = produkty.get(pos).getNazwa();
            Toast.makeText(inflater.getContext(), prod, Toast.LENGTH_SHORT).show();
        }
    }

}
