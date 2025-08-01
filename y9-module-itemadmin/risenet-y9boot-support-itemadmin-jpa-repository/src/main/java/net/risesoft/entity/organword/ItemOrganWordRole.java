package net.risesoft.entity.organword;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Comment;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qinman
 * @author zhangchongjie
 * @date 2022/12/20
 */
@NoArgsConstructor
@Data
@Entity
@Table(name = "FF_ITEM_ORGANWORD_ROLE")
@org.hibernate.annotations.Table(comment = "事项和编号框绑定关系对应的角色", appliesTo = "FF_ITEM_ORGANWORD_ROLE")
public class ItemOrganWordRole implements Serializable {

    private static final long serialVersionUID = 4810229643584028112L;

    @Comment("主键")
    @Id
    @Column(name = "ID", length = 38, nullable = false)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "assigned")
    private String id;

    @Comment("事项和编号框的绑定关系")
    @Column(name = "ITEMORGANWORDBINDID", length = 50, nullable = false)
    private String itemOrganWordBindId;

    @Comment("角色Id")
    @Column(name = "ROLEID", length = 50, nullable = false)
    private String roleId;

    /**
     * 角色名称
     */
    @Transient
    private String roleName;
}
