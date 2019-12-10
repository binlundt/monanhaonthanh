package database;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appmonan.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Resutl.resutl_make;

public class adapterdata extends BaseAdapter {
    Context context ;
    ArrayList<dsmon> list ;

    public adapterdata(ArrayList<dsmon> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View ds = inflater.inflate(R.layout.make_test,null);
//        View ds1 = inflater.inflate((R.layout.activity_resutl_make,null)) ;
        ImageView anh = (ImageView) ds.findViewById(R.id.id_anh);
        TextView ten = (TextView) ds.findViewById(R.id.id_ten);
        TextView nguyenlieu = (TextView) ds.findViewById(R.id.id_nguyenlieu);
        TextView cachlam = (TextView) ds.findViewById(R.id.id_cachlam);
        TextView gia = (TextView) ds.findViewById(R.id.id_gia);
        dsmon mon = list.get(position) ;
        ten.setText(mon.ten);
        cachlam.setText(mon.cachlam);
        nguyenlieu.setText(mon.nguyenlieu);
        gia.setText(mon.gia + "");
        Bitmap bmanh = BitmapFactory.decodeByteArray(mon.anh, 0 , mon.anh.length);
        anh.setImageBitmap(bmanh);
        return ds ;
    }
}
