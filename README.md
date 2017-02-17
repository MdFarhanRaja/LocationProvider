# LocationProvider
Location &amp; Address Provider

Step 1. Add the JitPack repository to your build file

 	 Add it in your root build.gradle at the end of repositories:
	allprojects 
	{
		repositories 
		{
			maven { url 'https://jitpack.io' }
		}
	}
	
Step 2. Add the dependency

	dependencies 
	{
	        compile 'com.github.MdFarhanRaja:LocationProvider:1.0'
	}
	
Step 3. Add inside your Activity or Fragment

 	new FarhanLocationRequestService(MainActivity.this).executeService(new FarhanLocationRequestService.FrahanLocationListener() 
	{
            @Override
            public void onLocationUpdate(Location location, Address address)
            {
                //Latitude & Longitude
                Log.e("Latitude",location.getLatitude()+"");
                Log.e("Longitude",location.getLongitude()+"");
                
                //For Complete Address
                for(int i=0;i<=address.getMaxAddressLineIndex();i++)
                {
                    Log.e("Address Index: "+i + "> ",address.getAddressLine(i));
                }
                
                //For Particular Address Index
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
	
NOTE: Don't forgot to Enable Location Permission & GPS otherwise unable to detect your Location
