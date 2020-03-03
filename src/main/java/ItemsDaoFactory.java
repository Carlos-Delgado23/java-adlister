public class ItemsDaoFactory {
    private static Items itemsDao;

    public static Items getItemsDao(){
        if (itemsDao == null){
            itemsDao = new ListItemsDao();
        }
        return itemsDao;
    }
}
