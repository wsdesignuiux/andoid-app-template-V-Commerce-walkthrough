package adapter;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import e.wolfsoft1.v_commerce_walkthrough.R;
import model.ProductGridModellClass;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapteProductGrid extends RecyclerView.Adapter<RecycleAdapteProductGrid.MyViewHolder> {
    Context context;


    private List<ProductGridModellClass> moviesList;

    int myPos = 0;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title,offer,text;
        ImageView image;
        LinearLayout linear;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            offer = (TextView) view.findViewById(R.id.offer);
            text = (TextView) view.findViewById(R.id.text);
//            linear = (LinearLayout) view.findViewById(R.id.linear);

        }

    }


    public RecycleAdapteProductGrid(Context context, ArrayList<ProductGridModellClass> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_popular_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder,final int position) {
        ProductGridModellClass movie = moviesList.get(position);
        holder.image.setImageResource(movie.getImage());

        holder.offer.setText("\u20B9 63,999");
        holder.offer.setPaintFlags(holder.offer.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        if(position==0 | position==1){
            holder.text.setVisibility(View.VISIBLE);

        }else {
            holder.text.setVisibility(View.GONE);
        }



    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



}


