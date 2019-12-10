package Resutl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


import com.example.appmonan.R;

import java.util.ArrayList;

import database.adapterdata;
import database.dsmon;

public class resutl_make extends Fragment{
    private TextView textView ;
    private TextView tien1 ;
    int tien ;
    int loai ;
    final String DATABASE_NAME  = "dsmonan.sqlite" ;
    SQLiteDatabase database ;
    private ListView listView ;
    ArrayList<dsmon> list ;
    adapterdata adapter ;
    private Button button ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_resutl_make, container,false);
        textView = (TextView) v.findViewById(R.id.cachlam);
        tien1 = (TextView) v.findViewById(R.id.texttien);
        //database = databasedemo.initDatabase(this , DATABASE_NAME);

        return v;


    }

    public void add(){
        list = new ArrayList<>();
        adapter = new adapterdata( list) ;
        listView.setAdapter(adapter);
    }
    private void getdata(){

        Cursor cursor = database.rawQuery("SELECT * FROM monan WHERE loai = 2 and gia >100000 and gia < 200000  ", null);
        cursor.moveToFirst();
        String loai = cursor.getString(1);
        String ten = cursor.getString(2) ;
    }

}
