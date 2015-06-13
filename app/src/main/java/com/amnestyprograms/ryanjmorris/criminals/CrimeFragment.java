package com.amnestyprograms.ryanjmorris.criminals;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Ryan on 6/12/2015.
 */
public class CrimeFragment extends Fragment
{
    //Privately calls the object, Crime, as mCrime to be used later.
    private Crime mCrime;
    //Basic EditText.
    private EditText mTitleField;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //mCrime object is now initialized.
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        //Creating a View object, v, which inflates a fragment as a layout.
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);

        //Giving the EditText an object to associate itself with.
        mTitleField = (EditText)v.findViewById(R.id.crime_title);

        //This watches the text changing persistently.
        mTitleField.addTextChangedListener(new TextWatcher()
        {
            public void onTextChanged(CharSequence c, int start, int before, int count)
            {
                //Inside of the Crime object, it is changing the title as they type.
                mCrime.setmTitle(c.toString());
            }

            public void beforeTextChanged(CharSequence c, int start, int before, int after)
            {
                //This space is intentially left blank.
            }

            public void afterTextChanged(Editable c)
            {
                //This one as well.
            }

        });
        //At the end, returns the view.
        return v;
    }

}
