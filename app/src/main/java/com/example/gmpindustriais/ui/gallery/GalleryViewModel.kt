package com.example.gmpindustriais.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Automação Industrial de Sólidos e Líquidos GMP\n" +
                "GMP Gestão, Maquinários e Projetos\n" +
                "\n" +
                "A GMP INDUSTRIAIS possuí as soluções mais atuais, modernas e precisas nos processos de dosagem automática de Sólidos, Líquidos Pastosos e Líquidos. Trabalhamos com transporte pneumático de pó, dosagem de alta precisão de pó atendendo as necessidades do cliente. Trabalhamos com dosagens de alta precisão de líquidos pastosos (alta viscosidade) e líquidos(média e baixa viscosidade) atendendo a exigência dos mais diversos processos industriais, desde os mais simples aos mais complexos.\n" +
                "\n" +
                "COMO FUNCIONA NA GMP?\n" +
                "GMP Gestão, Maquinários e Projetos\n" +
                "\n" +
                "O projeto de automação do sistema de transporte e dosagem de sólidos inicia-se com o estudo dos materiais que serão utilizados, avaliando as propriedades físicas (aparência, geometria, granulometria, abrasividade, densidade aparente, densidade real, variação da humidade de acordo a temperatura) e os dados de processos (consumos por batelada, consumos mensal, tipo de estocagem, mão de obra empregada no recebimento e na manipulação dentre outros).É importante salientar a forma de recebimento da matéria prima, podendo ser via sacaria, “big bag” ou a granel. De uma forma simplificada, o transporte de pó consiste em “pressurizar e soprar, empurrando, arrastando, transportando o mesmo, com o auxilio de ar seco, até o ponto definido, podendo ser transferido já pesado/fracionado ou ser fracionado de forma automática”.\n"
                "\n" +
                "Automação Industrial de Sólidos GMP!\n" +
                        "A automação Industrial dos sólidos inicia-se com estudos dos materiais a serem automatizados desde sua aparência, geometria, abrasividade, densidade aparente, densidade real, variação da humidade de acordo a temperatura, consumos por batelada, consumos mensal, estocagem, mão de obra empregada desde do recebimento até os equipamentos de mistura, manipulações dentre outros. Analisamos a forma da compra, recebimento da matéria prima, podendo ser via sacaria, “big bag” ou a granel. O sistema consiste de forma simplificada “Ele é pressurizado e soprado, empurrado, arrastado, transportado com o auxilio de ar seco, até o ponto definido, podendo ser transferido já pesado/fracionado ou podendo ser fracionado de forma automática.\n" +
                        "\n" +
                        "Padronização e reprodutibilidade das bateladas de produto;\n" +
                        "Redução drástica dos custos operacionais (de 30% à 80%);\n" +
                        "Significativa redução do espaço de armazenamento no chão de fabrica;\n" +
                        "Segurança e Ergonomia do Trabalhador,"
    }
    val text: LiveData<String> = _text
}