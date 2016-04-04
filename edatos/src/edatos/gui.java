/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edatos;

/**
 *
 * @author ealonso
 */

import javax.swing.*;

public class gui {
  // private attributes

  // constructor
  public gui()
  {
  }

  public static int menu( String menu )
  {
     return readInt(menu,"Menu");
  }

  public static int readInt( String msg ) {
      return readInt(msg,"Integer");
  }
  
  public static int readInt( String msg, String titulo )
  {
      String aux;
      aux = JOptionPane.showInputDialog(null,msg,titulo,JOptionPane.QUESTION_MESSAGE);
      if (aux == null || aux.isEmpty())
         aux = "";

      int valor;
      try {
        valor = Integer.valueOf(aux).intValue();
      }
      catch ( NumberFormatException e ) {
        valor = 0;
      }
      return valor;
  }

  public static long readLong( String msg ) {
      return readLong( msg, "Long");
  }
  
  public static long readLong( String msg, String titulo )
  {
      String aux;
      aux = JOptionPane.showInputDialog(null,msg,titulo,JOptionPane.QUESTION_MESSAGE);
      if (aux == null || aux.isEmpty())
         aux = "";

      long valor;
      try {
        valor = Long.valueOf(aux).longValue();
      }
      catch ( NumberFormatException e ) {
        valor = 0;
      }
      return valor;
  }
  
  public static float readFloat( String msg ) {
      return readFloat( msg, "Float");
  }
  
  public static float readFloat( String msg, String titulo )
  {
      String aux;
      aux = JOptionPane.showInputDialog(null,msg,titulo,JOptionPane.QUESTION_MESSAGE);
      if (aux == null || aux.isEmpty())
         aux = "";

      float valor;
      try {
        valor = Float.valueOf(aux).floatValue();
      }
      catch ( NumberFormatException e ) {
        valor = 0;
      }
      return valor;
  }
  
  public static double readDouble( String msg ) {
      return readDouble( msg, "Double");
  }
  
  public static double readDouble( String msg, String titulo )
  {
      String aux;
      aux = JOptionPane.showInputDialog(null,msg,titulo,JOptionPane.QUESTION_MESSAGE);
      if (aux == null || aux.isEmpty())
         aux = "";

      double valor;
      try {
        valor = Double.valueOf(aux).doubleValue();
      }
      catch ( NumberFormatException e ) {
        valor = 0;
      }
      return valor;
  }
  
  public static String readString( String msg ) {
      return readString( msg, "String");
  }
  
  public static String readString( String msg, String titulo )
  {
      String aux;
      aux = JOptionPane.showInputDialog(null,msg,titulo,JOptionPane.QUESTION_MESSAGE);
      if (aux == null || aux.isEmpty())
         aux = "";
      return aux;
  }

  public static int selectList( String msg, TLista L )
  {
      return gui.selectList(msg,L,"Lista");
  }
    
  public static int selectList( String msg, TLista L, String titulo  )
  {
      if ( L.cantidad() == 0 )
          return -1;
      Object lista[] = new Object[L.cantidad()];
      for( int i=0; i <L.cantidad(); i++ )
          lista[i] = L.obtener(i);
      return selectList(msg,lista,titulo);
  }
  
  public static int selectList( String msg, Object lista[], int length )
  {
      return gui.selectList(msg,lista,length,"Lista");
  }
  
  public static int selectList( String msg, Object lista[], int length, String titulo )
  {
      if ( length == -1 )
          return -1;
      Object listao[] = new Object[length];
      for(int i = 0; i < length; i++)
          listao[i] = lista[i];
      return selectList( msg, listao, titulo );
  }

  
  public static int selectList( String msg, Object lista[] ) {
      return selectList(msg,lista,"Lista");
  }
  
  public static int selectList( String msg, Object lista[], String titulo )
  {
        if ( lista == null || lista.length == 0 )
            return -1;
        
        Object selecc;
        selecc = JOptionPane.showInputDialog(
                null,
                msg, titulo,
                JOptionPane.OK_CANCEL_OPTION,
                null,
                lista,lista[0]);
        for (int i=0; i<lista.length; i++)
            if ( selecc == lista[i] )
                return i;
        return -1;
  }
  
  public static void showInfoMessage( String msg ) {
      showInfoMessage( msg, "Información" );
  }
  
  public static void showInfoMessage( String msg, String titulo ) {
      showMessage(msg,titulo,JOptionPane.INFORMATION_MESSAGE);
  }

  public static void showErrorMessage( String msg ) {
      showInfoMessage( msg, "Error" );
  }
  
  public static void showErrorMessage( String msg, String titulo ) {
      showMessage(msg,titulo,JOptionPane.ERROR_MESSAGE);
  }

  private static void showMessage( String msg, String titulo, int tipo ) {
     JOptionPane.showMessageDialog(null, msg, titulo, tipo);
  }
  
}
