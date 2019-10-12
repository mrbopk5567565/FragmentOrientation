package thinhtien.pntt.phannguyentruongthinh.fragmentorientation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {


    View mView;
    RecyclerView mRecyclerView;
    SanphamAdapter mSanphamAdapter;
    ArrayList<SanPham> mSanpham;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_list, container, false);
        mRecyclerView = mView.findViewById(R.id.recyclerview);
        mSanpham = new ArrayList<>();
        mSanpham.add(new SanPham("May tinh de ban"));
        mSanpham.add(new SanPham("Dung cu chua chay"));
        mSanpham.add(new SanPham("Dien thoai di dong"));
        mSanpham.add(new SanPham("Loa vi tinh"));
        mSanpham.add(new SanPham("May tinh de ban"));

        mSanphamAdapter = new SanphamAdapter(mSanpham);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(mSanphamAdapter);

        ((SanphamAdapter)mRecyclerView.getAdapter()).onItemClick(new OnItemClickListener() {
            @Override
            public void onClickItem(View view, int position) {
                Toast.makeText(getActivity(), mSanpham.get(position).getTen(), Toast.LENGTH_SHORT).show();
            }
        });
        return mView;
    }

}
