package edatos;

public interface TLista
{
	void	adicionar(Object dato);
	void	insertar(Object dato, int pos);
	void	eliminar(int pos);
        void    intercambiar( int p1, int p2 );
	
	int	cantidad();
	boolean vacia();
	Object	obtener(int pos);
	void	modificar(Object dato, int pos);
	int	buscar(Object dato);
	int	buscar(Object dato, TComparar cmp);
}
