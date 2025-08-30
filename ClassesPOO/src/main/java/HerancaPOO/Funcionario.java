package HerancaPOO;

import java.util.Date;

public class Funcionario {
	private String nome;
	private String cpf;
	private Date dadaNasc;
	private Double salario;
	
	public Funcionario() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDadaNasc() {
		return dadaNasc;
	}
	public void setDadaNasc(Date dadaNasc) {
		this.dadaNasc = dadaNasc;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
