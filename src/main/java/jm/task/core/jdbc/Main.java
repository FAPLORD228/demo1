package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.resource.beans.container.spi.FallbackContainedBean;

import java.sql.Connection;
import java.sql.Driver;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
       userService.createUsersTable();
       userService.saveUser("Denis", "Krasov", (byte)22);
       userService.saveUser("Ivan", "Krasov", (byte)23);
       System.out.println(userService.getAllUsers());
       userService.removeUserById(2);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        System.out.println(userService.getAllUsers());
    }
    }