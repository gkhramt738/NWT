package com.zybooks.testsplash;

import android.content.Context;
import android.content.SharedPreferences;

public class Unused {

    // Apply a shadow to the popup window
    //        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            popupWindow.setElevation(20);
//        }

    /* ------------------------------------------------------------------------------

    FROM ValueStorage -- Unused

    public static void save(NamedValue value) {
        storageList.add(value);
    }

    /* ------------------------------------------------------------------------------

        FROM ValueStorage -- Check if storageList contains current element being examined, add to list if not in it already

        public static NamedValue findByName(String name) {
            // Check if storageList contains current element being examined, add to list if not in it already
            if (!storageList.contains(name)) {
                //storageList.add(name);
            } else {
                // do nothing
            }
            return null;
        }

    /* ------------------------------------------------------------------------------ */

    //    FROM ValueStorage -- Check if storageList contains current element being examined, add to list if not in it already
    //      This is a less effective way to update entries, as if the entry exists it will be deleted and recreated from scratch to update
    //      This will require the list to be recreated, which is not an optimal and efficent solution.

//        if (!storageList.contains(obj)) {
//            storageList.add(obj);
//        } else {
//            storageList.remove(obj);
//            storageList.add(obj);
//        }

    /* ------------------------------------------------------------------------------ */

    //    Button loginButton;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_home_activity);
//
//        loginButton = (Button) findViewById(R.id.login_button);
//        loginButton.setOnClickListener(HomeActivity.this);
//    }
//
//    @Override
//    public void onClick(View v) {
//        //Your Logic
//        Intent intent = new Intent(this, UserLoginScreen.class);
//        startActivity(intent);
//    }
//
////    TextView textView;
////    Button loginButton = (Button) findViewById(R.id.login_button);
////    loginButton.setOnClickListener
//
//    Button guestButton;
//
//    public void buttonClick(View view) {
//        switch (view.getId()) {
//            case R.id.login_button:
//                Intent intent = new Intent(this, UserLoginScreen.class);
//                startActivity(intent);
//                //intent.setClassName(com.zybooks.testsplash, com.zybooks.testsplash.HomeActivity);
//
//        }
//    }
//
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_home_activity, container, false);
//
//        loginButton = view.findViewById(R.id.login_button);
//        guestButton = view.findViewById(R.id.guest_button);
//
//        loginButton.setOnClickListener(view1 -> {
//            // TO-DO - Go from fragment button to new activity
////             UserLoginScreen userLoginFragment = new UserLoginScreen();
////             getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, userLoginFragment).commit();
//        });
//
//        guestButton.setOnClickListener(view2 -> {
//            // TO-DO - Go from fragment button to new activity
////              GuestLoginScreen guestLoginFragment = new GuestLoginScreen();
////             getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, guestLoginFragment).commit();
//        });
//
//        return view;
//    }


//    Courtesy of: Evstropov V
//    private void saveFromEditText(String text) {
//        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPref.edit();
//        editor.putString(KEY, text);
//        editor.apply();
//    }
//
//        private String getValue() {
//            SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
//            q1SavedValue = sharedPref.getString(KEY, "");
//
//            return q1SavedValue;
//        }


}
