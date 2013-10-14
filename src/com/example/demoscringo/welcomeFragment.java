package com.example.demoscringo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class welcomeFragment extends Fragment {
	private RadioGroup radioGroup;
	private RadioButton	whichselectedradio;
	private RadioButton	isitEmployeeRadioChecked;
	private RadioButton	isitManagerRadioChecked;

	  private Button next;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
            Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.welcome_fragment, parent, false);

        radioGroup = (RadioGroup)v.findViewById(R.id.radioGroup);
        next=(Button)v.findViewById(R.id.Next_button);
        next.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View a){
        		int selectedId = radioGroup.getCheckedRadioButtonId();
        	whichselectedradio=(RadioButton)getView().findViewById(selectedId);
        	isitEmployeeRadioChecked=(RadioButton)getView().findViewById(R.id.employee_radio) ;
        	isitManagerRadioChecked=(RadioButton)getView().findViewById(R.id.manager_radio) ;

            
         //     	Toast.makeText(welcomeFragment.this.getActivity(), "aaaYou're "+whichselectedradio.getText()+", welcome.", Toast.LENGTH_SHORT).show();

        	Bundle bundle=new Bundle();
          	LoginFragment fragobj=new LoginFragment();

            	
        	 Intent i = new Intent(getActivity().getBaseContext(), LoginActivity.class);
        		if(whichselectedradio.getId()==isitEmployeeRadioChecked.getId()){
        		//	i.putExtra("welcomeFragment", 1);
        			bundle.putString("welcomeFragment", "employee");
              	  //set Fragmentclass Arguments
              	}
        		else if(whichselectedradio.getId()==isitManagerRadioChecked.getId())
        			bundle.putString("welcomeFragment", "manager");

        	//		i.putExtra("welcomeFragment", 2);

              	fragobj.setArguments(bundle);

                startActivity(i);

        		/*else if(whichselectedradio.getId()==isitEmployeeRadioChecked.getId()){
        			intent j = new Intent(getActivity().getBaseContext(),LoginActivity.class);
        			startActivity(j)
        		}*/
        	}
        	
        });
        
        return v;
        }


    
}