package com.example.demoscringo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LoginFragment extends Fragment {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	    }

	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
	            Bundle savedInstanceState) {
	          String strtext=getArguments().getString("welcomeFragment");
	        	  /*  //  	  int xx=R.layout.employee_login_fragment;
	          
	  		//    return v;
	        	  }
	          else if(strtext=="employee"){
	        //	  v=inflater.inflate(R.layout._login_fragment, parent, false);

	          }*/	              	  
	        
		      	  View v=inflater.inflate(R.layout.employee_login_fragment, parent, false);

	         
			return v;
	     

	        }
}
