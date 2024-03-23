package Ex6_7_8;
public class App {
    public static void main(String[] args) {
        Pessoa vinicius = new Pessoa("Vinícius", 41);
        Pessoa daniela = new Pessoa("Daniela", 44);
        Pessoa ana = new Pessoa("Ana", 18);
        Pessoa carla = new Pessoa("Carla", 20);
        Pessoa daniel = new Pessoa("Daniel Paiva", 31);
        Pessoa felipe = new Pessoa("Felipe", 24);
        Pessoa patricia = new Pessoa("Patricia", 23);
        Pessoa rafael = new Pessoa("Rafael", 20);
        Pessoa pedro = new Pessoa("Pedro", 22);
        Pessoa marcela = new Pessoa("Marcela", 24);
        Pessoa amanda = new Pessoa("Amanda", 100);
        Pessoa[] listaPessoas = { vinicius, daniela, ana, carla, daniel, felipe, pedro, patricia, rafael, marcela,
                amanda };
        buscaIdadePessoaIgualA100(listaPessoas);
        buscaIdadePessoaAcimaDe30(listaPessoas);
        alteraIdadePessoas(listaPessoas);
    }

    public static void buscaIdadePessoaIgualA100(Pessoa[] lista) {
        for (Pessoa pessoa : lista) {
            if (pessoa.getIdade() == 100) {

                System.out.println(pessoa.getNome());

            }

        }

    }

    public static void buscaIdadePessoaAcimaDe30(Pessoa[] lista) {
        for (Pessoa pessoa : lista) {
            if (pessoa.getIdade() > 30) {

                System.out.println(pessoa.getNome());

            }

        }

    }
    public static void alteraIdadePessoas(Pessoa[] lista) {
        for (Pessoa pessoa : lista) {
            pessoa.setIdade(18);
            System.out.println(pessoa.toString());

        }

    }
}
