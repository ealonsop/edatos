package edatos;

public class TArbolBBP extends TArbolBinP implements TArbolBB
{
	private TComparar cmpFun;
	
	public TArbolBBP( TComparar cmp )
	{
		super();
		cmpFun = cmp;
	}
	
	public void crearHoja()
	{
	   super.crearHoja();
	   modificarIzq( new TArbolBBP(cmpFun) );
	   modificarDer( new TArbolBBP(cmpFun) );
	}
	
	public TComparar obtenerComparar()
	{
		return cmpFun;
	}

	public void modificarComparar( TComparar cmp )
	{
		cmpFun = cmp;
	}
	
	public void adicionar( Object dato )
	{
		if ( vacio() )
		{
			crearHoja();
			modificarDato(dato);
		}
		else
		{
			int r = cmpFun.compara( obtenerDato(), dato );
			if ( r == 0 ) // ya esta
			    return;
			else
			if ( r < 0 ) // por la derecha
				((TArbolBB)obtenerDer()).adicionar(dato);
			else // por la izq
				((TArbolBB)obtenerIzq()).adicionar(dato);
		}
	}
	public TArbolBin buscar( Object dato )
	{
		if ( vacio() )
			return null;
		else
		{
			int r = cmpFun.compara( obtenerDato(), dato );
			if ( r == 0 ) // ya esta
				return this; 
			else
			if ( r < 0 ) // por la derecha
				return obtenerDer().buscar(dato);
			else // por la izq
				return obtenerIzq().buscar(dato);
		}
	}
	
	public void eliminar( Object dato )
	{
		if ( vacio() )
			return;
                int r = cmpFun.compara( obtenerDato(), dato );
                if ( r < 0 ) // por la derecha
                    ((TArbolBB)obtenerDer()).eliminar(dato);
                else
                    if ( r > 0 ) // por la izq
                        ((TArbolBB)obtenerIzq()).eliminar(dato);
                    else {
                        if ( obtenerIzq().vacio() && obtenerDer().vacio() ) // Hoja()? caso 1
                            crearVacio();
                        else
                            if ( obtenerIzq().vacio() ) // caso 2
                                    modificarRaiz( obtenerDer() );
                            else
                                if ( obtenerDer().vacio() ) // caso 3
                                    modificarRaiz( obtenerIzq() );
                                else // caso 4
                                {
                                    TArbolBin aux;
                                    aux = obtenerDer();
                                    while ( ! aux.obtenerIzq().vacio() )
                                        aux = aux.obtenerIzq();
                                    modificarDato( aux.obtenerDato() );
                                    ((TArbolBB)aux).eliminar( aux.obtenerDato() );
                                }
                    }
        }
}
