import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> ads = new ArrayList<>();

        String showAllQuery = "SELECT * FROM ads";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(showAllQuery);

        while(rs.next()){
            ads.add(new Ad(
                    rs.getInt("id"),
                    rs.getInt("user_id"),
                    rs.getString("title"),
                    rs.getString("description") ));
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = String.format(
                "INSERT INTO ads (user_id, title, description) " +
                "values (%d, '%s', '%s')",
                ad.getUserId(), ad.getTitle(), ad.getDescription());

        Statement stmt = connection.createStatement();
        long id = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        return id;
    }


    public static void main(String[] args) throws SQLException {
        Ads sqlDao = DaoFactory.getAdsDao();

//        Ad newAd = new Ad(1, "exercise", "pretty");
//        sqlDao.insert(new Ad(1, "exercise", "pretty confusing"));

//        sqlDao.insert(newAd);

        Config config = new Config();
        Ads dao = new MySQLAdsDao(config);
        List<Ad> ads = dao.all();
        for (Ad ad:ads){
            System.out.println(ad.getId());
            System.out.println(ad.getTitle());
            System.out.println(ad.getDescription());
        }
    }
}
