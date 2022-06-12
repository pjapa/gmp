package com.example.gmpindustriais.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "PROJETOS E SERVIÇOS GMP\n" +
                "GMP Gestão, Maquinários e Projetos\n" +
                "\n" +
                "O grande diferencial da GMP INDUSTRIAIS é o capital Intelectual. Um time multidisciplinar de especialistas agrega valor aos projetos e serviços de engenharia mediante a aplicação da inteligência. Com foco na eficiência, valendo-se de um “Know-how” invejável, fornecemos projetos e serviços diferenciados e inovadores.Um gerenciamento moderno e agressivo do capital intelectual, fundamentado na meritocracia, bonificando o profissional que se destaca na GMP INDUSTRIAIS, consolida a vantagem competitiva, sendo os projetos e serviços da GMP os melhores do mercado.\n" +
                "\n" +
                "O QUE A GMP OFERECE!\n" +
                "\n" +
                "\n" +
                "-PROJETOS DE FÁBRICAS DE TINTAS;\n" +
                "-PROJETOS DE FÁBRICAS DE RESINAS;\n" +
                "-PROJETOS DE FÁBRICAS DE QUIMICA EM GERAL;\n" +
                "-PROJETOS DE FÁBRICAS DE DOMISSANITÁRIO;\n" +
                "-PROJETOS DE FÁBRICAS DE COSMÉTICOS;\n" +
                "-PROJETOS DE ENGENHARIA;\n" +
                "-PROJETOS DE EXCELÊNCIA OPERACIONAL;\n" +
                "-PROJETOS DA INDÚSTRIA 4.0;\n" +
                "-PROJETOS DE SISTEMAS HIDRÁULICOS;\n" +
                "-PROJETOS DE SISTEMAS ELÉTRICOS;\n" +
                "-CONTRATO E MANUTENÇÃO DE EQUIPAMENTOS;\n" +
                "-CONSULTORIA QUÍMICA;\n" +
                "-CONSULTORIA EM SEGURANÇA;\n" +
                "-CONSULTORIA EM EXCELÊNCIA OPERACIONAL;\n" +
                "-CONSULTORIA INDUSTRIAL DE GESTÃO;\n" +
                "-CONSULTORIA FINANCEIRA INDUSTRIAL;\n" +
                "-TREINAMENTOS TÉCNICOS."

    }
    val text: LiveData<String> = _text
}