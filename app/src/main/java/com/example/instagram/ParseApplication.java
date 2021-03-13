package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate()
    {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)

                .applicationId("4BsMghMHcU6YSGd4cyrlAw938T7J5C63o0OUkwMs")
                .clientKey("lBYASaHIArIN5UJnmoAalysy6C8AixtRErAKsi2x")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
