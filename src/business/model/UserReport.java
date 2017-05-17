package business.model;

import business.control.UserControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class UserReport extends StatisticsReport {


    @Override
    protected List<String> generateList() {
        UserControl userControl = UserControl.getInstance();

        Map<String, User> users = userControl.getAllUsers();

        return new ArrayList<>(users.keySet());
    }
}
