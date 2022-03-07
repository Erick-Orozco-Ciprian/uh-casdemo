package edu.hawaii.its.casdemo.access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hawaii.its.casdemo.repository.AuthorizationRepository;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    /*
     * *****
     * Note: Replace this with the actual rules for your system.
     * *****
     */

    @Autowired
    private AuthorizationRepository authorizationRepository;

    @Override
    public RoleHolder fetchRoles(String uhUuid) {
        return fetchRoles(uhUuid, true);
    }

    @Override
    public RoleHolder fetchRoles(String uhUuid, boolean isAuthenticated) {
        RoleHolder roleHolder = new RoleHolder();

        if (!isAuthenticated) {
            // User not logged in.
            roleHolder.add(Role.ANONYMOUS);
            return roleHolder;
        }

        ///List<String> roles       authorizationRepository.        

        roleHolder.add(Role.USER);
        roleHolder.add(Role.ADMIN);

        return roleHolder;
    }

}
