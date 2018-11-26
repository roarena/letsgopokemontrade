package eu.rodrigocamara.letsgopokemontrade.screens.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;

import eu.rodrigocamara.letsgopokemontrade.R;
import eu.rodrigocamara.letsgopokemontrade.data.utils.DataUtils;
import eu.rodrigocamara.letsgopokemontrade.utils.C;
import eu.rodrigocamara.letsgopokemontrade.utils.FireStoreUtils;

public class UserPokemonsFragment extends Fragment {

    private Button mBtnAddPokemon;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_pokemons, container, false);

        setupUI(view);

        return view;
    }

    private void setupUI(View v) {
        mBtnAddPokemon = v.findViewById(R.id.userPokemons_btnAddPokemon);
        mBtnAddPokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                FireStoreUtils.getFireStore().collection(C.POKEMON_COLLECTION_PATH)
                        .add(DataUtils.createTestPokemon())
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Toast.makeText(v.getContext(),
                                        R.string.toast_pokemon_added, Toast.LENGTH_LONG).show();
                                Log.d(C.LOG_TAG, "Pokémon added with ID: "
                                        + documentReference.getId());
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(C.LOG_TAG, "Error adding pokémon", e);
                            }
                        });
            }
        });
    }

}
