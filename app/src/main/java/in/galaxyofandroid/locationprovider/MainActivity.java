package in.galaxyofandroid.locationprovider;

import android.location.Address;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import in.galaxyofandroid.farhanlocation.FarhanLocationRequestService;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView)findViewById(R.id.address);

        new FarhanLocationRequestService(MainActivity.this).executeService(new FarhanLocationRequestService.FrahanLocationListener() {
            @Override
            public void onLocationUpdate(Location location, Address address)
            {
                Log.e("Total Address",address.getMaxAddressLineIndex()+"");
                for(int i=0;i<=address.getMaxAddressLineIndex();i++)
                {
                    Log.e("Address Index: "+i + "> ",address.getAddressLine(i));
                }
                try{  Log.e("Admin Area",address.getAdminArea());}catch (Exception e){}
                try{ Log.e("Country Code",address.getCountryCode());}catch (Exception e){}
                try{ Log.e("Country Name",address.getCountryName());}catch (Exception e){}
                try{Log.e("Feature Name",address.getFeatureName());}catch (Exception e){}
                try{Log.e("Locality",address.getLocality());}catch (Exception e){}
                try{ Log.e("Pin Code",address.getPostalCode());}catch (Exception e){}
                try{Log.e("Sub-admin Area",address.getSubAdminArea());}catch (Exception e){}
                try{Log.e("Sub-Locality",address.getSubLocality());}catch (Exception e){}
                try{Log.e("Premises",address.getPremises());}catch (Exception e){}
                try{ Log.e("Thoroughfare",address.getThoroughfare());}catch (Exception e){}
                try{Log.e("Sub-Thoroughfare",address.getSubThoroughfare());}catch (Exception e){}

            }
        });

    }
}
