package com.example.space;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class PostAdapter extends BaseAdapter {
    private Context context;
    private List<Post> posts;

    public PostAdapter(Context context, List<Post> posts) {
        this.context = context;
        this.posts = posts;
    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_post,parent,false);
        }
        TextView Titel=convertView.findViewById(R.id.text2);
        ImageView image=convertView.findViewById(R.id.D);


        Post post=(Post) getItem(position);
        Titel.setText(post.getTital());
        image.setImageResource(Integer.parseInt(post.getImage()));

//        Thread thread = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                try {
//                    Bitmap bitmap = null;
//                    bitmap = BitmapFactory.decodeStream((InputStream)new URL(post.getImage1()).getContent());
//
//                    image1.setImageBitmap(bitmap);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        thread.start();

        return convertView;
    }
}
