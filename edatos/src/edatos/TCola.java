package edatos;

public interface TCola
{
	void	insertar(Object dato);
	Object	eliminar();
	Object	primero();
				   
	int	cantidad();
	boolean vacia();
	Object	obtener(int pos);
	void	modificar(Object dato, int pos);
	int	buscar(Object dato);
	int	buscar(Object dato, TComparar cmp);
}
