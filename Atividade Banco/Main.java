/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby,
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");

		UsuarioContaBancaria user = new UsuarioContaBancaria("Felipe",
		        "555.566.661/10");
		UsuarioContaBancaria user2 = new UsuarioContaBancaria("JacarC)",
		        "111.333.777/10");

		ContaModelo cm = new ContaModelo(10,500,user);
		ContaModelo cm2 = new ContaModelo(300,1000,user2);


		ContaVisao cv = new ContaVisao();

		ContaControle cc = new ContaControle(cm,cv,cm2);

		cc.processarCodigo();


	}
}

