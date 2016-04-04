package edatos;

public class TColaP implements TCola
{
	private TListaP C;
	
	public TColaP()
	{
	  C = new TListaP();
	}
	
	public void insertar(Object dato)
	{
		C.adicionar(dato); //al final
	}
	
	public Object eliminar()
	{
		Object aux = primero();
		C.eliminar(0);
		return aux;
	}
	
	public Object primero()
	{
		return C.obtener(0);
	}
				   
	public int cantidad()
	{
		return C.cantidad();
	}
	
	public boolean vacia()
	{
		return C.vacia();
	}
	
	public Object obtener(int pos)
	{
		return C.obtener(pos);
	}
	
	public void modificar(Object dato, int pos)
	{
		C.modificar(dato,pos);
	}
	
	public int buscar(Object dato)
	{
		return C.buscar(dato);
	}
	
	public int buscar(Object dato, TComparar cmp)
	{
		return C.buscar(dato,cmp);
	}
}
