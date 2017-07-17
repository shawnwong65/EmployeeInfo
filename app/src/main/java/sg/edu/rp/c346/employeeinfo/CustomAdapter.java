package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;

    //Step 1:Modify your data class name

    ArrayList<Info> infos;
    public CustomAdapter(Context context, int resource, ArrayList<Info> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        infos = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Standard code. Don't need to modify
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        //Step 2: You code this segment - Obtain the UI Elements and assign to variables
        TextView tvName = (TextView) rowView.findViewById(R.id.textViewName);
        TextView tvJob = (TextView) rowView.findViewById(R.id.textViewJob);
        TextView tvPay = (TextView) rowView.findViewById(R.id.textViewPay);

        //Obtain the to-do item based on the 'position'
        Info currentItem = infos.get(position);

        //Set the TextView to display corresponding information
        tvName.setText(currentItem.getName());
        tvJob.setText(currentItem.getJob());
        tvPay.setText(currentItem.getPay() + "");

        return rowView;
    }
}
