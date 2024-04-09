package com.example.test;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Setting extends AppCompatActivity{
    private ListView list;
    private String[] settingArrays = {"Profile","Buying","Selling","Favourites","Portfolio","Wallet","Setting"};
    private String[] descriptionArrays = {"Name, Email, Password, Shoe Size"
            ,"Active Bids, In-Progress, Orders"
            ,"Active Asks, Sales, Seller Profile"
            ,"Items and lists you’ve saved"
            ,"See the value of your items"
            ,"Payments, Payouts"
            ,"Any Settings you need"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_setting);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.setting_page), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        list = (ListView) findViewById(R.id.settingList1);
        list.setAdapter(new CustomListView(getApplicationContext()));

    }

    public class CustomListView extends BaseAdapter{

        public Context mContext;
        public Context mContext2;

        public LayoutInflater mInflater;
        public LayoutInflater mInflater2;

        public CustomListView(Context context){
            mContext = context;
            mContext2 = context;
            mInflater = LayoutInflater.from(mContext);
            mInflater2 = LayoutInflater.from(mContext2);
        }

        @Override
        public int getCount(){
            return 7;
        }
        @Override
        public Object getItem(int i){
            return null;
        }
        @Override
        public long getItemId(int i){
            return 0;
        }
        @Override
        public View getView(int i, View view, ViewGroup viewGroup){
            ViewHolder holder = null;
            ViewHolder1 holder1 = null;
            if(view == null){
                view = mInflater.inflate(R.layout.setting_list_item, null);
                holder = new ViewHolder();
                holder1 = new ViewHolder1();
                holder1.description = (TextView) view.findViewById(R.id.descriptionSetting);
                holder.title = (TextView) view.findViewById(R.id.settingTopic);
                view.setTag(holder);
                view.setTag(holder1);
            }else{
                holder1 = (ViewHolder1) view.getTag();
                holder = (ViewHolder) view.getTag();
            }
            holder1.description.setText(descriptionArrays[i]);
            holder.title.setText(settingArrays[i]);
            return view;
        }

    }
    public class ViewHolder{
        TextView title;
    }
    public class ViewHolder1{
        TextView description;
    }
}

