package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnone,btntwo;
    private NotificationManagerCompat notificationManagerCompat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        btnone=findViewById( R.id.btnone);
        btntwo=findViewById( R.id.btntwo);
        notificationManagerCompat=NotificationManagerCompat.from( this);
        Channel channel= new Channel( this);


        btnone.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification();
            }
        } );
        btntwo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification2();
            }
        } );

    }


    private  void DisplayNotification(){
        Notification notification=new NotificationCompat.Builder(this,Channel.CHANNEl_1)
                .setSmallIcon( R.drawable.mesage)
                .setContentTitle( "first Message")
                .setContentText( "First message body")
                .setCategory( NotificationCompat.CATEGORY_MESSAGE )
                .build();
        notificationManagerCompat.notify( 1,notification);
    }

    private  void DisplayNotification2(){
        Notification notification=new NotificationCompat.Builder(this,Channel.CHANNEL_2)
                .setSmallIcon( R.drawable.call)
                .setContentTitle( "first Message")
                .setContentText( "First message body")
                .setCategory( NotificationCompat.CATEGORY_MESSAGE )
                .build();
        notificationManagerCompat.notify( 2,notification);
    }



}
