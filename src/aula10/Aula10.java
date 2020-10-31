package aula10;

public class Aula10 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Wallace Oliveira", 41, "M");
		
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getSexo());
		p1.fazerAniversario();
		
		Aluno p2 = new Aluno("Emily Batty", 25, "F", 001, "Educação Fisíca");

		System.out.println(p2.getNome());
		System.out.println(p2.getIdade());
		System.out.println(p2.getSexo());
		System.out.println(p2.getMatricula());
		System.out.println(p2.getCurso());
		p2.fazerAniversario();
		p2.cancelarMatricula();
		
		Professor p3 = new Professor("Emily Batty", 25, "F", "Educação Fisíca", 1500.50);

		System.out.println(p3.getNome());
		System.out.println(p3.getIdade());
		System.out.println(p3.getSexo());
		System.out.println(p3.getEspecialidade());
		System.out.println(p3.getSalario());
		p3.fazerAniversario();
		p3.receberAumento(500);
		
		Funcionario p4 = new Funcionario("Jolanda Neff", 28, "F", "Recursos Humanos", true);

		System.out.println(p4.getNome());
		System.out.println(p4.getIdade());
		System.out.println(p4.getSexo());
		System.out.println(p4.getSetor());
		System.out.println(p4.isTrabalhando());
		p4.fazerAniversario();
		p4.mudarTrabalho("Compras");

	}

}
