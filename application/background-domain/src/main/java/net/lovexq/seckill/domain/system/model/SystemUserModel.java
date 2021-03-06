package net.lovexq.seckill.domain.system.model;

import net.lovexq.seckill.common.model.BasicModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * SysUser - 系统用户
 *
 * @author LuPindong
 * @date 2015年9月23日 下午9:54:35
 */
@Entity
@Table(name = "system_user")
public class SystemUserModel extends BasicModel implements Serializable {

    /**
     * 主键
     */
    @Id
    @Column(name = "id", length = 20, updatable = false)
    private Long id;

    /**
     * 账号
     */
    @Column(name = "account", length = 100, nullable = false, unique = true)
    private String account;

    /**
     * 密码
     */
    @Column(name = "password", length = 255, nullable = false)
    private String password;

    /**
     * 姓名
     */
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    /**
     * 手机
     */
    @Column(name = "mobile", length = 50)
    private String mobile;

    /**
     * 邮箱
     */
    @Column(name = "email", length = 100)
    private String email;

    /**
     * 状态
     */
    @Column(name = "state", length = 1, nullable = false)
    private Boolean state;

    /**
     * 是否封号
     */
    @Column(name = "locked", length = 1, nullable = false)
    private Boolean locked;

    public SystemUserModel() {
        super();
    }

    public SystemUserModel(Long id, String account, String password, String email) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = account;
        this.email = email;
        this.locked = false;
        this.state = true;
    }

    public SystemUserModel(Long id, String account, String password, String name, String email) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.email = email;
        this.locked = false;
        this.state = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SystemUserModel)) return false;
        SystemUserModel that = (SystemUserModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SystemUserModel{");
        sb.append("id=").append(id);
        sb.append(", account='").append(account).append('\'');
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}