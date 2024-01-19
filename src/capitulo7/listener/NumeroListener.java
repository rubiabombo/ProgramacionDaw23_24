package capitulo7.listener;

public interface NumeroListener {
	
public void resultadoSuma(NumeroEvent n);
	
	public void resultadoResta(NumeroEvent n);
	
	public void divisionImposible(NumeroEvent n);
	
	public void raizImposible(NumeroEvent n);

}
