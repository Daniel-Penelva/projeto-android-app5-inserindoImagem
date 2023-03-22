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
     *
     *  -> Adicionei o 'android:screenOrientation="sensor"' para poder rotacionar a tela.
     *
     *  -> Vamos criar um scrool para manipular a tela. Para isso vamos usar um componente
     *     chamado ScrollView. Vamos manipular pelo código (perspectiva code) o activity_main.xml.
     *     Vamos adicionar a tag ScrollView e mais algunmas configurações de xmlns (que no caso estão
     *     na tag constraintLayout) e de altura e comprimento do layout.
     *
     *     Configurações dentro da tag scrollView:
     *
     *     xmlns:android="http://schemas.android.com/apk/res/android"
     *     xmlns:app="http://schemas.android.com/apk/res-auto"
     *     xmlns:tools="http://schemas.android.com/tools"
     *     android:layout_height="match_parent"
     *     android:layout_width="match_parent"
     *     android:fillViewport="true"         -> para ocupar toda a tela quando o layout tem pouco conteúdo.
     *
     * */
}
