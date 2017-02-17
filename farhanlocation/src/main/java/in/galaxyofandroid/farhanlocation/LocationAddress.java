package in.galaxyofandroid.farhanlocation;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.util.Log;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class LocationAddress {

    private static final String TAG = "LocationAddress";
    Address address=null;

    public Address getAddressFromLocation(final double latitude, final double longitude,final Context context)
    {
        Geocoder geocoder = new Geocoder(context, Locale.getDefault());
        try
        {
            List<Address> addressList = geocoder.getFromLocation(latitude, longitude, 1);
            if (addressList != null && addressList.size() > 0)
            {
                address = addressList.get(0);
            }
        }catch(Exception e)
        {
            Log.e(TAG, "Unable connect to Geocoder", e);
        }
        return address;
    }
}

