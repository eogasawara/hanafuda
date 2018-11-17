package br.gpca.survey;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAO {
    private Connection conn;
    public Connection getConn() {
        return conn;
    }
     public void setConn(Connection aConn) {
        conn = aConn;
    }
 	public int grava(Survey gameData) {
		try {
			PreparedStatement insStapp = conn.prepareStatement(
					"insert into game(androidversion, androidlanguage, deviceinfo, appversion, day, month, year, hour, minute, "
							+ "playername, playerpoints, playercombos, computeralgorithm, computerpoints, computercombos)"
							+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			insStapp.setString(1, gameData.androidVersion);
			insStapp.setString(2, gameData.androidLanguage);
			insStapp.setString(3, gameData.deviceInfo);
			insStapp.setString(4, gameData.appVersion);
			insStapp.setInt(5, gameData.day);
			insStapp.setInt(6, gameData.month);
			insStapp.setInt(7, gameData.year);
			insStapp.setInt(8, gameData.hour);
			insStapp.setInt(9, gameData.minute);
			insStapp.setString(10, gameData.playerName);
			insStapp.setInt(11, gameData.playerPoints);
			insStapp.setString(12, gameData.playerCombos);
			insStapp.setString(13, gameData.computerAlgorithm);
			insStapp.setInt(14, gameData.computerPoints);
			insStapp.setString(15, gameData.computerCombos);
			insStapp.executeUpdate();

			PreparedStatement getRank = conn.prepareStatement("select position from v_ranking where playername=?");
			getRank.setString(1, gameData.playerName);
			ResultSet rs = getRank.executeQuery();
			rs.next();
			int position = rs.getInt("position");
			return position;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}    
}