package HerancaPOO;

public class Vendedor extends Funcionario{ // Herança aplicada (extends)
	private String nomeLoja;
	private Integer totalItensVendidos;

	public Vendedor() {
		super();
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}


	public Integer getTotalItensVendidos() {
		return totalItensVendidos;
	}

	public void setTotalItensVendidos(Integer totalItensVendidos) {
		this.totalItensVendidos = totalItensVendidos;
	}

	public Double calcularSalario() {
		return super.getSalario() + (this.totalItensVendidos * 1.2);
	}

}
