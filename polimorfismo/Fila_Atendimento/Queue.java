package polimorfismo.Fila_Atendimento;

public abstract class Queue {

	abstract boolean enqueue(Client client);
	
	abstract Client dequeue();
	
	abstract boolean isFull();
	
	abstract boolean isEmpty();
	
}