package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

import java.util.List;

/**
 * Created by Aleksandr on 31.10.2018.
 */
public class EditUserView implements View{

    private Controller controller = new Controller();

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void refresh(ModelData modelData) {
        User user = modelData.getActiveUser();
        System.out.println("User to be edited:");
        System.out.println("\t" + user.toString());
        System.out.println("===================================================");

    }

    public void fireEventUserDeleted(long id){
        controller.onUserDelete(id);
    }

    public void fireEventUserChanged(String name, long id, int level){
        controller.onUserChange(name,id,level);
    }



}
