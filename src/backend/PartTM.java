package backend;

import javax.swing.table.DefaultTableModel;

public class PartTM extends DefaultTableModel{
	
	public PartTM (Object fildNames[], int rows){
		super(fildNames, rows);
	}
		
	public boolean isCellEditable(int row, int col) {
		if(col == 0) {return true;}
		return false;
	}
	
	public Class<?> getColumnClass(int index){
		if (index == 0) return(Boolean.class);
		else if (index == 4 || index == 1) return(Integer.class);
		return(String.class);
	}

}
