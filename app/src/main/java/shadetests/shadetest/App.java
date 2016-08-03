package shadetests.shadetest;

import com.firebase.client.Firebase;

/**
 * Created by Bini on 8/2/2016.
 */
public class App extends android.app.Application {
    Firebase mRef;

    @Override
    public void onCreate() {
        super.onCreate();
        mRef = new Firebase("https://rush-8b83.firebaseio.com");

    }
}
