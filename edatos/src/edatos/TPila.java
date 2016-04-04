package edatos;

public interface TPila
{
	void	push(Object dato);
	Object	pop();
	Object	top();
	
	int	cantidad();
	boolean vacia();
	Object	obtener(int pos);
	void	modificar(Object dato, int pos);
	int	buscar(Object dato);
	int	buscar(Object dato, TComparar cmp);
}
