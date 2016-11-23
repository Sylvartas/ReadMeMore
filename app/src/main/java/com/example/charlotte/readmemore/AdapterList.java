package com.example.charlotte.readmemore;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Charlotte on 22/10/2016.
 */
public class AdapterList extends RecyclerView.Adapter<AdapterList.MyViewHolder> {

    private ListLivres bookList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,auteur,year;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            auteur = (TextView) view.findViewById(R.id.auteur);
            year = (TextView) view.findViewById(R.id.year);
        }
    }

    public AdapterList(ListLivres bookList) {
        this.bookList = bookList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_recycler_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Livre book = bookList.get(position);
        holder.title.setText(book.getTitle());
        holder.auteur.setText(book.getAuteur());
        holder.year.setText(book.getDate());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

}
