package edatos;

public class TListaA implements TLista
{
	private Object elem[];
	private int cantidad;
	private int max;
	
	public TListaA()
	{
		cantidad=0;
		max=0;
		elem=null;
	}
	
	private void crecer()
	{
		Object aux[];
		max += 50; // sug. que sea un porcentaje
		aux = new Object[max];
		for (int i = 0; i < cantidad; i++ )
			aux[i] = elem[i];
		elem = aux;
	}
	
	public void adicionar(Object dato)
	{
		if ( cantidad == max )
			crecer();
		cantidad++;
		elem[cantidad-1] = dato;
	}

	public void insertar(Object dato, int pos)
	{
		if ( pos >= 0 && pos <= cantidad ) {
			if ( cantidad == max )
			   crecer();
			cantidad++;
			for (int i = cantidad-1; i > pos; i--)
		       elem[i] = elem[i-1];
			elem[pos] = dato;
		}
	}

	public void eliminar(int pos)
	{
		if ( pos >= 0 && pos < cantidad ) {
			for (int i = pos; i < cantidad-1; i++ )
				elem[i] = elem[i+1];
			cantidad--;
		}
	}
	
	public int cantidad()
	{
		return cantidad;
	}
	
	public boolean vacia()
	{
		return cantidad == 0;
	}
	
	public Object obtener(int pos)
	{
		if ( pos < 0 || pos >= cantidad )
			pos = 0;
		return elem[pos];
	}

	public void modificar(Object dato, int pos)
	{
		if ( pos < 0 || pos >= cantidad )
			pos = 0;
		elem[pos] = dato;
	}
	
	public int buscar(Object dato)
	{
		int encontrado = -1;
		for ( int i=0; i < cantidad && encontrado == -1; i++ )
			if ( elem[i].equals( dato ) )
              encontrado = i;
		return encontrado;
	}
	
	public int buscar(Object dato, TComparar cmp)
	{
		int encontrado = -1;
		for ( int i=0; i < cantidad && encontrado == -1; i++ )
			if ( cmp.compara(elem[i],dato) == 0 )
              encontrado = i;
		return encontrado;
	}
        
        public void intercambiar(int p1, int p2)
        {
          if ( p1 >= 0 && p1 < cantidad &&
               p2 >= 0 && p2 < cantidad )
          {
              Object tmp;
              tmp = elem[p1];
              elem[p1] = elem[p2];
              elem[p2] = tmp;
          }
            
        }
	
}
