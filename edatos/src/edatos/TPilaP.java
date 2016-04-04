package edatos;

public class TPilaP implements TPila
{
	private TLista P;

	public TPilaP()
	{
		P = new TListaP();
	}
	
	public void	push(Object dato)
	{
		P.insertar(dato,0);
	}
	
	public Object	top()
	{
		return P.obtener(0);
	}
	
	public Object	pop()
	{
		Object aux = top();
		P.eliminar(0);
		return aux;
	}
	
	public int cantidad()
	{
		return P.cantidad();
	}
	
	public boolean vacia()
	{
		return P.vacia();
	}
	
	public Object obtener(int pos)
	{
		return P.obtener(pos);
	}
	
	public void modificar(Object dato, int pos)
	{
		P.modificar(dato,pos);
	}
	
	public int buscar(Object dato)
	{
		return P.buscar(dato);
	}
	
	public int buscar(Object dato, TComparar cmp)
	{
		return P.buscar(dato,cmp);
	}
}
