package com.rku_21soeca21002.tutorial10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FormulaAdapter extends RecyclerView.Adapter<FormulaAdapter.FormulaViewHolder> {

    ArrayList<Formula> formulas;

    public FormulaAdapter(ArrayList<Formula> formulas) {
        this.formulas = formulas;
    }

    @NonNull
    @Override
    public FormulaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.formulalist,parent,false);
        return new FormulaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FormulaViewHolder holder, int position) {
        holder.txtFormula.setText(formulas.get(position).getFormula());
        holder.txtUrl.setText(formulas.get(position).getUrl());
    }

    @Override
    public int getItemCount() {
        return formulas.size();
    }

    class FormulaViewHolder extends RecyclerView.ViewHolder{
        TextView txtFormula,txtUrl;
        public FormulaViewHolder(@NonNull View itemView) {
            super(itemView);
            txtFormula = itemView.findViewById(R.id.txtFormula);
            txtUrl = itemView.findViewById(R.id.txtUrl);
        }
    }
}
