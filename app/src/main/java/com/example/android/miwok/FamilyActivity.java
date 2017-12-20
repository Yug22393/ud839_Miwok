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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("one","lutti"));
        family.add(new Word("two","oṭiiko"));
        family.add(new Word("three","tolookosu"));
        family.add(new Word("four","oyyiisa"));
        family.add(new Word("five","massokka"));
        family.add(new Word("six","temmokka"));
        family.add(new Word("seven","kenekaku"));
        family.add(new Word("eight","kawinṭa"));
        family.add(new Word("nine","wo'e"));
        family.add(new Word("ten","na'aacha"));

        WordAdapter adapter = new WordAdapter(FamilyActivity.this,family);
        ListView listView = (ListView)findViewById(R.id.family_list_view);
        listView.setAdapter(adapter);
    }
}
