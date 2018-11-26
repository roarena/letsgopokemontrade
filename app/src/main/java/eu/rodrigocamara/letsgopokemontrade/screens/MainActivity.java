package eu.rodrigocamara.letsgopokemontrade.screens;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import eu.rodrigocamara.letsgopokemontrade.R;
import eu.rodrigocamara.letsgopokemontrade.screens.fragments.UserPokemonsFragment;
import eu.rodrigocamara.letsgopokemontrade.utils.FireStoreUtils;


public class MainActivity extends AppCompatActivity{
    private ActionBar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = getSupportActionBar();

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FireStoreUtils.configureFireStore();

        loadFragment(new UserPokemonsFragment());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_user_pokemon:
                    loadFragment(new UserPokemonsFragment());
                    mToolbar.setTitle(R.string.title_your_pokemons);
                    return true;
                case R.id.navigation_search:
                    mToolbar.setTitle(R.string.title_search);
                    return true;
                case R.id.navigation_profile:
                    mToolbar.setTitle(R.string.title_profile);
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
