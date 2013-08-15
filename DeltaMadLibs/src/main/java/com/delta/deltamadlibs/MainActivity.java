package com.delta.deltamadlibs;

import android.os.Bundle;
import android.app.Activity;
import android.os.Looper;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends Activity {


    ///Member variables
    TextView mTextView;
    Button mSwitcherButton;
    String myMadLib;
    int flipFlopper;
    List<String> tomList;
    //Add a List as a member variable here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.storyText);


        tomList=new ArrayList<String>();
//        String[] words= new String[]{"tomlist", "fish", "ice", "citybus"
//        };
//
        tomList.add("Fish"); //first one is zero

        final String getThatString = tomList.get(0);


        tomList.add(1,"ice");

        final String getThatStringOut = tomList.get(1);

        tomList.add(2,"citybus");

        final String getThatStringOut2 = tomList.get(2);

        tomList.add(3,"Moose");
        final String getThatString3= tomList.get(3);






       // List myList = new ArrayList();
       // String[] words = {"000", "aaa", "bbb", "ccc", "ddd"};
       // Collections.addAll(myList, words);


        // Setup the list here, and reference it in the myMadLib string.

       //Stage 3:  create a list object member variable and in code add some random silly words to populate the mad lib with




        myMadLib = tomList.get(0)+" both alike in dignity,\n" +
                "In fair "+ tomList.get(1) + " where we lay our scene,\n" +
                "From ancient"+tomList.get(2)+" break to new mutiny,\n" +
                "Where civil blood makes civil hands unclean.\n" +
                "From forth the fatal loins of these two foes\n" +
                "A pair of star-cross`d"+ tomList.get(0)+ "take their life;\n" +
                "Whole misadventured piteous overthrows\n" +
                "Do with their"+tomList.get(1)+ "bury their parents` strife.\n" +
                "The fearful passage of their "+tomList.get(2)+ "love,\n" +
                "And the continuance of their parents` rage,\n" +
                "Which, but their children`s end, nought could "+ tomList.get(0)+",\n" +
                "Is now the " + tomList.get(1)+" hours` traffic of our stage;\n" +
                "The which if you with "+ tomList.get(0) + tomList.get(2)+ " attend,\n" +
                "What here shall "+ tomList.get(1) +" our toil shall strive to mend.";




        mTextView.setText(myMadLib);
        flipFlopper = 0;

        //setup our listener onclick
        mSwitcherButton = (Button) findViewById(R.id.switchButton);
        mSwitcherButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (flipFlopper == 0)
                {
                   // StringBuilder builder = new StringBuilder();
                   // String[] arr = {"These","are","some","words"};
                   // for (String s : arr){
                     //  builder.append(s+" ");
                      //  textview.setText(builder.toString());
                    //This is where you should loop through your list and create a string to describe the values.

                    // for loop
                    //System.out.println("#2 for");
                    //for (int i = 0; i < lList.size(); i++) {
                       // System.out.println(lList.get(i));

                    String stringOfText = "";

                    for (int i= 0; i< tomList.size();i++) {


                        stringOfText = stringOfText + tomList.get(i) + "\n";



                    }


                    mTextView.setText(stringOfText);

                    flipFlopper = 1;
                }else{
                    //this displays the madlib instead.
                    mTextView.setText(myMadLib);
                    flipFlopper = 0;
                }
            }



        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
