package dao;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.DBuffer;

public class DBufferDAO {
	
	public DBuffer GetBufferState() {
		DBuffer bf=null;
		try {
			DbConfig.Connect();
			String sql = "Select (1- (phy.value / ( cons.value + db.value - phy.value)))*100 value "
					+ "from v$sysstat phy, v$sysstat cons, v$sysstat db where phy.name ='physical reads' "
					+ "and cons.name ='consistent gets' and   db.name ='db block gets ’";
			DbConfig.pst= DbConfig.con.prepareStatement(sql);
            DbConfig.rs= DbConfig.pst.executeQuery(sql);
            
            if(DbConfig.rs.next()){
 
				int value = DbConfig.rs.getInt("value");
				bf = new DBuffer(value);
            }
		
            }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            }

		return bf;
		
	}
	
	public void setSize(int size) {
		// TODO Auto-generated method stub
		try{
			DbConfig.Connect();
	        String sql="ALTER SYSTEM SET DB_BLOCK_BUFFERS ='"+size+"'";
	        DbConfig.update(sql);
	        DbConfig.disconnect();
			
			
		 } catch (SQLException ex) {
	         JOptionPane.showMessageDialog(null, ex);
	}

}
	
	

	}
	
