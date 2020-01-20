package com.example.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

public class Channel {
    public Channel(Context context) {
        this.context = context;
    }

    Context context;
    public final static  String CHANNEl_1="Channel1";
    public final static String  CHANNEL_2="Chnnel2";


    public void createChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel1= new NotificationChannel(
                    CHANNEl_1,"CHannel ", NotificationManager.IMPORTANCE_HIGH
            );
            channel1.setDescription( "this is channel 1" );
            NotificationChannel channel2= new NotificationChannel(
                    CHANNEL_2,"Channel 2",NotificationManager.IMPORTANCE_LOW
            );
            channel2.setDescription( "this is channel 2");
            NotificationManager manager=context.getSystemService( NotificationManager.class );
            manager.createNotificationChannel( channel1);
            manager.createNotificationChannel( channel2);

        }


    }




}
