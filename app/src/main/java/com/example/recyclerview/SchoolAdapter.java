package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.*;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.SchoolViewHolder> {


    Context context;
    String[] departmentName;
    String[] courseName;
    String[] courseFull;

    public SchoolAdapter(Context c, String[] department, String[] course,String[] coursefull){
        context = c;
        departmentName = department;
        courseName = course;
        courseFull = coursefull;


    }

    @NonNull
    @Override
    public SchoolViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.department_row,parent, false);

        return new SchoolViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolViewHolder holder, int position) {

        holder.departmentHolder.setText(departmentName[position]);
        holder.courseHolder.setText(courseName[position]);
        holder.coursefullHolder.setText(courseFull[position]);



    }

    @Override
    public int getItemCount() {

        return departmentName.length;
    }

    public class SchoolViewHolder extends RecyclerView.ViewHolder {

        TextView departmentHolder;
        TextView courseHolder;
        TextView coursefullHolder;
        ConstraintLayout Layout;

        public SchoolViewHolder(@NonNull View itemView) {
            super(itemView);
            departmentHolder = itemView.findViewById(R.id.textView);
            courseHolder = itemView.findViewById(R.id.textView2);
            coursefullHolder = itemView.findViewById(R.id.textView5);
            Layout = itemView.findViewById(R.id.constraintLayout);
            Layout.setOnClickListener(onLayoutClick);
        }

        OnClickListener onLayoutClick = new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, RecyclerMain2.class);
                i.putExtra("department", departmentHolder.getText().toString());
                i.putExtra("full", coursefullHolder.getText().toString());

                context.startActivity(i);
            }
        };
    }


}



