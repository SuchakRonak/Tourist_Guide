package nf.co.phycho.touristguide;

import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by xxxxx on 4/16/2016.
 */
public class Globles {
GoogleApiClient mGoogleApiClient;
    String LOG_TAG = "nf.co.phycho.touristguide";

    public GoogleApiClient getmGoogleApiClient() {
        return mGoogleApiClient;
    }

    public void setmGoogleApiClient(GoogleApiClient mGoogleApiClient) {
        this.mGoogleApiClient = mGoogleApiClient;
    }

    public String getLOG_TAG() {
        return LOG_TAG;
    }

    public void setLOG_TAG(String LOG_TAG) {
        this.LOG_TAG = LOG_TAG;
    }
}
