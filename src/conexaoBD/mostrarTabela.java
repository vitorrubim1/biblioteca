
package conexaobd;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class mostrarTabela extends AbstractTableModel {
    
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public mostrarTabela(ArrayList lin,String[] col) {
        setLinhas(lin);
        setColunas(col);
    }
    
    public ArrayList getLinhas() {
        return linhas;
    }
    
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }
    
    public String[] getColunas() {
        return colunas;
    }
    
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    public int getColumnCount() {
        return getColunas().length;
    }
    
    public int getRowCount() {
        return getLinhas().size();
    }
    
    public String getColumnName(int numCol) {
        return getColunas()[numCol];
    }
    
    public Object getValueAt(int numLin, int numCol) {
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
}
