package sdu.cs.eakkapod.trafficappnew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//Activity นี้สร้าง Layout เสมือน เพื่อนำไปแสดงบนหน้า MainActivity
public class MyAdapter extends BaseAdapter {
    //ประกาศตัวแปล
    Context context;
    int[] ints;//ตัวแปลเก็บรูป logo
    String[] titleString, detailString;//titleString เก็บชื่อ logo, detailString เก็บรายละเอียด logo

    public MyAdapter(Context context, int[] ints, String[] titleString, String[] detailString) {
        this.context = context;
        this.ints = ints;
        this.titleString = titleString;
        this.detailString = detailString;
    }

    @Override
    public int getCount() { //นับจำนวนข้อมูลที่จะแสดงผล แล้วส่งต่อไปยัง method getview
        return ints.length;
    }

    @Override
    public Object getItem(int position) { //ไม่ใช้
        return null;
    }

    @Override
    public long getItemId(int position) { //ไม่ใช้
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) { //นำข้อมูลที่ได้จาก methid getCount ไปแสดงผลขนหน้าแอป

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false); // inflate ดึงค่าจาก xml มาแสดงผลบนแอป

        //ผูกตัวแปลบน java กับ xml
        ImageView iconImageView     = view1.findViewById(R.id.imageView);
        TextView titleTextView  = view1.findViewById(R.id.textView2);
        TextView detailTextView = view1.findViewById(R.id.textView3);

        //show view นำข้อมูลไปแสดงผลบนแอป
        iconImageView.setImageResource(ints[i]);
        titleTextView.setText(titleString[i]);
        detailTextView.setText(detailString[i]);

        return view1;
    }
}//end class
