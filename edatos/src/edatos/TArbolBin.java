package edatos;

public interface TArbolBin
{
	public void     crearVacio();
	public void     crearHoja();
	public boolean	vacio();
        public boolean  hoja();
	public void     modificarRaiz( TArbolBin A );
	public Object   obtenerDato();
	public void	modificarDato( Object dato );
	public TArbolBin obtenerIzq();
	public TArbolBin obtenerDer();
	public void     modificarIzq( TArbolBin a );
	public void     modificarDer( TArbolBin a );
	public int      cantidad();
	public int      altura();
	public TArbolBin buscar( Object dato );
	public TArbolBin buscar( Object dato, TComparar cmp );
}
