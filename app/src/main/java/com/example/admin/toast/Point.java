package com.example.admin.toast;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by admin on 13/06/2017.
 */

public class Point implements Parcelable {

    private int compteur;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(compteur);
    }
    public static final Creator<Point> CREATOR = new Creator<Point>() {
        @Override
        public Point createFromParcel(Parcel in) {
            return new Point(in);
        }

        @Override
        public Point[] newArray(int size) {
            return new Point[size];
        }
    };

    protected Point(Parcel in) {
        compteur = in.readInt();
    }

    public Point(){
        compteur = 0;
    }

    public void increment() {
        compteur ++;
    }

    public int getCompteur(){
        return compteur;
    }


}
