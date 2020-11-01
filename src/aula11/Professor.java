package aula11;

/**
 * Herança para diferença. Tem tudo que Pessoa tem e possui uma especialização.
 */
public class Professor extends Pessoa {
	
	// Atributos
		private String especialidade;
		private double salario;
		
		// Métodos acessores e mutantes
		public String getEspecialidade() {

			return especialidade;
		
		}
		
		public void setEspecialidade(String especialidade) {
		
			this.especialidade = especialidade;
		
		}
		
		public double getSalario() {
		
			return salario;
		
		}
		
		public void setSalario(double salario) {
		
			this.salario = salario;
		
		}
		
		// Método construtor
		public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
			
			this.setNome(nome);
			this.setIdade(idade);
			this.setSexo(sexo);
			this.especialidade = especialidade;
			this.salario = salario;
		
		}
		
		// Outros métodos
		public void receberAumento(double aumento) {
			
			this.setSalario(this.getSalario() + aumento);
			
			System.out.println("O salário foi reajustado para R$ " + this.getSalario() + ".");
			
		}

		@Override
		public String toString() {
			return "Professor [nome=" + getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() + ", especialidade=" + especialidade + ", salario=" + salario + "]";
		}

}
