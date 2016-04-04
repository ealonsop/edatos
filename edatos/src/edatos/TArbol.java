package edatos;

public interface TArbol
{
	void	crearVacio();
	void	crearHoja();
	boolean	vacio();
        boolean hoja();
	Object  obtenerDato();
        void    modificarRaiz( TArbol A );
	void	modificarDato( Object dato );
	void	adicionarHijo( TArbol hijo );
	void	eliminarHijo( int pos );
	int	cantidadHijos();
	TArbol 	obtenerHijo( int pos );
	void	modificarHijo( TArbol hijo, int pos );
        int     cantidad();
        int     altura();
        TArbol  buscar(Object dato);
}
