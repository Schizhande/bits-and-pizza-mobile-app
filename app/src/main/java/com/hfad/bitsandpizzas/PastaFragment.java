package com.hfad.bitsandpizzas;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PastaFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView PastaRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_pasta, container, false);

        String[] pastaNames = new String[Pasta.pastas.length];

        for (int i = 0; i < pastaNames.length; i++) {
            pastaNames[i] = Pasta.pastas[i].getName();
        }

        int[] pastaImages = new int[Pasta.pastas.length];

        for (int i = 0; i < pastaImages.length; i++) {
            pastaImages[i] = Pasta.pastas[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(pastaNames, pastaImages);
        PastaRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        PastaRecycler.setLayoutManager(layoutManager);
//
//        adapter.setListener(new CaptionedImagesAdapter.Listener() {
//            public void onClick(int position) {
//                Intent intent = new Intent(getActivity(), PastaDetailActivity.class);
//                intent.putExtra(PastaDetailActivity.EXTRA_Pasta_ID, position);
//                getActivity().startActivity(intent);
//            }
//        });

        return PastaRecycler;
    }
}
