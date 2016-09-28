package com.patchara.traffice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by A on 28/9/2559.
 */
public class MyAdapter extends BaseAdapter{

    //explicit
    private Context objiContext;
    private int[] trafficInts;
    private String[] trafficStrings;

    public MyAdapter(Context objiContext, int[] trafficInts, String[] trafficStrings) {
        this.objiContext = objiContext;
        this.trafficInts = trafficInts;
        this.trafficStrings = trafficStrings;
    }//constructor

    @Override
    public int getCount() {
        return trafficStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater objlayoutInflater = (LayoutInflater) objiContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objlayoutInflater.inflate(R.layout.my_listview,ViewGroup,false);

        //show Icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imvShowIcon);
        iconImageView.setBackgroundResource(trafficInts[i]);

        //show title
        TextView titleTextView = (TextView) view1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(trafficStrings[i]);
        return view1;
    }
}//main class
