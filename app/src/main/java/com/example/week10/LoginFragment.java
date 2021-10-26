package com.example.week10;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginFragment extends Fragment {
    private FirebaseAuth mAuth;
    final private String TAG = "TAG";

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

//    EditText editTextEmailAddress;
//    EditText editTextPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

//        editTextEmailAddress = view.findViewById(R.id.editTextTextEmailAddressLogin);
//        editTextPassword = view.findViewById(R.id.editTextPasswordLogin);
//
//        view.findViewById(R.id.buttonLogin).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String email = editTextEmailAddress.getText().toString();
//                String password = editTextPassword.getText().toString();
//
//                if (email.isEmpty()) {
//                    Toast.makeText(getActivity(), "Enter Email", Toast.LENGTH_SHORT).show();
//                } else if (password.isEmpty()) {
//                    Toast.makeText(getActivity(), "Enter Password", Toast.LENGTH_SHORT).show();
//                } else {
//                    mAuth = FirebaseAuth.getInstance();
//                    mAuth.signInWithEmailAndPassword(email, password)
//                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                                @Override
//                                public void onComplete(@NonNull Task<AuthResult> task) {
//                                    if (task.isSuccessful()) {
//                                        Log.d(TAG, "onComplete: Logged in successfully");
//                                    } else {
//                                        Log.d(TAG, "onComplete: Error!");
//                                        Log.d(TAG, "onComplete: " + task.getException().getMessage());
//                                    }
//                                }
//                            });
//                }
//            }
//        });
//
//        view.findViewById(R.id.buttonLogin).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        return view;
    }
}