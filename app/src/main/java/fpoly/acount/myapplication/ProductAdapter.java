package fpoly.acount.myapplication;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{

    class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView txtTenSp, txtGiaSp;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            txtGiaSp = itemView.findViewById(R.id.txtGia);
            txtTenSp = itemView.findViewById(R.id.txtTenSp);
        }
    }

    private ArrayList<Product> lst;

    public ProductAdapter(ArrayList<Product> lst){
        this.lst = lst;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.cardview, parent, false);
        ProductViewHolder viewHolder = new ProductViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = lst.get(position);
        String name = lst.get(position).getTensp();
        holder.txtTenSp.setText(name);
        holder.txtGiaSp.setText(Integer.toString(product.getGia()));
    }

    @Override
    public int getItemCount() {
        return lst.size();
    }


}
