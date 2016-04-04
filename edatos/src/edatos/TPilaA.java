package edatos;

public class TPilaA implements TPila
{
	private TLista P;

	public TPilaA()
	{
		P = new TListaA();
	}
	
	public void	push(Object dato)
	{
		P.adicionar(dato);
	}
	
	public Object	top()
	{
		int pos = P.cantidad()-1;
		return P.obtener(pos);
	}
	
	public Object	pop()
	{
		int pos = P.cantidad()-1;
		Object aux = P.obtener(pos);
		P.eliminar(pos);
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
