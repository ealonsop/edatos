package edatos;

public interface TGrafo
{
	public int adicionarVertice(Object info);
	public int cantidadVertices();
        
	public Object obtenerVertice(int v);
	public void modificarVertice(int v, Object info);
        
	public int adicionarArco(int vsal, int vlleg, Object info);
	public int cantidadArcos(int v);
        
        public Object obtenerArco(int vsal, int apos );
	public void modificarArco(int vsal, int apos, Object info );
	public void eliminarArco(int vsal, int apos );
        
	public int obtenerVerticeLlegada(int vsal, int apos);
	public void modificarVerticeLlegada(int vsal, int apos, int vlleg);
        
        public TLista obtenerVertices();
        public TLista obtenerArcos(int vsal);
}
