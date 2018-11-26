package eu.rodrigocamara.letsgopokemontrade.utils;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;

public class FireStoreUtils {

    public static void configureFireStore() {
        FirebaseFirestore.setLoggingEnabled(true);

        FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder()
                .setTimestampsInSnapshotsEnabled(true)
                .build();

        getFireStore().setFirestoreSettings(settings);
    }

    public static FirebaseFirestore getFireStore() {
        return FirebaseFirestore.getInstance();
    }
}
