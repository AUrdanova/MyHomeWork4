package io.geektech.myhomework4;

import android.os.Parcel;
import android.os.Parcelable;

public class SaveList implements Parcelable {
    public SaveList(String item) {
        this.item = item;
    }

    private String item;

    public String getItem() {
        return item;
    }

    protected SaveList(Parcel in) {
        item = in.readString();
    }

    public static final Creator<SaveList> CREATOR = new Creator<SaveList>() {
        @Override
        public SaveList createFromParcel(Parcel in) {
            return new SaveList(in);
        }

        @Override
        public SaveList[] newArray(int size) {
            return new SaveList[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(item);
    }
}
