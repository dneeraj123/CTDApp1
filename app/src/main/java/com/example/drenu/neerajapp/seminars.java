package com.example.drenu.neerajapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class seminars extends android.app.Fragment {

    public ListView lv;
    public String[] s={

            "Seminar 1",
            "Seminar 2",
            "Seminar 3",
            "Seminar 4",
            "Seminar 5",
            "Seminar 6"
    };

    public seminars()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_seminars, container, false);
        lv=(ListView)v.findViewById(R.id.semlist);
        SeminarAdapter adapter=new SeminarAdapter(this,s);
        lv.setAdapter(adapter);
        final ViewGroup vg=container;
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Bundle b=new Bundle();
                Intent description=new Intent(vg.getContext(),content_seminar.class);

               if(i==0) {
                   b.putString("key","Description of seminar dsklfndsklfnlksdnflkdsnflkdsnfldsknfl\nmsklfndsmlfndslf");
                   b.putInt("imgid", R.drawable.img1);
               }

               if(i==1) {
                    b.putString("key","Description of seminar 2 ndsaklfndslkfndlkfndslknflsdfnlsn\nmsklaldnslkfnsdlkf ");
                    b.putInt("imgid", R.drawable.img2);
                }
                if(i==2) {
                    b.putString("key","Description of seminar dsklfndsklfnlksdnflkdsnflkdsnfldsknfl\nmsklfndsmlfndslf");
                    b.putInt("imgid", R.drawable.img1);
                }
                if(i==3) {
                    b.putString("key","Description of seminar 2 ndsaklfndslkfndlkfndslknflsdfnlsn\nmsklaldnslkfnsdlkf ");
                    b.putInt("imgid", R.drawable.img2);
                }
                if(i==4) {
                    b.putString("key","Description of seminar dsklfndsklfnlksdnflkdsnflkdsnfldsknfl\nmsklfndsmlfndslf");
                    b.putInt("imgid", R.drawable.img1);
                }
                if(i==5) {
                    b.putString("key","Description of seminar 2 ndsaklfndslkfndlkfndslknflsdfnlsn\nmsklaldnslkfnsdlkf ");
                    b.putInt("imgid", R.drawable.img2);
                }

                description.putExtras(b);
                startActivity(description);


            }
        });

        // Inflate the layout for this fragment
        return v;
    }


    public void prepareSem(int i)
    {


    }





}
