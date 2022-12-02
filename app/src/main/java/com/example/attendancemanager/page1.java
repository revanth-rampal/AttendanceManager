    package com.example.attendancemanager;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;
<<<<<<< HEAD

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

    public class page1 extends AppCompatActivity {
    FloatingActionButton fab;
=======
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.RecoverySystem;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

    public class page1 extends AppCompatActivity {
    FloatingActionButton fab;
    RecyclerView recyclerView;
    ClassAdapter classAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<classitem> classitems =new ArrayList<>();

    EditText class_edt;
    EditText subject_edt;

>>>>>>> 4db8584 (second commit)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        fab=findViewById(R.id.fab_main);
        fab.setOnClickListener(view -> showDialog());
<<<<<<< HEAD
=======

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        classAdapter = new ClassAdapter(this,classitems);
        recyclerView.setAdapter(classAdapter);
>>>>>>> 4db8584 (second commit)
    }
    private void showDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        View view = LayoutInflater.from(this).inflate(R.layout.class_dialogue,null);
<<<<<<< HEAD

        builder.setView(view);
        builder.create().show();
    }
}
=======
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();

        class_edt=findViewById(R.id.class_edt);
        subject_edt=findViewById(R.id.subject_edt);

        Button cancel = view.findViewById(R.id.cancel_btn);
        Button add = view.findViewById(R.id.add_btn);
        cancel.setOnClickListener(view1 ->dialog.dismiss());
add.setOnClickListener(view1 -> {
            addClass();
            dialog.dismiss();
        });
    }

        private void addClass() {
        String className = class_edt.getText().toString();
        String subjectName = subject_edt.getText().toString();
        classitems.add(new classitem(className,subjectName));
        classAdapter.notifyDataSetChanged();

        }
    }
>>>>>>> 4db8584 (second commit)
