public final class Agenda {
    private static Agenda uniqueInstance;
    private ArrayList<Horario> datasDeAtendimento;
	private int id;

	// o construtor deve ser privado para garantir que apenas o metodo getInstance
	// consiga instanciar nova classe caso não exista
    private Agenda() {
      
    }

	// O metodo getInstace verifica se o atributo "uniqueInstance" já esta instanciado
	// Caso não esteja ele instancia e em seguinda retorna a instancia.
    public static Agenda getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Agenda();
        }
        return uniqueInstance;
    }
}