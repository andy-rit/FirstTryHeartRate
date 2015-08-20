package com.rittie.andy.testing;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Andy on 17/08/2015.
 */
public class User implements Parcelable {
    private long id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.id = 1;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel pc, int flags) {
        pc.writeLong(id);
        pc.writeString(name);
        pc.writeString(email);
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        public User createFromParcel (Parcel pc) {
            return new User(pc);
        }
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User(Parcel pc){
        id = pc.readLong();
        name = pc.readString();
        email = pc.readString();
    }
}
