package com.techparksystems.childrecyclerviewtest.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.techparksystems.childrecyclerviewtest.Models.ChildModel;
import com.techparksystems.childrecyclerviewtest.Models.ParentModel;
import com.techparksystems.childrecyclerviewtest.R;

import java.util.ArrayList;

public class ParentRecyclerViewAdapter extends RecyclerView.Adapter<ParentRecyclerViewAdapter.MyViewHolder> {

    private ArrayList<ParentModel> parentModelArrayList;
    public Context cxt;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView category;
        public RecyclerView childRecyclerView;

        public MyViewHolder(View itemView) {
            super(itemView);

            category = itemView.findViewById(R.id.cardTitle);
            childRecyclerView = itemView.findViewById(R.id.childRecyclerView);
        }
    }

    public ParentRecyclerViewAdapter(ArrayList<ParentModel> exampleList, Context context) {
        this.parentModelArrayList = exampleList;
        this.cxt = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return parentModelArrayList.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        ParentModel currentItem = parentModelArrayList.get(position);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(cxt, LinearLayoutManager.HORIZONTAL, false);
        holder.childRecyclerView.setLayoutManager(layoutManager);
        holder.childRecyclerView.setHasFixedSize(true);

        holder.category.setText(currentItem.movieCategory());
        ArrayList<ChildModel> arrayList = new ArrayList<>();

        // added the first child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category1")) {
            arrayList.add(new ChildModel(R.drawable.rtgs,"Fund\nTransfer"));
            arrayList.add(new ChildModel(R.drawable.ic_rtgs,"Fund\nTransfer"));
            arrayList.add(new ChildModel( R.drawable.ic_ownbank,"Fund\nTransfer"));
            arrayList.add(new ChildModel( R.drawable.recharge,"Fund\nTransfer"));

        }

        // added in second child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category2")) {

            arrayList.add(new ChildModel( R.drawable.ic_ownbank,"Fund\nTransfer"));
            arrayList.add(new ChildModel( R.drawable.recharge,"Fund\nTransfer"));
            arrayList.add(new ChildModel(R.drawable.rtgs,"Fund\nTransfer"));
            arrayList.add(new ChildModel(R.drawable.ic_rtgs,"Fund\nTransfer"));
        }

        // added in third child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category3")) {
            arrayList.add(new ChildModel( R.drawable.ic_ownbank,"Fund\nTransfer"));
            arrayList.add(new ChildModel( R.drawable.recharge,"Fund\nTransfer"));
            arrayList.add(new ChildModel(R.drawable.rtgs,"Fund\nTransfer"));
            arrayList.add(new ChildModel(R.drawable.ic_rtgs,"Fund\nTransfer"));
        }

        // added in fourth child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category4")) {
            arrayList.add(new ChildModel( R.drawable.ic_ownbank,"Fund\nTransfer"));
            arrayList.add(new ChildModel( R.drawable.recharge,"Fund\nTransfer"));
            arrayList.add(new ChildModel(R.drawable.rtgs,"Fund\nTransfer"));
            arrayList.add(new ChildModel(R.drawable.ic_rtgs,"Fund\nTransfer"));
        }

        // added in fifth child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category5")) {
            arrayList.add(new ChildModel( R.drawable.ic_ownbank,"Fund\nTransfer"));
            arrayList.add(new ChildModel( R.drawable.recharge,"Fund\nTransfer"));
            arrayList.add(new ChildModel(R.drawable.rtgs,"Fund\nTransfer"));
            arrayList.add(new ChildModel(R.drawable.ic_rtgs,"Fund\nTransfer"));
        }

        // added in sixth child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category6")) {
            arrayList.add(new ChildModel( R.drawable.ic_ownbank,"Fund\nTransfer"));
            arrayList.add(new ChildModel( R.drawable.recharge,"Fund\nTransfer"));
            arrayList.add(new ChildModel(R.drawable.rtgs,"Fund\nTransfer"));
            arrayList.add(new ChildModel(R.drawable.ic_rtgs,"Fund\nTransfer"));
        }

        ChildRecyclerViewAdapter childRecyclerViewAdapter = new ChildRecyclerViewAdapter(arrayList,holder.childRecyclerView.getContext());
        holder.childRecyclerView.setAdapter(childRecyclerViewAdapter);
    }
}
