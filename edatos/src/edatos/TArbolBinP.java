package edatos;

public class TArbolBinP implements TArbolBin
{
	private class TNodoABin {
		Object info;
                TArbolBin izq, der;
	}
	
	private TNodoABin raiz;
	
	public TArbolBinP()
	{
		crearVacio();
	}
	
	public void crearVacio()
	{
		raiz = null;
	}
	
	public void crearHoja()
	{
		raiz = new TNodoABin();
		raiz.info = null;
		raiz.izq = new TArbolBinP();
		raiz.der = new TArbolBinP();
	}
	
	public boolean	vacio()
	{
		return raiz == null;
	}

        public boolean hoja()
        {
            return !vacio() && obtenerIzq().vacio() && obtenerDer().vacio();
        }

	public void modificarRaiz( TArbolBin A )
	{
		raiz = ((TArbolBinP)A).raiz;
	}
	
	public Object  obtenerDato()
	{
		return raiz.info;
	}
	
	public void	modificarDato( Object dato )
	{
		raiz.info = dato;
	}
	
	public TArbolBin obtenerIzq()
	{
		return raiz.izq;
	}

	public TArbolBin obtenerDer()
	{
		return raiz.der;
	}
	
	public void modificarIzq( TArbolBin a )
	{
		raiz.izq = a;
	}
	
	public void modificarDer( TArbolBin a )
	{
		raiz.der = a;
	}
	
	public int cantidad()
	{
		if ( vacio() )
			return 0;
                if ( hoja() )
                        return 1;
		int ci, cd;
		ci = raiz.izq.cantidad();
		cd = raiz.der.cantidad();
		return 1 + ci + cd;
	}
	
	public int altura()
	{
		if ( vacio() || hoja() )
			return 0;
		int ai, ad;
		ai = raiz.izq.altura();
		ad = raiz.der.altura();
		// retorna la mayor altura
		return 1+ (ai > ad ? ai : ad);
	}
	
	public TArbolBin buscar( Object dato )
	{
		if ( vacio() )
			return null;
		else
			if ( raiz.info.equals( dato ) )  // encontrado
				return this;
			else
			{
				TArbolBin r;
				// buscar por la izquierda
				r = raiz.izq.buscar(dato);
				if ( r == null ) // no encontrado ?
	 			    // buscar por la derecha
					r = raiz.der.buscar(dato);
				return r;
			}

	}

	public TArbolBin buscar( Object dato, TComparar cmp )
	{
		if ( vacio() )
			return null;
		else
			if ( cmp.compara( raiz.info, dato ) == 0 )  // encontrado
				return this;
			else
			{
				TArbolBin r;
				// buscar por la izquierda
				r = raiz.izq.buscar(dato,cmp);
				if ( r == null ) // no encontrado ?
	 			    // buscar por la derecha
					r = raiz.der.buscar(dato,cmp);
				return r;
			}

	}

}
