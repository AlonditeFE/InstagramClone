package com.example.instagramclone;

import android.app.Application;
import android.os.Handler;
import com.parse.Parse;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        ParseObject.registerSubclass(Like.class);

        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MTA3qr87RKHV9iKheMG1Iac6HXhVBCeXdru70ixT")
                .clientKey("YcB12P4kX2rJ7E9i6yoICkKNkFe50EI8eP72RpHT")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
