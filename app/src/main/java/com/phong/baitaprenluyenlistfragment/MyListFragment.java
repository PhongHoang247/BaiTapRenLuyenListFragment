package com.phong.baitaprenluyenlistfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class MyListFragment extends ListFragment implements AdapterView.OnItemClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Nạp layout fragment:
        View view = inflater.inflate(R.layout.list_fragment,null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Nạp dữ liệu lên:
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                getActivity(),
                R.array.arrThu,
                android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        //Gán sự kiện:
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        int vt = i;
        String data = getListAdapter().getItem(i)+ "";
        Toast.makeText(getActivity(),"Bạn chọn vị trí " + vt + "; Giá trị = " + data,Toast.LENGTH_LONG).show();
    }
}
