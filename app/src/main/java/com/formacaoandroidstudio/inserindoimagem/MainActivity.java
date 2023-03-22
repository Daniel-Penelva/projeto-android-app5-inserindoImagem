package com.formacaoandroidstudio.inserindoimagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Aba atrributes - para elemento imagem:
     *   -> srcCompat no Pick resources é possível alterar a imagem.
     *   -> scaleType define como a imagem vai ser definida no latout.
     * */
}
