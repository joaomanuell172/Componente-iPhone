    interface AparelhoTelefonico {

    void ligar(String numero); 
    void atender();
    void iniciarCorreioVoz();
   }
     
    interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
    interface ReprodutorMusical {

    void tocar();
    void pause();
    void selecionarMusica(String musical);
    
}


    public void tocar(){
    System.out.println("tocar o celular");
}
   public void ligar(){
    System.out.println("ligar o celular");
   }
   public void atender(){
    System.out.println("atender o celular");
   }
   public void pause (){
    System.out.println("pausar o celular")
   }
}
