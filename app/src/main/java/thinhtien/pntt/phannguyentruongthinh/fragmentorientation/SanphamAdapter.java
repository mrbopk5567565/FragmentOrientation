package thinhtien.pntt.phannguyentruongthinh.fragmentorientation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SanphamAdapter extends RecyclerView.Adapter<SanphamAdapter.SanphamHolder> {

    ArrayList<SanPham> mSanpham;

    public SanphamAdapter(ArrayList<SanPham> mSanpham) {
        this.mSanpham = mSanpham;
    }

    @NonNull
    @Override
    public SanphamHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_sanpham,null);
        return new SanphamHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SanphamHolder holder, int position) {
        SanPham sanPham = mSanpham.get(position);
        holder.txtDetail.setText(sanPham.getTen());
    }

    @Override
    public int getItemCount() {
        return mSanpham != null ? mSanpham.size() : 0;
    }

    class SanphamHolder extends RecyclerView.ViewHolder {
        TextView txtDetail;
        public SanphamHolder(@NonNull View itemView) {
            super(itemView);

            txtDetail = itemView.findViewById(R.id.textviewChitiet);
        }
    }
}
