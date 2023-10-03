package com.house;

public class Quarto {

    String nome;
   public Quarto(String nome){
     this.nome = nome;
   }

public Quarto(String nomeAs, boolean ativo, String comodo) {
}

public Quarto(String nomeGe, boolean emFuncionamento, boolean desgelo, int temperatura) {
}

public Quarto(String nomeFe, boolean tranca, String senha, boolean biometria, boolean chave) {
}

public Quarto(String nomeLa, boolean acesa, String cor, int intensidade) {
}

public Quarto(String nomeAr, boolean ligado, int temperatura, String refrigeracaoForma, int horarioFuncionamento) {
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

}
