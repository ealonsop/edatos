package edatos;

public class TListaP implements TLista
{
	private class TNodoSEP {
		Object elem;
		TNodoSEP prox;
	}
	
	private TNodoSEP L;
        private int cantidad;
	
	public TListaP()
	{
		L=null;
                cantidad = 0;
	}
	
	public int cantidad()
	{
        	return (cantidad);
	}
	
	public void adicionar(Object dato)
	{
		TNodoSEP nuevo, aux;

		nuevo = new TNodoSEP();
		nuevo.elem = dato;
		nuevo.prox = null;

		if ( L != null ) {
			aux = L;
			while( aux.prox != null )
			aux = aux.prox;
			aux.prox = nuevo;
		}
		else
			L = nuevo;
                cantidad++;
	}
	
	public void insertar(Object dato, int pos)
	{
		TNodoSEP nuevo, aux;
		int i;

		nuevo = new TNodoSEP();
		nuevo.elem = dato;

		if( pos <= 0 ) {
			nuevo.prox = L;
			L = nuevo;
                        cantidad++;
		}
		else {
			aux = L;
			for( i=0; i < pos-1 && aux != null; i++)
				aux=aux.prox;
			if ( aux != null ) {
				nuevo.prox = aux.prox;
				aux.prox = nuevo;
                                cantidad++;
			}
			else
				;//delete nuevo;
		}
	}
	
	public void eliminar(int pos)
	{
		TNodoSEP elim;
		TNodoSEP aux;
		int i;

		if( L != null ) {
			if ( pos <= 0 ) {
				elim = L;
				L = L.prox;
                                cantidad--;
				//delete elim;
			}
			else {
				aux = L;
				for(i=0; i < pos-1 && aux != null; i++)
					aux = aux.prox;
				if ( aux != null && aux.prox != null ) {
					elim = aux.prox;
					aux.prox = elim.prox;
                                        cantidad--;
					//delete elim;
				}
			}
		}
	}
		

	public boolean vacia()
	{
		return L == null;
	}
	
	public Object obtener(int pos)
	{
		TNodoSEP aux;
		int i;

		aux = L;
		for( i=0; i < pos && aux != null; i++ )
			aux = aux.prox;

		if ( aux != null )
			return aux.elem;
		else
			return null;
	}
	
	
	public void modificar(Object dato, int pos)
	{
		TNodoSEP aux;
		int i;

		aux = L;
		for( i=0; i < pos && aux != null; i++ )
			aux = aux.prox;

		if ( aux != null )
			aux.elem = dato;
	}
	
	public int buscar(Object dato)
	{
		TNodoSEP aux;
		int encontrado = -1;

		aux = L;
		for( int i=0; aux != null && encontrado == -1 ; i++ )
      	{
			if ( aux.elem.equals( dato )  )
				encontrado = i;
			else
				aux = aux.prox;
      	}
     	return encontrado;
	}
	
	public int buscar(Object dato, TComparar cmp)
	{
		TNodoSEP aux;
		int encontrado = -1;

		aux = L;
		for( int i=0; aux != null && encontrado == -1 ; i++ )
      	{
			if ( cmp.compara(aux.elem, dato ) == 0  )
				encontrado = i;
			else
				aux = aux.prox;
      	}
     	return encontrado;
	}
        
        public void intercambiar(int p1, int p2)
        {
            
        }
        
        
}
