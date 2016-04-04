/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edatos;

/**
 *
 * @author ealonso
 */
public class TColaPriorA implements TColaPrior
{
	private TListaOA C;

	public TColaPriorA(TComparar cmp, boolean asc)
	{
		C = new TListaOA(cmp,asc);
	}

	public void insertar(Object dato)
	{
		C.insertar(dato);
	}

	public Object eliminar()
	{
		int pos =C.cantidad()-1;
		Object aux = C.obtener(pos);
		C.eliminar(pos);
		return aux;
	}

	public Object primero()
	{
		int pos =C.cantidad()-1;
		Object aux = C.obtener(pos);
		return aux;
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

	public int buscar(Object dato)
	{
		return C.buscar(dato);
	}

	public int buscar(Object dato, TComparar cmp)
	{
		return C.buscar(dato,cmp);
	}
}
