package com.example.android.anaheimtourguideapp;

public class Location {
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mLocationNameId;
    private int mLocationAddressId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Location(int locationNameId, int locationAddressId, int imageResourceId) {
        mLocationNameId = locationNameId;
        mLocationAddressId = locationAddressId;
        mImageResourceId = imageResourceId;
    }

    public int getLocationNameId() {
        return mLocationNameId;
    }

    public int getLocationAddressId() {
        return mLocationAddressId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
