//package com.project.restp1.config;
//
//import com.project.restp1.model.dataDB.Role;
//import com.project.restp1.model.dataDB.UserRole;
//import com.project.restp1.repository.authentication.UserRoleRepository;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//@Component
//public class DataInitializer {
//
//    private final UserRoleRepository userRoleRepository;
//
//    public DataInitializer(UserRoleRepository userRoleRepository) {
//        this.userRoleRepository = userRoleRepository;
//
//    }
//
//    @PostConstruct
//    public void initData() {
//        UserRole userRole = new UserRole();
//        userRole.setName(Role.ROLE_USER);
//        UserRole userRole1 = new UserRole();
//        userRole1.setName(Role.ROLE_ADMIN);
//        UserRole userRole2 = new UserRole();
//        userRole2.setName(Role.ROLE_MOD);
//
//        userRoleRepository.save(userRole);
//        userRoleRepository.save(userRole1);
//        userRoleRepository.save(userRole2);
//
//    }
//}
