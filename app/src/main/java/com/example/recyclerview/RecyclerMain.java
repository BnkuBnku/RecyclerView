package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;

import android.content.Intent;
import android.os.Bundle;

public class RecyclerMain extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] departmentName;
    String[] courseName;
    String[] courseFull;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_main);
        recyclerView = findViewById(R.id.recyclerView);
        departmentName = new String[]
                        {"School of Business and Management Education",
                        "School of Teacher Education",
                        "College of Humanities, Social Sciences and Communication",
                        "College of Engineering and Technology",
                        "College of Maritime Education",
                        "College of Hospitality and Tourism Management Education",
                        "College of Criminal Justice Education"};

        courseName = new String[]
                {"BSA " + "BSBA " + "BSCA " + "BSRM " + "BSAT " + "BSAM ",
                "BPE " +  "BSE " +  "BECE " + "BSNE ",
                "BAM " + "BAMC " +  "BSP " + "BSS " +  "BAP ",
                "BLIS " +  "BSEE " + "BSIT " +  "BSCE ",
                "BSMT ",
                "BSHM " + "BSTM ",
                "BSC "};

        courseFull = new String[]
                {"Bachelor of Science in Accountancy " + "\n" +
                "Bachelor of Science in Business Administration" + "\n" +
                "Bachelor of Science in Business Administration in Business Economics" + "\n" +
                "Bachelor of Science in Business Administration in Financial Management" + "\n" +
                "Bachelor of Science in Business Administration in Human Resource Development and Management" + "\n" +
                "Bachelor of Science in Business Administration in Marketing Management" + "\n" +
                "Bachelor of Science in Customs Administration" +  "\n" +
                "Bachelor of Science in Real Estate Management" + "\n" +
                "Bachelor of Science in Accounting Technology" + "\n" +
                "Bachelor of Science in Accounting Management" ,


                "Bachelor of Physical Education " + "\n" +
                "Bachelor of Secondary Education" + "\n" +
                "Bachelor of Secondary Education Major in Filipino" + "\n" +
                "Bachelor of Secondary Education Major in English" + "\n" +
                "Bachelor of Secondary Education Major in Science" + "\n" +
                "Bachelor of Secondary Education Major in Values Education with Catechetics" + "\n" +
                "Bachelor of Secondary Education Major in Mathematics" + "\n" +
                "Bachelor of Secondary Education Major in Social Studies" + "\n" +
                "Bachelor of Elementary Education" + "\n" +
                "Bachelor of Earl Childhood Education" + "\n" +
                "Bachelor of Special Needs Education",

                "Bachelor of Arts Major in Economics" + "\n " +
                "Bachelor of Arts Major in Economics in English Language Studies" + "\n " +
                "Bachelor of Arts Major in Economics in Filipino" + "\n " +
                "Bachelor of Arts Major in Economics in History" + "\n "+
                "Bachelor of Arts Major in Economics in Political Science" + "\n " +
                "Bachelor of Arts Major in Economics in Communication Specializing in Journalism and Broadcasting" + "\n " +
                "Bachelor of Arts Major in Economics in Communication Specializing in New Media Studies" + "\n " +
                "Bachelor of Arts Major in Economics in Communication Specializing in Social Communication" + "\n " +
                "Bachelor of Science in Psychology" + "\n" +
                "Bachelor of Science in Social Work" + "\n" +
                "Bachelor of Arts in Philosophy",

                "Bachelor of Library and Information" + "\n" +
                "Bachelor of Science in Electronics Engineering" + "\n" +
                "Bachelor of Science in Information Technology" + "\n" +
                "Bachelor of Science in Computer Engineering",

                "Bachelor of Science in Marine Transportation",

                "Bachelor of Science in Hospitality Management" + "\n" +
                "Bachelor of Science in Tourism Management",

                "Bachelor of Science in Criminology",
                };



        SchoolAdapter adapter = new SchoolAdapter(this, departmentName, courseName, courseFull);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}