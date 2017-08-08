/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        Log.v("Main activity","Layout initialized");
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        Log.v("Main activity","View Pager Initialized");
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        Log.v("Main activity","Category adapter initialized and object initialized");
        CategoryAdapter adapter = new CategoryAdapter(getApplicationContext(),getSupportFragmentManager());

        // Set the adapter onto the view pager
        Log.v("Main activity","adapter set with viewpager");
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        /*TextView num_act = (TextView) findViewById(R.id.numbers);
        num_act.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                 Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });


        TextView faml_act = (TextView) findViewById(R.id.family);
        faml_act.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent numbersIntent = new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView col_act = (TextView) findViewById(R.id.colors);
        col_act.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent numbersIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView phrase_act = (TextView) findViewById(R.id.phrases);
        phrase_act.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent numbersIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(numbersIntent);
            }
        });*/


    }
}
