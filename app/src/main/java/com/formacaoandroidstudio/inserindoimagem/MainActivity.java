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
     *      . centerCrop a imagem fica centralizada e corta o excesso da imagem.
     *
     *  -> Alinhamento show baseline - cria uma linha base para alinhar o elemento baseado num
     *     outro elemento.
     *     Para fazer isso, clica com o botão direito do mouse em cima do elemento, clica na
     *     opção 'show baseline' e automaticamente vai criar uma linha base onde você vai poder
     *     puxar essa linha base para outra linha base de um outro elemento.
     *
     * */
}
