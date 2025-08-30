package HerancaPOO;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Vendedor ven = new Vendedor();
		Motorista moto = new Motorista();
		
		ven.setNome("Cleber");
		ven.setSalario(1600.00d);
		ven.setCpf("12345678900");
		ven.setDadaNasc(new Date());
		ven.setTotalItensVendidos(210);
		
		System.out.println("O salario do vendedor esse mes é:" + ven.calcularSalario());
		
		moto.setNome("Kleber");
		moto.setSalario(1900.00d);
		moto.setCpf("12345678911");
		moto.setDadaNasc(new Date());
		
		System.out.println("O salario do motorista é: " + moto.getSalario());

	}

}
