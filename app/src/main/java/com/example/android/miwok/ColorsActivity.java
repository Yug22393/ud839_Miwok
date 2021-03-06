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

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("one","lutti"));
        colors.add(new Word("two","oṭiiko"));
        colors.add(new Word("three","tolookosu"));
        colors.add(new Word("four","oyyiisa"));
        colors.add(new Word("five","massokka"));
        colors.add(new Word("six","temmokka"));
        colors.add(new Word("seven","kenekaku"));
        colors.add(new Word("eight","kawinṭa"));
        colors.add(new Word("nine","wo'e"));
        colors.add(new Word("ten","na'aacha"));

        WordAdapter adapter = new WordAdapter(ColorsActivity.this,colors);
        ListView listView = (ListView)findViewById(R.id.colors_list_view);
        listView.setAdapter(adapter);
    }
}
