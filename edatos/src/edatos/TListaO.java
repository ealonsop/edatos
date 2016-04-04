package edatos;

public interface TListaO
{
	void	insertar(Object dato);
	void	eliminar(int pos);
	int	cantidad();
	boolean vacia();
	Object	obtener(int pos);
	int	buscar(Object dato);
	int	buscar(Object dato,TComparar cmpf);
}
