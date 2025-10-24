package main.java.com.korit.study.ch26;

public enum Role {
    ADMIN("ROLL_ADMIN", "관리자"),
    USER("ROLE_USER", "사용자"),
    MANAGER("ROLE_MANAGER", "매니저"),
    ;

    private final String roleName;
    private final String roleNameKor;

    Role(String roleName, String roleNameKor) {
        this.roleName = roleName;
        this.roleNameKor = roleNameKor;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getRoleNameKor() {
        return roleNameKor;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", roleNameKor='" + roleNameKor + '\'' +
                '}';
    }
}
