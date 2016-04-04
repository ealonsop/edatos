package edatos;

public class TGrafoLA implements TGrafo
{
	public class TVertice {
		public Object info;
		public TLista ady;
		
		public TVertice()
		{
			info = null;
			ady = new TListaP();
		}
                
                public String toString()
                {
                    return info.toString();
                }
	}
	
	public class TArco {
		public Object info;
		public int v;
		
		public TArco(int vlleg) 
		{
			info = null;
			v = vlleg;
		}
                public String toString()
                {
                    return info.toString();
                }
	}
	
	private TLista vertices;
	
	public TGrafoLA()
	{
		vertices = new TListaA();
	}
	
	public int adicionarVertice(Object info)
	{
		TVertice vert = new TVertice();
		vert.info = info;
		vertices.adicionar(vert);
		return vertices.cantidad()-1;
	}

	public int cantidadVertices()
	{
		return vertices.cantidad();
	}

	public Object obtenerVertice(int v)
	{
		if ( v < 0 || v >= vertices.cantidad() )
			return null;
		return ((TVertice)vertices.obtener(v)).info;
	}
	
	public void modificarVertice(int v, Object info)
	{
		if ( v < 0 || v >= vertices.cantidad() )
			return;
		((TVertice)vertices.obtener(v)).info = info;
	}
	
	public int adicionarArco(int vsal, int vlleg, Object info)
	{
		if ( vsal < 0 || vsal >= vertices.cantidad() ||
			 vlleg < 0 || vlleg >= vertices.cantidad() )
			return -1;
		TVertice vert;
		vert = (TVertice)vertices.obtener(vsal);

		TArco arco;
		arco = new TArco(vlleg);
		arco.info=info;
		vert.ady.adicionar(arco);
		return vert.ady.cantidad()-1;
	}

	public int cantidadArcos(int v)
	{
		if ( v < 0 || v >= vertices.cantidad() )
			return 0;
		return ((TVertice)vertices.obtener(v)).ady.cantidad();
	}
	
	public Object obtenerArco(int vsal, int apos )
	{
		if ( vsal < 0 || vsal >= vertices.cantidad() )
		   return null;
		TVertice vert;
		vert = (TVertice)vertices.obtener(vsal);

		if ( apos < 0 || apos >= vert.ady.cantidad() )
			return null;
		
		TArco arco;
		arco = (TArco)vert.ady.obtener(apos);
		return arco.info;
	}

	public void eliminarArco(int vsal, int apos )
	{
		if ( vsal < 0 || vsal >= vertices.cantidad() )
		   return;
		TVertice vert;
		vert = (TVertice)vertices.obtener(vsal);

		if ( apos < 0 || apos >= vert.ady.cantidad() )
			return;
                vert.ady.eliminar(apos);
	}
        
	public void modificarArco(int vsal, int apos, Object info )
	{
		if ( vsal < 0 || vsal >= vertices.cantidad() )
		   return;
		TVertice vert;
		vert = (TVertice)vertices.obtener(vsal);

		if ( apos < 0 || apos >= vert.ady.cantidad() )
			return;
		
		TArco arco;
		arco = (TArco)vert.ady.obtener(apos);
		arco.info = info;
	}
	
	public int obtenerVerticeLlegada(int vsal, int apos)
	{
		if ( vsal < 0 || vsal >= vertices.cantidad() )
		   return -1;
		TVertice vert;
		vert = (TVertice)vertices.obtener(vsal);

		if ( apos < 0 || apos >= vert.ady.cantidad() )
			return -1;
		
		TArco arco;
		arco = (TArco)vert.ady.obtener(apos);
		return arco.v;
	}

	public void modificarVerticeLlegada(int vsal, int apos, int vlleg)
	{
		if ( vsal < 0 || vsal >= vertices.cantidad() )
		   return;
		TVertice vert;
		vert = (TVertice)vertices.obtener(vsal);

		if ( apos < 0 || apos >= vert.ady.cantidad() )
			return;
		
		TArco arco;
		arco = (TArco)vert.ady.obtener(apos);
                arco.v = vlleg;
	}
        
        public TLista obtenerVertices()
        {
            return vertices;
        }

        public TLista obtenerArcos(int vsal)
        {
            if ( vsal < 0 || vsal >= vertices.cantidad() )
		   return null;
            TVertice vert;
            vert = (TVertice)vertices.obtener(vsal);
            return vert.ady;
        }
        
}
