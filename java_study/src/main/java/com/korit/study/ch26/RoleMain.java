package main.java.com.korit.study.ch26;

import java.util.List;

public class RoleMain {
    public static void main(String[] args) {
        Role admin = Role.ADMIN;
        Role user = Role.USER;
        Role manager = Role.MANAGER;

        System.out.println(admin);
        System.out.println(user);
        System.out.println(manager);
        
        /// ////////////////////////////////////////////////////////
        Role admin2 = Role.valueOf("ADMIN");
        Role user2 = Role.valueOf("USER");
        Role manager2 = Role.valueOf("MANAGER");
        // 위와 동일

        System.out.println(admin2);
        System.out.println(user2);
        System.out.println(manager2);

        /// ////////////////////////////////////////////////////////

        List<String> roles = List.of("ADMIN", "USER");
        List<String> roles2 = List.of("ADMIN", "MANAGER");
        
        for (String roleName : roles) {
            System.out.println(Role.valueOf(roleName));
        }
    }
}
