package edatos;

public interface TArbolBB extends TArbolBin
{
        public TComparar obtenerComparar();
	public void modificarComparar( TComparar cmp );
	public void adicionar( Object dato );
	public TArbolBin buscar( Object dato );
	public void eliminar( Object dato );
}
