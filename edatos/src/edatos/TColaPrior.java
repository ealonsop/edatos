package edatos;

public interface TColaPrior
{
	void	insertar(Object dato);
	Object	eliminar();
	Object	primero();
				   
	int	cantidad();
	boolean vacia();
	Object	obtener(int pos);
	int	buscar(Object dato);
	int	buscar(Object dato, TComparar cmp);
}
