package com.ualr.recyclerviewassignment;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class SharedViewModel extends ViewModel {

    private MutableLiveData<List<Inbox>> items;
    private AdapterListInbox mAdapter;
    ViewModel mViewModel;

    public SharedViewModel() {items = new MutableLiveData<>();}

    mViewModel.getItems().observe(this, new Observer<List<Inbox>>() {
        @Override
        public void onChanged(List<Inbox> items) {
            mAdapter.updateItems(items);
        }
    });


}

