package edatos;

public class TArbolA implements TArbol
{
	private class TNodoArbol {
		Object info;
		TLista hijos;
	}
	
	private TNodoArbol raiz;
	
	public TArbolA()
	{
		crearVacio();
	}
	
	public void	crearHoja()
	{
		raiz = new TNodoArbol();
		raiz.info = null;
		raiz.hijos = new TListaA();
	}
	
	public void crearVacio()
	{
		raiz = null;
	}
	
	public boolean	vacio()
	{
		return raiz == null;
	}

        public boolean hoja()
        {
            return !vacio() && cantidadHijos() == 0;
        }

	public Object  obtenerDato()
	{
		return raiz.info;
	}
	
	public void	modificarDato( Object dato )
	{
		raiz.info = dato;
	}

    public void modificarRaiz( TArbol A )
    {
        raiz = ((TArbolA)A).raiz;
    }

	public void	adicionarHijo( TArbol hijo )
	{
		raiz.hijos.adicionar(hijo);
	}
	
	public void	eliminarHijo( int pos )
	{
		raiz.hijos.eliminar(pos);
	}
	
	public int	    cantidadHijos()
	{
		return raiz.hijos.cantidad();
	}
	
	public TArbol 	obtenerHijo( int pos )
	{
		return (TArbol)raiz.hijos.obtener(pos);
	}
	
	public void	modificarHijo( TArbol hijo, int pos )
	{
		raiz.hijos.modificar(hijo,pos);
	}
        
        public int  cantidad()
        {
            if ( vacio() )
                return 0;
            if ( hoja() )
                return 1;
            int S, i;
            S = 1;//contar la raiz
            for ( i = 0; i < cantidadHijos(); i++ ) {
                TArbol hijo;
                hijo = obtenerHijo(i);
                S = S + hijo.cantidad();
            }
            return S;
        }

        public int  altura()
        {
            if ( vacio() )
                return 0;
            if ( hoja() )
                return 0;
            int m, a, i;
            m = 0;
            for ( i = 0; i < cantidadHijos(); i++ ) {
                TArbol hijo;
                hijo = obtenerHijo(i);
                a = hijo.altura();
                if ( a > m )
                    m = a;
            }
            return 1+m;
        }
        
        public TArbol  buscar(Object dato)
        {
            if ( vacio() )
                return null;
            if ( hoja() ) 
                if ( dato.equals(obtenerDato() ))
                    return this;
                else
                    return null;
            
            if ( dato.equals(obtenerDato() ))
               return this;

            int i;
            for ( i = 0; i < cantidadHijos(); i++ ) {
                TArbol hijo;
                hijo = obtenerHijo(i);
                TArbol Res = hijo.buscar(dato);
                if ( Res != null )
                    return Res;
            }
            return null;
        }

        
}
