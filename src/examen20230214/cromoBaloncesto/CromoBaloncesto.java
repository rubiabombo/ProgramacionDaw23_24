package examen20230214.cromoBaloncesto;

public class CromoBaloncesto {
	 private int id;
	    private String nombre;
	    private int puntos;
	    private int rebotes;

	    public CromoBaloncesto(int id, String nombre, int puntos, int rebotes) {
	        this.id = id;
	        this.nombre = nombre;
	        this.setPuntos(puntos);
	        this.setRebotes(rebotes);
	    }

	    public int getId() {
	        return id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getPuntos() {
	        return puntos;
	    }

	    public int getRebotes() {
	        return rebotes;
	    }

		public void setPuntos(int puntos) {
			this.puntos = puntos;
		}

		public void setRebotes(int rebotes) {
			this.rebotes = rebotes;
		}
	}