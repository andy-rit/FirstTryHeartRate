package com.rittie.andy.testing;

import android.os.Parcel;
import android.os.Parcelable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andy Rittie on 17/08/2015.
 */
public class User implements Parcelable {
    private long id;
    private String name;
    private String email;
    private List<Double> restingHR;

    public User(String name, String email) {
        this.id = 1;
        this.name = name;
        this.email = email;
        this.restingHR = new ArrayList<Double>();
    }

    public void setRestingHR(double restingHR) {
        this.restingHR.add(restingHR);
    }

    public double calcAvg() {

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
