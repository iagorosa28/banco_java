
package controller;

import view.MenuGerente;
import view.CadastrarCliente;
import view.ExcluirCliente;
import view.CriarConta;
import view.ExibirContas;
import view.ExibirSaldo;

public class ControllerPaginasMenuGerente {
    
    private MenuGerente view;

    public ControllerPaginasMenuGerente(MenuGerente view) {
        this.view = view;
    }
    
    // Função para entrar na página de cadastro.
    public void entrarCadastrarCliente(){
        CadastrarCliente viewCadastrarCliente = new CadastrarCliente();
        viewCadastrarCliente.setVisible(true);
    }
    
    // Função para entrar na página de exclusão.
    public void entrarExcluirCliente(){
        ExcluirCliente viewExcluirCliente = new ExcluirCliente();
        viewExcluirCliente.setVisible(true);
    }
    
    // Função para entrar na página de criação de conta.
    public void entrarCriarConta(){
        CriarConta viewCriarConta = new CriarConta();
        viewCriarConta.setVisible(true);
    }
    
    // Função para entrar na página de exibição de contas.
    public void entrarExibirContas(){
        ExibirContas viewExibirContas = new ExibirContas();
        viewExibirContas.setVisible(true);
    }
    
    // Função para entrar na página de exibição de saldo de um cliente.
    public void entrarExibirSaldo(){
        ExibirSaldo viewExibirSaldo = new ExibirSaldo();
        viewExibirSaldo.setVisible(true);
    }
    
}
