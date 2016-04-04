package edatos;

public class TListaOA implements TListaO
{
	private TListaA L;
	private TComparar cmp;
	private boolean asc;
	
	public TListaOA(TComparar c, boolean ascendent)
	{
	  L = new TListaA();
	  cmp = c;
	  asc = ascendent;
	}
	
	private int BusquedaBinaria(Object dato)
	{
	  int i, j, m, r;
          i = 0;
          j = L.cantidad()-1;
	  if ( j < 0 ) return j;
	  
          do {
         m = (i+j)/2;
         r = cmp.compara( L.obtener(m), dato );
         if ( r == 0 )
             return m;
		 if ( asc )
			if ( r < 0 )
				i = m+1;
			else	
				j = m-1;
		 else
			if ( r > 0 )
				i = m+1;
			else	
		  	   j = m-1;
				
       } 
       while ( i <= j );
       return -(i+1);
	}

	public void insertar(Object dato)
	{
	  int p;
      p = BusquedaBinaria(dato);
      if ( p < 0 )
          p = -(p+1);
      L.insertar(dato,p);
	}
	
	public void eliminar(int pos)
	{
		L.eliminar(pos);
	}
	
	   
	public int cantidad()
	{
		return L.cantidad();
	}
	
	public boolean vacia()
	{
		return L.vacia();
	}
	
	public Object obtener(int pos)
	{
		return L.obtener(pos);
	}
	
	public int buscar(Object dato)
	{
	   int p;
	   p = BusquedaBinaria(dato);
       if ( p >= 0 ) return p;
       else return -1;
	}
	
	public int buscar(Object dato, TComparar cmpf)
	{
		return L.buscar(dato,cmpf);
	}
}
